package Resourses;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBConnection.Connectivity;


public class FetchDetails extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        Connectivity s = new Connectivity();
        try {
        	connection = s.getCon();
            statement = connection.prepareStatement("Select * from techout where ID = ?");
            statement.setString(1, id);
			resultSet=statement.executeQuery();
			
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        try {
			if(resultSet.next())
			{
				String id1 = resultSet.getString("ID");
			    String name = resultSet.getString("NAMES");
			    String designation = resultSet.getString("DESIGNATION");
			    System.out.println(id1+name+designation);
			    // Set attributes for JSP
			    request.setAttribute("id", id1);
			    request.setAttribute("name", name);
			    request.setAttribute("designation", designation);
			    request.getRequestDispatcher("FetchOutput.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
