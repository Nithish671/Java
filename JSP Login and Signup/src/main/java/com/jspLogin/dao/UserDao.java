package com.jspLogin.dao;

import java.sql.*;
import com.jspLogin.bean.User;

public class UserDao {
	public static boolean logVal(User bean) {
		boolean status = false;
		
		try {
			Connection con = ConnectionProvider.getCon();
			
			PreparedStatement ps = con.prepareStatement("SELECT * FROM login WHERE email=? AND password=?");
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getPass());
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
	
	public static int signVal(User bean) {
		int status = 0;
		
		try {
			Connection con = ConnectionProvider.getCon();
			
			PreparedStatement ps = con.prepareStatement("INSERT INTO login(email, password) VALUES(?, ?)");
			ps.setString(1, bean.getName());
			ps.setString(2, bean.getPass());
			
			status = ps.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
	
	public static boolean userCheck(User bean) {
		boolean status = true;
		
		try {
			Connection con = ConnectionProvider.getCon();
			
			PreparedStatement ps = con.prepareStatement("SELECT id FROM login WHERE email=?");
			ps.setString(1, bean.getName());
			
			ResultSet stat = ps.executeQuery();
			
			if(stat.next()) {
				status = false;
			} else {
				status = true;
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
}
