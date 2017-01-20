package roboguard.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages={"roboguard"}
	,excludeFilters={@Filter(type=FilterType.ANNOTATION,classes={EnableWebMvc.class})})
public class RootConfig {

	
	public DataSource dataSource(){
		BasicDataSource bds=new BasicDataSource();
			bds.setDriverClassName("com.mysql.jdbc.Driver");
			bds.setUsername("root");
			bds.setPassword("");
			
			return bds;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactoryBean(){
		LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
			lsfb.setDataSource(dataSource());
			Properties hibernateProperties=new Properties();
				hibernateProperties.setProperty("hibernate.dialect", "MySQL5");
				hibernateProperties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
				hibernateProperties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/roboguard");
				hibernateProperties.setProperty("hibernate.connection.username", "root");
				hibernateProperties.setProperty("hibernate.connection.password", "");
			lsfb.setHibernateProperties(hibernateProperties);		
			return lsfb;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager(SessionFactory sf){
		HibernateTransactionManager htm=new HibernateTransactionManager(sf);
			return htm;
	}
	
	
}
