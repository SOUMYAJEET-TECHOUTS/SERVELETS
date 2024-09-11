package Resourses;
 
import java.awt.print.PrinterGraphics;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DBConnection.*;

import DBConnection.Connectivity;
 
public class UpdateDetails extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String designation = req.getParameter("designation");
			int result = Integer.MIN_VALUE;
			Connection connection = null;
	        PreparedStatement statement = null;
	        ResultSet resultSet = null;
	        PreparedStatement stm = null;
	        Connectivity s = new Connectivity();
			try {
				
				connection = s.getCon();
				stm = connection.prepareStatement("UPDATE EMPLOYEE SET NAME = COALESCE(NULLIF(?, ''), NAME), DESIGNATION = COALESCE(NULLIF(?, ''), DESIGNATION), WHERE ID = ? ");
				stm.setString(1, name.isEmpty() ? null : name);
				stm.setString(2, designation.isEmpty() ? null : designation);
				stm.setString(5, id);
				result = stm.executeUpdate();
				System.out.println(result);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(result == 1)
			{
				req.getRequestDispatcher("EditDetails.jsp").forward(req, resp);
			}
			else
			{
				req.getRequestDispatcher("EditDetails.jsp").forward(req, resp);
			}
			try {
                if (stm != null) stm.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
	}
 
}