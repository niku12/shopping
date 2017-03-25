package com.niit.shoppingbackend.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;



@Configuration
@ComponentScan(basePackages = { "com.niit.shoppingbackend" })
@EnableTransactionManagement
// change the below based on the dbms

public class HibernateConfig {
	private final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/market";
	private final static String DATABASE_DRIVER = "org.h2.Driver";
	private final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME = "sa";
	private final static String DATABASE_PASSWORD = "sa";

	@Bean(name="dataSource")
	public DataSource getDataSourse() {
		BasicDataSource dataSource = new BasicDataSource();

		// PROVIDING THE DATABASE CONNECTION INFORMATION
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
	}

	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.niit.shoppingbackend.dto");
		return builder.buildSessionFactory();
	}

	// All the hibernate properties
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		properties.put("hibernate.hbm2ddl.auto","update");
		return properties;
	}

	// transactionMangerbean
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;

	}
	//for image upload
/* @Bean(name="multipartResolver") 
	    public CommonsMultipartResolver getResolver() throws IOException{
	        CommonsMultipartResolver resolver = new CommonsMultipartResolver();
	         
	        //Set the maximum allowed size (in bytes) for each individual file.
	        resolver.setMaxUploadSizePerFile(5242880);//5MB
	         
	        //You may also set other available properties.
	         
	        return resolver;
	    }*/



}
