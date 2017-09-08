package com.sywwifi.api.controller;

import com.sywwifi.api.pojo.User;
import com.sywwifi.api.service.GatewayService;
import com.sywwifi.api.service.UserService;
import com.sywwifi.api.util.MD5Util;
import com.sywwifi.api.util.MyDateUtil;
import com.sywwifi.api.util.ZgjGetMD5;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 网关门户控制器
 * <p>
 * 本控制器功能需求
 * <p>
 * 通过接受不同的GWID 来识别是哪一个工地
 * <p>
 * 本类设计如下方法
 * <p>
 * 通过输入网关mac地址往数据库中记录网关和工地的关联
 * <p>
 * mac -> db -> wg <-> gd
 * <p>
 * 数据库中网关和工地的关联记录如下
 * <p>
 * 网关 GWID_MAC
 * 工地 GD_NAME
 * <p>
 * 通过往数据库中获取验证得到网关所属工地信息
 *
 * @author 魏来 create on 2017/7/21
 * @version 1.0.0
 */
@Slf4j
@RestController
@Api(value = "测试任务管理", tags = {"落地页管理API"}, description = "落地页 相关操作")
public class PortalController {

    private final GatewayService gatewayService;
    private final UserService userService;

    @Autowired
    public PortalController(GatewayService gatewayService, UserService userService) {
        this.gatewayService = gatewayService;
        this.userService = userService;
    }

    /**
     * portal页展示接口
     * <p>
     * 接口验证成功了
     *
     * @param gatewayId 网关ID
     * @param timeStamp 时间戳
     * @param sign      portal验证大小
     * @return 结果
     */
    @RequestMapping(value = "/portal", params = "CMD=PORTAL")
    @ApiOperation(value = "落地页", notes = "落地页显示", produces = "application/json")
    public Map<String, Object> portal(
            @RequestParam("TS") String timeStamp,
            @RequestParam("GWID") String gatewayId,
            @RequestParam("sign") String sign,
            HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<>();
        log.info("gwid:" + gatewayId);
        String str = "PORTAL" + gatewayId + timeStamp + "SECURITYKEY";
        str = MD5Util.toMD5(str);
        if (!sign.equals(str)) {
            modelMap.put("result", "-102");
            modelMap.put("message", "INVALID SIGNATURE");
            return modelMap;
        }
        modelMap.put("version", "2.2");
        String url = gatewayService.getGatewayByMac(gatewayId).getData().getGatewayName();
        modelMap.put("md5", ZgjGetMD5.getMD5(getPortalFile(request, url)));
        modelMap.put("size", getPortalFile(request, url).length());
        modelMap.put("url", "http://139.196.243.110:8080/syw-web/" + url + "/portal.html");
        modelMap.put("Result", 0);
        return modelMap;
    }

    /**
     * portal页展示接口
     * <p>
     * 接口验证成功了
     *
     * @param gatewayId 网关ID
     * @param timeStamp 时间戳
     * @param sign      portal验证大小
     * @return 结果
     */
    @RequestMapping(value = "/portal2", params = "CMD=PORTAL")
    @ApiOperation(value = "落地页2", notes = "落地页显示2", produces = "application/json")
    public Map<String, Object> portal2(
            @RequestParam("TS") String timeStamp,
            @RequestParam("GWID") String gatewayId,
            @RequestParam("sign") String sign,
            HttpServletRequest request) {
        Map<String, Object> modelMap = new HashMap<>();
        log.info("gwid:" + gatewayId);
        String str = "PORTAL" + gatewayId + timeStamp + "SECURITYKEY";
        str = MD5Util.toMD5(str);
        if (!sign.equals(str)) {
            modelMap.put("result", "-102");
            modelMap.put("message", "INVALID SIGNATURE");
            return modelMap;
        }
        modelMap.put("version", "2.2");
        String url = gatewayService.getGatewayByMac(gatewayId).getData().getGatewayName();
        modelMap.put("md5", ZgjGetMD5.getMD5(getPortalFile(request)));
        modelMap.put("size", getPortalFile(request).length());
        modelMap.put("url", "http://139.196.243.110:8080/syw-web/page-0/portal.html");
        modelMap.put("Result", 0);
        return modelMap;
    }

