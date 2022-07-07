import java.util.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;



class Demo1 extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<h1>Educating for better tomorrow....</h1>");
		out.println("</HTML>");
	}
}	
