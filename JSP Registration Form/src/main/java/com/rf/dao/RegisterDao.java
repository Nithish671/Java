package com.rf.dao;

import java.sql.*;
import com.rf.bean.User;

public class RegisterDao {
	
	public static int register(User u) {
		int status = 0;
		
		try {
			Connection con = ConnectionProvider.getCon();
			PreparedStatement ps = con.prepareStatement("INSERT INTO reguser(name, email, password) VALUES(?, ?, ?)");
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPass());
			status = ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
}
