package in.codegram.phonebookapp.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"in.codegram.phonebookapp"})
public class SpringRootConfig {

	//TODO: Services, DAO, DataSource, Email Sender or Some other business related beans configuration
	
	@Bean
	public BasicDataSource getDataSource() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/phonebookdb");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setMaxTotal(2);
		ds.setInitialSize(1);
		ds.setTestOnBorrow(true);
		ds.setValidationQuery("select 1");
		ds.setDefaultAutoCommit(true);
		return ds;
	}
}


