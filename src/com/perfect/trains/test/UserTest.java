package com.perfect.trains.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.perfect.trains.mapper.EquipmentMapper;
import com.perfect.trains.model.Equipment;
import com.perfect.trains.singleton.SqlSessionFactorySingletonClass;
import com.perfect.trains.singleton.SqlSessionFactorySingletonXml;


public class UserTest {
	public static void main(String[] args) {
		SqlSession sqlSession = getSqlSessionFactory(false).openSession();
		try{
			
			
			EquipmentMapper mapper = sqlSession.getMapper(EquipmentMapper.class);
			Equipment equipment = mapper.selectByPrimaryKey(5L);
			System.out.println(equipment.getTrain().getName());
		}finally{
			sqlSession.close();
		}
	}	
	
	public static  SqlSessionFactory getSqlSessionFactory(boolean useXml){
		if(useXml){
			 return SqlSessionFactorySingletonXml.getInstance();
		}else{
			 return SqlSessionFactorySingletonClass.getInstance();
		}
	}
}
