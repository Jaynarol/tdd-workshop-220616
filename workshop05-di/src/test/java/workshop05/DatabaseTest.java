package workshop05;

import java.io.File;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.h2.jdbcx.JdbcDataSource;
import org.h2.tools.RunScript;

public abstract class DatabaseTest {
	
	protected static final String JDBC_DRIVER = org.h2.Driver.class.getName();
	protected static final String JDBC_URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
	protected static final String USER = "sa";
	protected static final String PASSWORD = "";
	protected static final String UTF8 = "UTF8";
    
	public static void createSchema(String sqlfile) throws Exception {
	    RunScript.execute(JDBC_URL, USER, PASSWORD, sqlfile, Charset.forName(UTF8), false);
	}
	
    public void importDataSet(String xmlfile) throws Exception {
        IDataSet dataSet = new FlatXmlDataSetBuilder().build(new File(xmlfile));
        cleanlyInsert(dataSet);
    }
	 
    private void cleanlyInsert(IDataSet dataSet) throws Exception {
        IDatabaseTester databaseTester = new JdbcDatabaseTester(JDBC_DRIVER, JDBC_URL, USER, PASSWORD);
        databaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
        databaseTester.setDataSet(dataSet);
        databaseTester.onSetup();
    }
    
    private DataSource getDataSource() {
    	JdbcDataSource dataSource = new JdbcDataSource();
    	dataSource.setURL(JDBC_URL);
    	dataSource.setUser(USER);
    	dataSource.setPassword(PASSWORD);
    	return dataSource;
    }
    
    protected Connection getConnection() throws SQLException{
    	return getDataSource().getConnection();
    }
    
}
