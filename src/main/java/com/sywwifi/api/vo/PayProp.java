package com.sywwifi.api.vo;

import lombok.Data;

/**
 * 支付参数对象
 *
 * @author 魏来 create on 2017/7/28
 * @version 1.0.0
 */
@Data
public class PayProp {

    /**
     * 字段名：接口类型
     * 变量名：service
     * 必填：是
     * 类型：String(32)
     * 说明：接口类型：pay.weixin.raw.app
     */
    private String service;

    /**
     * 字段名：版本号
     * 变量名：version
     * 必填：否
     * 类型：String(8)
     * 说明：版本号，version默认值是2.0。
     */
    private String version;

    /**
     * 字段名：字符集
     * 变量名：charset
     * 必填：否
     * 类型：String(8)
     * 说明：可选值 UTF-8 ，默认为 UTF-8。
     */
    private String charset;

    /**
     * 字段名：签名方式
     * 变量名：sign_type
     * 必填：否
     * 类型：String(8)
     * 说明：签名类型，取值：MD5默认：MD5
     */
    private String signType;

    /**
     * 字段名：商户号
     * 变量名：mch_id
     * 必填：是
     * 类型：String(32)
     * 说明：商户号，由平台分配
     */
    private String mchId;

    /**
     * 字段名：appid
     * 变量名：appid
     * 必填：是
     * 类型：String(32)
     * 说明：商户app对应的微信开发平台移动应用APPID
     */
    private String appId;

    /**
     * 字段名：商户订单号
     * 变量名：out_trade_no
     * 必填：是
     * 类型：String(32)
     * 说明：商户系统内部的订单号,32个字符内、可包含字母，确保在商户系统唯一
     */
    private String outTradeNo;

    /**
     * 字段名：设备号
     * 变量名：device_info
     * 必填：否
     * 类型：String(32)
     * 说明：IOS_SDK_Other(ios设备)  ANDROID_SDK_Other(android设备)
     */
    private String deviceInfo;

    /**
     * 字段名：商品描述
     * 变量名：body
     * 必填：是
     * 类型：String(127)
     * 说明：商品描述
     */
    private String body;

    /**
     * 字段名：附加信息
     * 变量名：attach
     * 必填：否
     * 类型：String(127)
     * 说明：商品附加信息，可做扩展参数
     */
    private String attach;

    /**
     * 字段名：总金额
     * 变量名：total_fee
     * 必填：是
     * 类型：Int
     * 说明：总金额，以分为单位，不允许包含任何字、符号
     */
    private String totalFee;

    /**
     * 字段名：终端IP
     * 变量名：mch_create_ip
     * 必填：是
     * 类型：String(16)
     * 说明：订单生成的机器IP
     */
    private String mchCreateIp;

    /**
     * 字段名：通知地址
     * 变量名：notify_url
     * 必填：是
     * 类型：String(255)
     * 说明：接收平台通知的URL，需给绝对路径，255字符内格式，确保平台能通过互联网访问该地址
     */
    private String notifyUrl;

    /**
     * 字段名：订单生成时间
     * 变量名：time_start
     * 必填：否
     * 类型：String(14)
     * 说明：订单生成时间，格式为yyyyMMddHHmmss,如2009年12月25日9点10分10秒表示为20091225091010。时区为GMT+8Beijing。该时间取自商户服务器
     */
    private String timeStart;

    /**
     * 字段名： 订单超时时间
     * 变量名： time_expire
     * 必填： 否
     * 类型： String(14)
     * 说明： 订单超时时间，格式为yyyyMMddHHmmss,如2009年12月25日9点10分10秒表示为20091225091010。时区为GMT+8Beijing。该时间取自商户服务器
     */
    private String timeExpire;

    /**
     * 字段名：  操作员
     * 变量名：  op_user_id
     * 必填：  否
     * 类型：  String(32)
     * 说明：  操作员帐号,默认为商户号
     */
    private String opUserId;

    /**
     * 字段名：门店编号
     * 变量名：op_shop_id
     * 必填：否
     * 类型：String(32)
     * 说明：
     */
    private String opShopId;

    /**
     * 字段名：限制信用卡
     * 变量名：limit_credit_pay
     * 必填：  否
     * 类型：  String(1)
     * 说明：  限定用户使用时能否使用信用卡，值为1，禁用信用卡，值为0或者不传此参数则不禁用
     */
    private String limitCreditPay;

    /**
     * 字段名：商品标记
     * 变量名：goods_tag
     * 必填： 否
     * 类型： String(32)
     * 说明：商品标记
     */
    private String goodsTag;

    /**
     * 字段名：操作员
     * 变量名：op_user_id
     * 必填：否
     * 类型：String(32)
     * 说明：操作员帐号,默认为商户号
     */
    private String nonceStr;

    /**
     * 字段名：商户APP应用ID
     * 变量名：sub_appid
     * 必填：否
     * 类型：String(32)
     * 说明：微信开放平台审核通过的移动应用AppID
     */
    private String subAppId;

    /**
     * 字段名：  操作员
     * 变量名：  op_user_id
     * 必填：  否
     * 类型：  String(32)
     * 说明：  操作员帐号,默认为商户号
     */
    private String sign;
    
    private String key;

    private String reqUrl;

}
