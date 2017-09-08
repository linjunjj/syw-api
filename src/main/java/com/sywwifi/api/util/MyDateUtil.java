package com.sywwifi.api.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateUtil {


    private static Calendar fromCal = Calendar.getInstance();

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 获取当前的时间戳默认格式yyyyMMddHHmmss user_aiyuan 2016年10月31日 下午2:37:31
     */
    public static String getNowTimeStamp() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String str = sdf.format(date);
        return str;
    }

    /**
     * 获取当前的时间戳自定义格式user_aiyuan 2016年10月31日 下午2:37:31
     */
    public static String getNowTimeStamp(String format) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String str = sdf.format(date);
        return str;
    }

    /**
     * 获取时间戳根据自定义格式和时间 user_aiyuan 2016年10月31日 下午3:27:40
     *
     * @return
     */
    public static String getTimeStamp(String format, Long date) {
        Date nowdate = new Date(date);
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String str = sdf.format(nowdate);
        return str;
    }

    /**
     * 获取时间戳根据 自定义日期格式和时间 user_aiyuan 2016年10月31日 下午3:27:40
     *
     * @return
     */
    public static String getTimeStamp(String format, Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String str = sdf.format(date);
        return str;
    }

    /**
     * 给当前时间加天数 user_aiyuan 2016年10月31日 下午3:58:58
     *
     * @param now
     * @param day
     */
    public static Date addDate(String now, int day) {
        try {
            Date date = dateFormat.parse(now);
            fromCal.setTime(date);
            fromCal.add(Calendar.DATE, day);

            System.out.println(dateFormat.format(fromCal.getTime()));
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 通过天数获取时间戳
     *
     * @param day 天数
     * @return 时间戳
     */
    public static Long getTimeStampByDay(long day) {
        return day * 24 * 60 * 60 * 1000;
    }
}
