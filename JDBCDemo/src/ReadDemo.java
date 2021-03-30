import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class ReadDemo {
	
	private static Logger logger =  Logger.getLogger(ReadDemo.class);

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
		String sql = "select * from employees";
		Statement stmt =  con.createStatement();
		ResultSet rs =  stmt.executeQuery(sql);
		while (rs.next()) {
			int id =  rs.getInt("id");
			String name = rs.getString("name");
			String contact = rs.getString("contact");
			System.out.println(id+","+name+","+contact);
			
		}
		logger.info("Success ! Data Deleted");
		
		//5. Release Resources (Statement, Connection)
		stmt.close();
		con.close();

	}

}
