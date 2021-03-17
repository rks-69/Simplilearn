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
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String product=request.getParameter("productid");
		int id=Integer.parseInt(product);
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/DEMO?useSSL=false";
		String username="root";
		String password="admin";
		out.print("<h1>Displaying the records</h1>");
		out.print("<table border='1'><tr><th>ID</th><th>Product Name</th><th>Cost</th></tr>");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from DEMO where Product_ID="+id+"");
			while(rs.next())
			{
				out.print("<tr><td>");
				out.println(rs.getInt(1));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getDouble(3));
				out.print("</td>");
				out.print("</tr>");
			}
		}catch (Exception e) {
			System.out.println("An Error Occurred");
			e.printStackTrace();
		}
		out.print("</table>");
	}

}
