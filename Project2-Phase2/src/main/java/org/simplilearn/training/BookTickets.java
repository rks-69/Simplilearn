package org.simplilearn.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.simplilearn.training.*;
/**
 * Servlet implementation class BookTickets
 */
@WebServlet(description = "Booking the tickets", urlPatterns = { "/BookTickets" })
public class BookTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookTickets() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String source=request.getParameter("source");
		String destination=request.getParameter("destination");
		String passengers=request.getParameter("passengers");
		String date=request.getParameter("date");
		String time=request.getParameter("time");
		Passenger psg=new Passenger(source, destination, passengers, date, time);
		psg.setDate(date);
		psg.setDestination(destination);
		psg.setPassengers(passengers);
		psg.setTime(time);
		psg.setSource(source);
		ServletContext context=getServletContext();
		context.setAttribute("source", source);
	
	}

}
