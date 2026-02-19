package fit.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Dashboard
 */
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session=request.getSession(false);
			response.setContentType("text/html");
			
			PrintWriter out=response.getWriter();
			
			if(session!=null) {
				String name=(String)session.getAttribute("name");
				String workout=(String)session.getAttribute("workout");
				String goal=(String)session.getAttribute("goal");
				
				out.println("Welcome "+name+" We are happy for you  "+"<br>");
				out.println("Your workout is "+workout+" <br>");
				out.println("Your goal is "+goal+" <br>");
			}
			else {
				out.println("Please save your preference !");
			}
	}
}
