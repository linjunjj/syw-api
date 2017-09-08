package com.sywwifi.api.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URLDecoder;

@Slf4j
public class SendMsgUtil {

    /**
     * 接口发送验证码
     *
     * @param phoneNum 手机号
     * @return
     */
    public static String sendSCode(String phoneNum) {
        String sCode = Integer.toString((int) ((Math.random() * 9 + 1) * 1000));
        String content = "亲爱的用户，您的验证码是" + sCode + ",1分钟内有效。";// 短信内容
        realSend(phoneNum, content);
        return sCode;
    }

    /**
     * 接口发送自定义消息
     *
     * @param phoneNum 手机号
     * @return
     */
    public static void sendMsg(String phoneNum, String content) {
        realSend(phoneNum, content);
    }


    /**
     * 发送短信验证码
     *
     * @param phoneNum
     * @param content
     */
    private static void realSend(String phoneNum, String content) {
        String uri = "http://222.73.117.156/msg/";// 应用地址
        String account = "yataizhongjian";// 账号
        String password = "Tch456789";// 密码
        try {
            String returnString = batchSend(uri, account, password, phoneNum, content);
            log.info(returnString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 批量发送
     *
     * @param uri
     * @param account
     * @param password
     * @param mobiles
     * @param content
     * @return
     * @throws Exception
     */
    private static String batchSend(String uri, String account, String password, String mobiles, String content) throws Exception {

        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod();

        try {
            URI base = new URI(uri, false);
            method.setURI(new URI(base, "HttpBatchSendSM", false));
            method.setQueryString(
                    new NameValuePair[]{
                            new NameValuePair("account", account),
                            new NameValuePair("pswd", password),
                            new NameValuePair("mobile", mobiles),
                            new NameValuePair("needstatus", String.valueOf(true)),
                            new NameValuePair("msg", content),
                            new NameValuePair("product", null),
                            new NameValuePair("extno", null)});
            int result = client.executeMethod(method);
            if (result != 200) {
                throw new Exception("HTTP ERROR Status: " + method.getStatusCode() + ":" + method.getStatusText());
            } else {
                InputStream in = method.getResponseBodyAsStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                while ((len = in.read(buffer)) != -1) {
                    baos.write(buffer, 0, len);
                }
                return URLDecoder.decode(baos.toString(), "UTF-8");
            }
        } finally {
            method.releaseConnection();
        }
    }
}
