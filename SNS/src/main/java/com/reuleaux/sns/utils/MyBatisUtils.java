package com.reuleaux.sns.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 杉树下的松子
 * @data 2021/3/13
 */


//测试用
public class MyBatisUtils {
    //创建静态的共享对象 sqlSessionFactory
    private static SqlSessionFactory sqlSessionFactory = null;

    //静态代码块初始化SqlSessionFactory
    static {
        //指定mybatis配置文件
        String config = "conf/mybatis-bak.xml";
        try {
            //创建流 读取配置文件
            InputStream in = Resources.getResourceAsStream(config);
            //初始化
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //创建SqlSession
    public static SqlSession getSqlSession() {
        SqlSession sqlSession = null;
        if (sqlSessionFactory != null) {
            sqlSession = sqlSessionFactory.openSession();
        }
        return sqlSession;
    }
}
