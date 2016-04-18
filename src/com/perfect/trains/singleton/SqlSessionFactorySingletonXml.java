package com.perfect.trains.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactorySingletonXml {
    private static  SqlSessionFactory instance = null;
    static {
    	String resource = "config/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		instance = new SqlSessionFactoryBuilder().build(inputStream);//¹¹½¨sqlSessionFactory
    }
    private SqlSessionFactorySingletonXml (){}
    public static SqlSessionFactory getInstance() {
    	return instance;
    }
	
}
