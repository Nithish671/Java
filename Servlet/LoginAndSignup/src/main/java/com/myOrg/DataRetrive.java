package com.myOrg;

import java.sql.*;

public class DataRetrive {
	String db_url = "jdbc:mysql://localhost/jdbc";
	String user = "root";
	String pass = "321";
	public boolean status;
	
	public boolean getLogin(String userName,String password) {
		try {
			Connection conn = DriverManager.getConnection(db_url, user, pass);
			PreparedStatement st = conn.prepareStatement("SELECT * from logindetails WHERE userName = ? AND password = ?");
			st.setString(1, userName);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();

			if(rs.next()){
				status = true;
			} else {
				status = false;
			}
						
			rs.close();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return status;
	}
}