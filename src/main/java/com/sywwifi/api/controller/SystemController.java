package com.sywwifi.api.controller;

import com.sywwifi.api.config.SwiftpassConfig;
import com.sywwifi.api.enums.ResultEnums;
import com.sywwifi.api.util.*;
import com.sywwifi.api.commons.ResponseInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * 系统控制器
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
@Slf4j
@RestController
@RequestMapping("/system/")
@Api(value = "测试任务管理", tags = {"系统管理API"}, description = "系统 相关操作")
public class SystemController {

    /**
     * 短信验证码
     *
     * @param phone 手机号码
     * @return 结果
     */
    @PostMapping(value = "yzm")
    @ApiOperation(value = "获取验证码", notes = "获取验证码", produces = "application/json")
    public ResponseInfo yzm(String phone) {
        String result = SendMsgUtil.sendSCode(phone);

        return ServerResponseUtil.success(result);

    }

    /**
     * 自定义短信群发
     *
     * @param phone 收号码
     * @param msg   短信内容
     * @return 结果
     */
    @PostMapping(value = "dx")
    @ApiOperation(value = "发送自定义短信", notes = "发送自定义短信", produces = "application/json")
    public ResponseInfo dx(String phone, String msg) {
        SendMsgUtil.sendMsg(phone, msg);
        return ServerResponseUtil.success();
    }

