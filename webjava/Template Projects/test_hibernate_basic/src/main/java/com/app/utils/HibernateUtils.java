package com.app.utils;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;
	static {
		System.out.println("In static Block");
		factory=new Configuration()//creates empty config
				.configure()// read all props from hib cfg xml
				.buildSessionFactory();//create singleton SF from loaded config
				}
	//genearate getter
	public static SessionFactory getFactory() {
		return factory;
	}
	

}
