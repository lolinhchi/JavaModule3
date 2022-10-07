package bussinessLogic;

import java.sql.Connection;
import java.sql.DriverManager;

public class CSDL {

	private static Connection conn;
	private static final String url="jdbc:mysql://localhost:3306/qlbansua";
	public static Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, "root", "");
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return conn;
	}
}
