package nl.programIt;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*@Configuration
@ComponentScan(basePackages="nl.programIt")
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="nl.programIt.repository")
									//entityManagerFactoryRef="entityMangerFactoryObject",
									//transactionManagerRef="trasactionManagerObject" )*/
 public class AppConfig {
	@Bean
	public BasicDataSource datsource(){
		BasicDataSource basic =new BasicDataSource();
		basic.setUrl("jdbc:mysql://localhost:3306/db_werknemer");
		basic.setDriverClassName("com.mysql.jdbc.Driver");
		basic.setUsername("root");
		basic.setPassword("");		
		return basic;		
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean entityMangerFactoryObject(){
		LocalContainerEntityManagerFactoryBean loc=new LocalContainerEntityManagerFactoryBean();
		loc.setDataSource(this.datsource());
		loc.setPackagesToScan("nl.programIt.entities");
		loc.setJpaVendorAdapter(new HibernateJpaVendorAdapter());		
		return loc;		
	}
	@Bean
	public JpaTransactionManager trasactionManagerObject(){
		JpaTransactionManager trans =new JpaTransactionManager();
		trans.setEntityManagerFactory(this.entityMangerFactoryObject().getObject());
		return trans;
		
	}

}
