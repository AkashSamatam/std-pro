package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.student_dao;
import db_connection.student_db;
import models.student;
@WebServlet ("/Registration")
public class std_servlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int rollnumber = Integer.parseInt(req.getParameter("rollnumber"));
		
		String Firstname = req.getParameter("Firstname");
		
		String lastname = req.getParameter("lastname");
		
		String username = req.getParameter("username");
		
		String Email = req.getParameter("Email");
		
		String password = req.getParameter("password");
		
		
		
		student S = new student(rollnumber,Firstname,lastname,username,Email,password);
		
		student_dao sd = new student_dao(student_db.getConnection());
		
		PrintWriter pw = resp.getWriter();
		
		boolean A = sd.addstudent(S);
		
		if (A) {
			
			pw.println("successfully inserted");
			resp.sendRedirect("login.jsp");
		}
		else {
			pw.println("error");
			resp.sendRedirect("error.jsp");
		}
	}
}
