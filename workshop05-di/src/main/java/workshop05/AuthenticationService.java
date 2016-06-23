package workshop05;

import workshop05.User;
import workshop05.UserDao;

public class AuthenticationService {
	
	UserDao userDao;
	
	public AuthenticationService(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean isUserNameExisted(String username){
		User user = userDao.searchByUsername(username);
		if(user != null){
			return true;
		}		
		return false;
	}
}
