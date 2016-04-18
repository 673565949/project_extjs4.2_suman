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
    	MysqlDataSource ds = new MysqlDataSource();//创建mysql dataSource
    	ds.setServerName("localhost");//设置数据库路径名
    	ds.setPortNumber(3306);//设置数据库服务端口
    	ds.setDatabaseName("project");//设置数据库名称
    	ds.setUser("root");//设置用户名
    	ds.setPassword("1234");//设置数据库密码
    	TransactionFactory transactionFactory = new JdbcTransactionFactory();//创建事务工厂
    	Environment environment = new Environment("development", transactionFactory, ds);//创建环境对象
    	Configuration configuration = new Configuration(environment);//创建配置对象
    	configuration.addMapper(EquipmentMapper.class);//添加配置类
    	configuration.addMapper(TrainMapper.class);//添加配置类
    	instance = new SqlSessionFactoryBuilder().build(configuration);//构建sqlSession工厂
    	/*注意该例中配置添加了一个映射类（mapper class）。映射类是 Java 类，它们包含 SQL 映射语句的注解从而避免了 XML 文件的依赖，
    	不过，由于 Java 注解的一些限制加之某些 MyBatis 映射的复杂性，XML 映射对于大多数高级映射（比如：嵌套 Join 映射）来说仍然是必须的。
    	鉴于此，如果存在一个对等的 XML 配置文件的话，MyBatis 会自动查找并加载它
    	（这种情况下， UserDao.xml 将会基于类路径和 UserDao.class 的类名被加载进来）。具体细节稍后继续。*/
    }
    private SqlSessionFactorySingletonClass (){}
    public static SqlSessionFactory getInstance() {
    	return instance;
    }
	
}
