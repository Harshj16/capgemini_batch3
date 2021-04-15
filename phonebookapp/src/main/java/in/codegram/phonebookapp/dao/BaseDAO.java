package in.codegram.phonebookapp.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

/**
 * This class will provide the datasource dependencies for SQL operations.
 * This object will not be managed by spring. 
 * You can not create the object of this class. 
 * This class should be used only for extension
 * @author pankaj
 *
 */
abstract public class BaseDAO extends NamedParameterJdbcDaoSupport{

	@Autowired
	public void setDataSource2(DataSource ds) {		
		super.setDataSource(ds);		
	}
}
