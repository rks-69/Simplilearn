package org.simplilearn.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(description = "Login In into Portal", urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		request.setAttribute("uname", uname);
		boolean result=checkPassword(uname,pass);
		if(result==true)
		{
			
			response.sendRedirect("dashboard.jsp");
			
		}
		else {
			out.print("<h3>Invalid Credentials");
		}
	}

	private boolean checkPassword(String uname, String pass) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/users?useSSL=false";
		String username="root";
		String password="admin";
		String correctPassword=null;
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			Statement s=con.createStatement();
			s.executeQuery("select pass from users where username='"+uname+"'");
			ResultSet rs=s.getResultSet();
			if(rs.next()) {
				correctPassword=rs.getString(1);
			}
			s.close();
			if(correctPassword.equals(pass)) {
				return true;
			}
			else {
				return false;
			}
			
		} catch (Exception e) {
			System.out.println("Exception Occurred");
			e.printStackTrace();
		}
		
		return false;
	}

}
