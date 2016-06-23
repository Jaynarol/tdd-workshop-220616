package workshop05;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class OracleUserDaoTest extends DatabaseTest {
	
    @BeforeClass
    public static void createSchema() throws Exception {
       createSchema("./schema/user.sql");
    }
    
    @Before
    public void importDataSet() throws Exception {
       importDataSet("./data/OracleUserDaoTest.xml");
    }
	
	@Test public void 
	found_user_by_name() throws SQLException {
		OracleUserDao oracleUserDao = new OracleUserDao();
		oracleUserDao.setConnection(getConnection());
		assertNotNull(oracleUserDao.searchByUsername("root"));
	}
	
	@Test public void 
	notfound_user_by_name() throws SQLException {
		OracleUserDao oracleUserDao = new OracleUserDao();
		oracleUserDao.setConnection(getConnection());
		assertNull(oracleUserDao.searchByUsername("noone"));
	}
	
	@Test public void 
	notfound_user_by_name2() throws SQLException {
		OracleUserDao oracleUserDao = new OracleUserDao();
		oracleUserDao.setConnection(getConnection());
		assertNull(oracleUserDao.searchByUsername("noone"));
	}

}
