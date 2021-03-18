package org.simplilearn.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String id=request.getParameter("productid");
		String name=request.getParameter("productname");
		String cost=request.getParameter("productcost");
		String quantity=request.getParameter("productquantity");
//		out.println("<h3>The Entered Product Details are:</h3>");
//		out.println("Product ID" + id);
//		out.println("Product Name" + name);
//		out.println("Product Cost" + cost);
//		out.println("Product Quantity" + quantity);
//		ArrayList<Product> prd=new ArrayList<Product>();
//		prd.add(new Product(id,name,cost,quantity));
		request.setAttribute("pid", id);
		request.setAttribute("pname", name);
		request.setAttribute("pcost", cost);
		request.setAttribute("pquantity", quantity);
		RequestDispatcher rd=request.getRequestDispatcher("details.jsp");
		rd.forward(request, response);
		
	}

}
