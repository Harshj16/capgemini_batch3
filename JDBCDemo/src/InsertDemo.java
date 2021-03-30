import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class InsertDemo {
	
	private static Logger logger =  Logger.getLogger(InsertDemo.class);

	public static void main(String[] args) throws Exception{
		//1. Collecting the DB information
		String driverClassName = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost/capgdb";
		String username="postgres";
		String password="admin";
		
		//2. Register Driver
		Class c = Class.forName(driverClassName);
		logger.info(c);
		//3. get Connection Object
		Connection con =  DriverManager.getConnection(url, username, password);
		logger.info(con);
		//4. Create Statement and Execute query
		String sql = "insert into employees (id,name,contact) values (103,'manvi','8827611875')";
		Statement stmt =  con.createStatement();
		stmt.execute(sql);
		logger.info("Success ! Data Saved");
		
		//5. Release Resources (Statement, Connection)
		stmt.close();
		con.close();

	}

}
