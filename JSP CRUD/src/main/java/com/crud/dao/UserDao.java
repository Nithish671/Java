package com.crud.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.crud.bean.User;

public class UserDao {
public static Connection getConnection() {
	Connection con = null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/jspdb", "root", "321");
	} catch(Exception e) {
		System.out.println(e);
	}
	return con;
}

public static int save(User u) {
	int status = 0;
	
	try {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("INSERT INTO users(name, password, email, gender, universe) VALUES(?, ?, ?, ?, ?)");
		ps.setString(1, u.getName());
		ps.setString(2, u.getPassword());
		ps.setString(3, u.getEmail());
		ps.setString(4, u.getGender());
		ps.setString(5, u.getUniverse());
		status = ps.executeUpdate();
	} catch(Exception e) {System.out.println(e);}
	
	return status;
}

public static int update(User u) {
	int status = 0;
	
	try {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("UPDATE users SET name=?, password=?, email=?, gender=?, universe=? WHERE id=?");
		ps.setString(1, u.getName());
		ps.setString(2, u.getPassword());
		ps.setString(3, u.getEmail());
		ps.setString(4, u.getGender());
		ps.setString(5, u.getUniverse());
		ps.setInt(6, u.getId());
		status = ps.executeUpdate();
	} catch(Exception e) {System.out.println(e);}
	return status;
}

public static int delete(User u) {
	int status = 0;
	
	try {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("DELETE FROM users WHERE id=?");
		ps.setInt(1, u.getId());
		status = ps.executeUpdate();
	} catch(Exception e) {System.out.println(e);}
	
	return status;
}

public static List<User> getAllRecords() {
	List<User> list = new ArrayList<User>();
	
	try {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM users");
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			User u = new User();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setGender(rs.getString("gender"));
			u.setUniverse(rs.getString("universe"));
			list.add(u);
		}
	} catch(Exception e) {System.out.println(e);}
	
	return list;
}

public static User getRecordsById(int id) {
	User u = null;
	
	try {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE id=?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			u = new User();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setGender(rs.getString("gender"));
			u.setUniverse(rs.getString("universe"));
		}
	} catch(Exception e) {System.out.println(e);}
	
	return u;
}

}
