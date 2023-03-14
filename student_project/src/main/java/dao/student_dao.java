package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import models.student;

public class student_dao {

	private Connection conn;

	public student_dao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean addstudent(student S) {
		
		boolean A =false;
		try {
			
			String sql = "insert into data (rollnumber,Firstname,lastname,username,Email,password) values (?,?,?,?,?,?)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setInt(1, S.getRollnumber());
			ps.setString(2, S.getFirstname());
			
			ps.setString(3, S.getLastname());
			
			ps.setString(4, S.getUsername());
			
			ps.setString(5, S.getEmail());
			
			ps.setString(6, S.getPassword());
			
			
			
		int i=	ps.executeUpdate();
		if (i==1) {
			A = true;
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return A;
	}
	
}
