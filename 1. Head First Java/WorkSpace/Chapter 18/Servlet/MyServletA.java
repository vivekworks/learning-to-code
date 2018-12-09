import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServletA extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String message = "If you're reading this, It worked!";
		out.println("<HTML>");
		out.println("<BODY>"+message+"</BODY");
		out.println("</HTML>");
		out.close();
	}
}