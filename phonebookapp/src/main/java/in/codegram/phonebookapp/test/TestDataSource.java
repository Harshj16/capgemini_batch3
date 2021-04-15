package in.codegram.phonebookapp.test;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.codegram.phonebookapp.configuration.SpringRootConfig;

public class TestDataSource {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
		DataSource ds = ctx.getBean(DataSource.class);
		JdbcTemplate jt = new JdbcTemplate(ds);
		String sql = "insert into users (name, loginName, pwd,role,status) values (?,?,?,?,?)";
		
		Object[] params = new Object[] {"pankaj","pankaj28","pankaj123",1,1};
		jt.update(sql, params);
		System.out.println("---Data Inserted----");

	}

}
