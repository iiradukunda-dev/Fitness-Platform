package fit.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StorePreferences
 */
@WebServlet("/StorePreferences")
public class StorePreferences extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("username");
		String workout=request.getParameter("workout");
		String goal=request.getParameter("goal");
	
		HttpSession session=request.getSession();
		
		session.setAttribute("name", name);
		session.setAttribute("workout", workout);
		session.setAttribute("goal", goal);
		
		response.sendRedirect("Dashboard");
	}

}
