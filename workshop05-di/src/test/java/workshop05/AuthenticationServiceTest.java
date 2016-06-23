package workshop05;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuthenticationServiceTest {

	@Test public void 
	user_should_be_existed() {
		AuthenticationService authenicationService = new AuthenticationService(new SuccessUserDao());
		assertTrue(authenicationService.isUserNameExisted("root"));
	}
	
	@Test public void 
	user_should_not_existed() {
		AuthenticationService authenicationService = new AuthenticationService(new NullUserDao());
		assertFalse(authenicationService.isUserNameExisted("guest"));
	}

}




class SuccessUserDao implements UserDao {
	public User searchByUsername(String username) {
		return new User();
	}
}

class NullUserDao implements UserDao {
	public User searchByUsername(String username) {
		return null;
	}
}





