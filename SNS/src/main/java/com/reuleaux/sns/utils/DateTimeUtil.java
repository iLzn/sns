package com.reuleaux.sns.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {


    /**
     * @return 以一定格式返回当前系统时间
     */
    public static String getSysTime() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        String dateStr = sdf.format(date);

        return dateStr;

    }

    /**
     *
     * @return 获取当前日期和时间的时间戳
     */
    public static Timestamp getSysTimeSql() {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        return timestamp;
    }

}
