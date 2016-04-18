package com.perfect.trains.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.perfect.trains.mapper.EquipmentMapper;
import com.perfect.trains.mapper.TrainMapper;

public class SqlSessionFactorySingletonClass {
    private static  SqlSessionFactory instance = null;
    static {
    	MysqlDataSource ds = new MysqlDataSource();//����mysql dataSource
    	ds.setServerName("localhost");//�������ݿ�·����
    	ds.setPortNumber(3306);//�������ݿ����˿�
    	ds.setDatabaseName("project");//�������ݿ�����
    	ds.setUser("root");//�����û���
    	ds.setPassword("1234");//�������ݿ�����
    	TransactionFactory transactionFactory = new JdbcTransactionFactory();//�������񹤳�
    	Environment environment = new Environment("development", transactionFactory, ds);//������������
    	Configuration configuration = new Configuration(environment);//�������ö���
    	configuration.addMapper(EquipmentMapper.class);//���������
    	configuration.addMapper(TrainMapper.class);//���������
    	instance = new SqlSessionFactoryBuilder().build(configuration);//����sqlSession����
    	/*ע����������������һ��ӳ���ࣨmapper class����ӳ������ Java �࣬���ǰ��� SQL ӳ������ע��Ӷ������� XML �ļ���������
    	���������� Java ע���һЩ���Ƽ�֮ĳЩ MyBatis ӳ��ĸ����ԣ�XML ӳ����ڴ�����߼�ӳ�䣨���磺Ƕ�� Join ӳ�䣩��˵��Ȼ�Ǳ���ġ�
    	���ڴˣ��������һ���Եȵ� XML �����ļ��Ļ���MyBatis ���Զ����Ҳ�������
    	����������£� UserDao.xml ���������·���� UserDao.class �����������ؽ�����������ϸ���Ժ������*/
    }
    private SqlSessionFactorySingletonClass (){}
    public static SqlSessionFactory getInstance() {
    	return instance;
    }
	
}
