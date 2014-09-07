package development_environment_test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="ServletTest", urlPatterns={"/ServletTest"})
public class ServletTest extends HttpServlet {

	private String message;
	
	public ServletTest() {
		message = "Hello World";
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		// Set response content type
		   response.setContentType("text/html");

		   // Actual logic goes here.
		   PrintWriter out = response.getWriter();
		   out.println("<h1>" + message + "</h1>");
	}
	
	public void destroy()
	{
		//do nothing
	}
}
