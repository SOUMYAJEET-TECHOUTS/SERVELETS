package Resourses;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Delete {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter W3 = resp.getWriter();
		W3.print("<h1></h1>");
		req.getRequestDispatcher("Delete.jsp").forward(req, resp);
	
	

	}
}
