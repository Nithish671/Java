package com.rf.dao;

import java.sql.*;
import static com.rf.bean.Provider.*;

public class ConnectionProvider {
private static Connection con = null;

static {
	try {
		Class.forName(DRIVER);
		con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
	} catch(Exception e) {System.out.println(e);}
}

public static Connection getCon() {
	return con;
}
}