    /**
     * 网关调用云端HTTP登录接口
     *
     * @param userPhone 用户账号
     * @param gatewayId 网关ID
     * @param mac       手机或者PCmac
     * @param extra     冗余
     * @param timeStamp 时间戳
     * @param sign      是MD5签名这个签名是将前面出现的所有参数“值”按照参数“名”升序排列后相连，再加上sharekey进行MD5。例如：MD5
     *                  (LOGINABC12:34:56:78:90:ab20160912163633138567890sharekey)
     * @return 结果
     */
    @RequestMapping(value = "/portal", params = "CMD=LOGIN")
    @ApiOperation(value = "网关登录命令确认", notes = "网关登录命令确认", produces = "application/json")
    public Map<String, Object> login(
            @RequestParam("USER") String userPhone,
            @RequestParam("GWID") String gatewayId,
            @RequestParam("MAC") String mac,
            @RequestParam("EXTRA") String extra,
            @RequestParam("TS") Long timeStamp,
            @RequestParam("sign") String sign) {
        Map<String, Object> map = new HashMap<>();
        String[] sings = new String[]{"TS", "GWID", "CMD", "USER", "MAC", "EXTRA"};
        Arrays.sort(sings);
        StringBuilder stringBuilder = new StringBuilder();
        for (String key :
                sings) {
            switch (key) {
                case "TS":
                    stringBuilder.append(timeStamp);
                    break;
                case "GWID":
                    stringBuilder.append(gatewayId);
                    break;
                case "CMD":
                    stringBuilder.append("LOGIN");
                    break;
                case "USER":
                    stringBuilder.append(userPhone);
                    break;
                case "EXTRA":
                    stringBuilder.append(extra);
                    break;
            }
        }
        stringBuilder.append("SECURITYKEY");
        String str = MD5Util.toMD5(stringBuilder.toString());
        Long nowTime = Long.parseLong(MyDateUtil.getNowTimeStamp());
        if ((nowTime - timeStamp) / 100 >= 1) {// 如果是一分钟之前
            map.put("result", "-101");
            map.put("message", "INVALID TIMESTAMP");
            return map;
        }
        if (!sign.equals(str)) {// 如果数据不完整
            map.put("result", "-102");
            map.put("message", "INVALID SIGNATURE");
            return map;
        }
        User user = userService.getUserByPhone(userPhone);
        if (user == null) {// 用户不存在
            map.put("result", "-103");
            map.put("message", "INVALID USER");
            return map;
        }
        Date nowDate = new Date();
        if (nowDate.getTime() < user.getUserWhenLogin().getTime()) {// 用户未过期
            map.put("trial", false);// 若用户在有效期内，则trial为false
            String userWhenLong = MyDateUtil.getTimeStamp("yyyyMMddHHmmss", user.getUserWhenLogin());
            map.put("expire", userWhenLong);
            //  expire 为用户购买服务的截止时间；若用户超出有效期但在试用期内，则trial为true，expire为本次试用的截止时间。
        }
        map.put("result", "0");
        map.put("user", userPhone);
        map.put("mac", mac);
        return map;
    }

    private File getPortalFile(HttpServletRequest request, String url) {
        String path = request.getSession().getServletContext().getRealPath("");
        File tomcatFile = new File(path);
        tomcatFile = tomcatFile.getParentFile();
        tomcatFile = tomcatFile.getParentFile();
        String pathStr = tomcatFile.getPath() + "/webapps/syw-web/" + url + "/portal.html";
        return new File(pathStr);
    }

    private File getPortalFile(HttpServletRequest request) {
        String path = request.getSession().getServletContext().getRealPath("");
        File tomcatFile = new File(path);
        tomcatFile = tomcatFile.getParentFile();
        tomcatFile = tomcatFile.getParentFile();
        String pathStr = tomcatFile.getPath() + "/webapps/syw-web/page-0/portal.html";
        return new File(pathStr);
    }

}
