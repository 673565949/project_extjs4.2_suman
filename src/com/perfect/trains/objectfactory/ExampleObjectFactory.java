package com.perfect.trains.objectfactory;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.ibatis.reflection.ReflectionException;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

public class ExampleObjectFactory extends DefaultObjectFactory{
	public <T> T create(Class<T> type) {
		System.out.println("我开始初始化类了"+p.getProperty("name")+"\t"+type);
	    return super.create(type);
	  }

	  public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
		  System.out.println("我开始初始化类了"+p.getProperty("name")+"\t"+type);
	    return super.create(type, constructorArgTypes, constructorArgs);
	  }
	  private Properties p = null;
	  public void setProperties(Properties properties) {
		p= properties;
	    super.setProperties(properties);
	  }

	  public <T> boolean isCollection(Class<T> type) {
	    return Collection.class.isAssignableFrom(type);
	  }

}
