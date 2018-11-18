package Database;

import java.sql.*;

public class DBConnection {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/stase1?useSSL=false&serverTimezone=MET";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "init";

	public static Connection getConnection() throws Exception{
        Class.forName(DBConnection.DRIVER);
        return DriverManager.getConnection(DBConnection.URL, DBConnection.USERNAME, DBConnection.PASSWORD);
    }
}
