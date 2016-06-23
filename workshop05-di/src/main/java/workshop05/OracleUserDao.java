package workshop05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import workshop05.User;

public class OracleUserDao implements UserDao {

	private Connection connection;

	public User searchByUsername(String username) {
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT ID FROM USER WHERE FIRSTNAME=? LIMIT 1");
			preparedStatement.setString(1, username);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				User user = new User();
				return user;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
