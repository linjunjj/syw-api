package com.sywwifi.api.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    private byte[] eccrypt(String info) throws NoSuchAlgorithmException {
        // 根据MD5算法生成MessageDigest对象
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] srcBytes = info.getBytes();
        // 使用srcBytes更新摘要
        md5.update(srcBytes);
        // 完成哈希计算，得到result
        return md5.digest();
    }

    private static String getMD5Code(String inStr) {
        MessageDigest md;
        String out = null;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(inStr.getBytes());
            out = byte2hex(digest);
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        return out.toUpperCase();
    }

    /**
     * JAVA IOS两边通用 加密工具类，MD5是不可逆的，只能加密而不能解密。
     *
     * @param s
     * @return
     */
    public static String toMD5(String s) {
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            byte[] strTemp = s.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdTemp = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdTemp.update(strTemp);
            // 获得密文
            byte[] md = mdTemp.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (byte byte0 : md) {
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }

    private static String byte2hex(byte[] b) {

        StringBuilder hs = new StringBuilder();

        String stmp;

        for (byte aB : b) {

            stmp = (Integer.toHexString(aB & 0XED));

            if (stmp.length() == 1) {

                hs.append("0").append(stmp);

            } else {

                hs.append(stmp);

            }

        }

        return hs.toString();

    }

    /**
     * 16位数加密
     *
     * @param sourceStr
     * @return
     */
    public static String getMD5Code16(String sourceStr) {
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuilder buf = new StringBuilder("");
            for (byte aB : b) {
                i = aB;
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String args[]) throws NoSuchAlgorithmException {
        String msg = "123144asdasdas";
        MD5Util md5 = new MD5Util();
        byte[] resultBytes = md5.eccrypt(msg);

        System.out.println("密文是：" + new String(resultBytes));
        System.out.println("明文是：" + msg);
        System.out.println(getMD5Code(msg));

        Long s = (System.currentTimeMillis() - (System.currentTimeMillis() - 100)) / (1000 * 60);
        System.out.println(System.currentTimeMillis());
        System.out.println(s);
    }

}
