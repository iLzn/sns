package com.reuleaux.sns.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

/**
 * @author 杉树下的松子
 * @date 2023/1/17 21:36
 */



public class FakerDataUtil {
/**
 *
 * @return 设置地区为中国
 *
 */
    public static Faker setChina(){
        Faker faker = new Faker(Locale.CHINA);
        return faker;
    }
}
