package com.sywwifi.api.util;

import java.util.Random;

/**
 * ID生成器
 *
 * @author 魏来
 * @version 1.0.0
 */
public final class IDUtil {

    /**
     * 获取表Id
     * 通过时间戳和随机数的方式
     *
     * @return 结果
     */
    public static synchronized String getId() {
        Random random = new Random();
        int temp = random.nextInt(900000) % (900000 - 100000 + 1) + 100000;
        return System.currentTimeMillis() + "" + temp;
    }

    /**
     * 获取表Id
     * 通过时间戳和随机数的方式
     *
     * @return 结果
     */
    public static synchronized String getId2() {
        return System.currentTimeMillis() + "" + getRandom(900000, 100000);
    }

    /**
     * 生成随机数
     *
     * @param min 起始值
     * @param max 结束值
     * @return 结果
     */
    public static synchronized String getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) % (max - min + 1) + min + "";
    }

    /**
     * 生成6位随机数
     */
    public static synchronized String getSixBitRandom() {
        return getRandom(100000, 999999);
    }

    public static void main(String[] args) {
        System.out.println(getId());
        System.out.println(getId2());
        System.out.println(getRandom(100000, 999999));
    }


}
