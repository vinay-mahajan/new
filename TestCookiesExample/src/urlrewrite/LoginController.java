package urlrewrite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String un = request.getParameter("uname");
		String pwd = request.getParameter("pass");
		if(un.equals("Vinay")) {
			out.println("Welcome"+un);
			HttpSession session = request.getSession();
			session.setAttribute("user", un);
			session.setMaxInactiveInterval(30);
			response.sendRedirect("Home.jsp");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("Login.html");
			out.println("<font color=red> Either user name or password is wrong</font>");
			rd.include(request, response);
		}
	}

}