    /**
     * 统一预下单
     *
     * @param req
     * @param resp
     */
    @PostMapping("pay")
    public void pay(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        SortedMap<String, String> map = XmlUtils.getParameterMap(req);
        String userId = map.get("userId");
        System.out.println("userId:" + userId);
        map.remove("userId");
//        map.put("service", "unified.trade.pay");
        map.put("service", "pay.weixin.raw.app");
        map.put("appid", "wxb4ab2495fb0b5b42");
        map.put("mch_id", SwiftpassConfig.mch_id);
        map.put("mch_create_ip", req.getRemoteAddr());
        map.put("out_trade_no", IDUtil.getId());
        map.put("body", "测试商品");
        map.put("total_fee", "100");
        map.put("notify_url", SwiftpassConfig.notify_url);
        map.put("nonce_str", String.valueOf(new Date().getTime()));

        Map<String, String> params = SignUtils.paraFilter(map);
        StringBuilder buf = new StringBuilder((params.size() + 1) * 10);
        SignUtils.buildPayParams(buf, params, false);
        String preStr = buf.toString();
        String sign = MD5.sign(preStr, "&key=" + SwiftpassConfig.key, "utf-8");
        map.put("sign", sign);
        String reqUrl = SwiftpassConfig.req_url;
        System.out.println("reqUrl：" + reqUrl);
        System.out.println("reqParams:" + XmlUtils.parseXML(map));
        CloseableHttpResponse response = null;
        CloseableHttpClient client = null;
        String res;
        try {
            HttpPost httpPost = new HttpPost(reqUrl);
            StringEntity entityParams = new StringEntity(XmlUtils.parseXML(map), "utf-8");
            httpPost.setEntity(entityParams);
            client = HttpClients.createDefault();
            response = client.execute(httpPost);
            if (response != null && response.getEntity() != null) {
                Map<String, String> resultMap = XmlUtils.toMap(EntityUtils.toByteArray(response.getEntity()), "utf-8");
                res = XmlUtils.toXml(resultMap);
                log.info("请求结果:\n{}", res);
                if (resultMap.containsKey("sign")) {
                    if (!SignUtils.checkParam(resultMap, SwiftpassConfig.key)) {
                        res = "验证签名不通过";
                    } else {
                        if ("0".equals(resultMap.get("status")) && "0".equals(resultMap.get("result_code"))) {
                            String token_id = resultMap.get("token_id");
                            String services = resultMap.get("services");
                        } else {
                            req.setAttribute("result", res);
                        }
                    }
                }
            } else {
                res = "操作失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = "系统异常";
        } finally {
            if (response != null) {
                response.close();
            }
            if (client != null) {
                client.close();
            }
        }
        if (res.startsWith("<")) {
            resp.setHeader("Content-type", "text/xml;charset=UTF-8");
        } else {
            resp.setHeader("Content-type", "text/html;charset=UTF-8");
        }
        resp.getWriter().write(res);
    }

    /**
     * 统一预下单
     *
     * @param userId   用户ID
     * @param totalFee 金额总数 单位分
     * @return 结果
     * @throws IOException IO异常
     */
    @PostMapping(
            value = "pay2",
            headers = {"Accept=application/xml"},
            produces = {"application/xml;charset=UTF-8"}
    )
    public Map<String, String> pay2(String userId, String totalFee, HttpServletRequest request) throws IOException {
        log.info("userId:{}", userId);
        SortedMap<String, String> map = new TreeMap<>();
        map.put("service", "pay.weixin.raw.app");
        map.put("appid", "wxb4ab2495fb0b5b42");
        map.put("mch_id", SwiftpassConfig.mch_id);
        map.put("mch_create_ip", request.getRemoteAddr());
        map.put("out_trade_no", IDUtil.getId());
        map.put("body", "测试商品");
        map.put("total_fee", totalFee);
        map.put("notify_url", SwiftpassConfig.notify_url);
        map.put("nonce_str", String.valueOf(new Date().getTime()));

        Map<String, String> params = SignUtils.paraFilter(map);
        StringBuilder buf = new StringBuilder((params.size() + 1) * 10);
        SignUtils.buildPayParams(buf, params, false);
        String preStr = buf.toString();
        String sign = MD5.sign(preStr, "&key=" + SwiftpassConfig.key, "utf-8");
        map.put("sign", sign);
        String reqUrl = SwiftpassConfig.req_url;
        System.out.println("reqUrl：" + reqUrl);
        System.out.println("reqParams:" + XmlUtils.parseXML(map));
        CloseableHttpResponse response = null;
        CloseableHttpClient client = null;
        String res;
        try {
            HttpPost httpPost = new HttpPost(reqUrl);
            StringEntity entityParams = new StringEntity(XmlUtils.parseXML(map), "utf-8");
            httpPost.setEntity(entityParams);
            client = HttpClients.createDefault();
            response = client.execute(httpPost);
            if (response != null && response.getEntity() != null) {
                Map<String, String> resultMap = XmlUtils.toMap(EntityUtils.toByteArray(response.getEntity()), "utf-8");
                res = XmlUtils.toXml(resultMap);
                log.info("请求结果:\n{}", res);
                if (resultMap.containsKey("sign")) {
                    if (!SignUtils.checkParam(resultMap, SwiftpassConfig.key)) {
                        res = "验证签名不通过";
                    } else {
                        if ("0".equals(resultMap.get("status")) && "0".equals(resultMap.get("result_code"))) {
                            String token_id = resultMap.get("token_id");
                            String services = resultMap.get("services");
                        } else {
                            request.setAttribute("result", res);
                        }
                    }
                }
            } else {
                res = "操作失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = "系统异常";
        } finally {
            if (response != null) {
                response.close();
            }
            if (client != null) {
                client.close();
            }
        }
        return map;
    }

    /**
     * 统一预下单
     *
     * @param req
     * @param resp
     */
    @PostMapping("pay3")
    public void pay3(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        SortedMap<String, String> map = XmlUtils.getParameterMap(req);
        String userId = map.get("userId");
        System.out.println("userId:" + userId);
        map.remove("userId");
        map.put("service", "unified.trade.pay");
//        map.put("service", "pay.weixin.raw.app");
//        map.put("appid", "wxb4ab2495fb0b5b42");
        map.put("mch_id", SwiftpassConfig.mch_id);
        map.put("mch_create_ip", req.getRemoteAddr());
        map.put("out_trade_no", IDUtil.getId());
        map.put("body", "测试商品");
        map.put("total_fee", "100");
        map.put("notify_url", SwiftpassConfig.notify_url);
        map.put("nonce_str", String.valueOf(new Date().getTime()));

        Map<String, String> params = SignUtils.paraFilter(map);
        StringBuilder buf = new StringBuilder((params.size() + 1) * 10);
        SignUtils.buildPayParams(buf, params, false);
        String preStr = buf.toString();
        String sign = MD5.sign(preStr, "&key=" + SwiftpassConfig.key, "utf-8");
        map.put("sign", sign);
        String reqUrl = SwiftpassConfig.req_url;
        System.out.println("reqUrl：" + reqUrl);
        System.out.println("reqParams:" + XmlUtils.parseXML(map));
        CloseableHttpResponse response = null;
        CloseableHttpClient client = null;
        String res;
        try {
            HttpPost httpPost = new HttpPost(reqUrl);
            StringEntity entityParams = new StringEntity(XmlUtils.parseXML(map), "utf-8");
            httpPost.setEntity(entityParams);
            client = HttpClients.createDefault();
            response = client.execute(httpPost);
            if (response != null && response.getEntity() != null) {
                Map<String, String> resultMap = XmlUtils.toMap(EntityUtils.toByteArray(response.getEntity()), "utf-8");
                res = XmlUtils.toXml(resultMap);
                log.info("请求结果:\n{}", res);
                if (resultMap.containsKey("sign")) {
                    if (!SignUtils.checkParam(resultMap, SwiftpassConfig.key)) {
                        res = "验证签名不通过";
                    } else {
                        if ("0".equals(resultMap.get("status")) && "0".equals(resultMap.get("result_code"))) {
                            String token_id = resultMap.get("token_id");
                            String services = resultMap.get("services");
                        } else {
                            req.setAttribute("result", res);
                        }
                    }
                }
            } else {
                res = "操作失败";
            }
        } catch (Exception e) {
            e.printStackTrace();
            res = "系统异常";
        } finally {
            if (response != null) {
                response.close();
            }
            if (client != null) {
                client.close();
            }
        }
        if (res.startsWith("<")) {
            resp.setHeader("Content-type", "text/xml;charset=UTF-8");
        } else {
            resp.setHeader("Content-type", "text/html;charset=UTF-8");
        }
        resp.getWriter().write(res);
    }

    /**
     * 通知
     *
     * @param request
     * @param response
     */
    @PostMapping("payResult")
    @ApiOperation(value = "威富通支付回调", notes = "威富通支付回调")
    public void payResult(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            String resString = XmlUtils.parseRequst(request);
            System.out.println("通知内容：" + resString);

            String respString = "fail";
            if (resString != null && !"".equals(resString)) {
                Map<String, String> map = XmlUtils.toMap(resString.getBytes(), "utf-8");
                String res = XmlUtils.toXml(map);
                System.out.println("通知内容：" + res);
                if (map.containsKey("sign")) {
                    if (!SignUtils.checkParam(map, SwiftpassConfig.key)) {
                        res = "验证签名不通过";
                        respString = "fail";
                    } else {
                        String status = map.get("status");
                        if (status != null && "0".equals(status)) {
                            String result_code = map.get("result_code");
                            if (result_code != null && "0".equals(result_code)) {
                                //此处可以在添加相关处理业务，校验通知参数中的商户订单号out_trade_no和金额total_fee是否和商户业务系统的单号和金额是否一致，一致后方可更新数据库表中的记录。

                            }
                        }
                        respString = "success";
                    }
                }
            }
            response.getWriter().write(respString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
