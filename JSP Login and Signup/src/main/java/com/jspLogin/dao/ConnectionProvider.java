package com.jspLogin.dao;

import java.sql.*;
import static com.jspLogin.bean.Provider.*;

public class ConnectionProvider {
	public static Connection con = null;
	
	static {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static Connection getCon() {
		return con;
	}
}
