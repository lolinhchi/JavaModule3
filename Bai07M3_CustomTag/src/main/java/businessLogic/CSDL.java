package businessLogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CSDL {

	private static Connection conn;
	private static final String url="jdbc:mysql://localhost:3306/qlbansua";
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "");
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return conn;
	}
	
}

