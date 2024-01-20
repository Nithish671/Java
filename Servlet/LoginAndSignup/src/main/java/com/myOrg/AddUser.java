package com.myOrg;

import java.sql.*;

public class AddUser {
	String db_url = "jdbc:mysql://localhost/jdbc";
	String user = "root";
	String pass = "321";
	public boolean regStatus;
	
public boolean userReg(String nUser,String nPass) {
	try {
		Connection conn = DriverManager.getConnection(db_url, user, pass);
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM logindetails WHERE userName = ?;");
		ps.setString(1, nUser);
		ResultSet rs = ps.executeQuery();
			
	if(!rs.next()) {
	    PreparedStatement ps1 = conn.prepareStatement("INSERT INTO logindetails (userName, password) VALUES (?, ?);");
		ps1.setString(1, nUser);
		ps1.setString(2, nPass);
		ps1.executeUpdate();
		regStatus = true;
		} else {
		regStatus = false;
		} 
		} catch(SQLException e) {
			System.out.println(e);
		}
		return regStatus;
	}  
}