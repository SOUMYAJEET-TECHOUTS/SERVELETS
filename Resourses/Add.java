package Resourses;

import java.io.IOException;

import java.net.ConnectException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBConnection.Connectivity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Add() {
        super();
        
   }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("CreateSuccess.jsp");
	       dispatcher.forward(request,response);
		
		
	
		
		        Connection connection = null;
		        Statement statement = null;
		        ResultSet resultSet = null;
		        
		        Connectivity s = new Connectivity();
				
		        

		        try {
		            
		        	connection = s.getCon();
		          
		            statement = connection.createStatement();

		          
		            String id = request.getParameter("empId");
		    		String name = request.getParameter("empName");
		    		String designation = request.getParameter("empDesignation");
		    		System.out.println(id + ""+name +" "+designation);
		    		
					String sql = "Insert into techout (ID,NAMES,DESIGNATION) values("+id+",'"+name+"','"+designation+"');";
					
					System.out.println(sql);
		            
					int n=statement.executeUpdate(sql);
					
					System.out.println(n);
					  /*while (resultSet.next()) {
					  
					  System.out.println("ID: " + id + ", Name: " + name + ", Designation: " +
					  designation); }
					 
		        
*/
		        }
		        catch (SQLException e) {
		            e.printStackTrace();
		        }
		        finally {
		  
		            try { if (resultSet != null) resultSet.close(); } catch (SQLException e) { e.printStackTrace(); }
		            try { if (statement != null) statement.close(); } catch (SQLException e) { e.printStackTrace(); }
		            try { if (connection != null) connection.close(); } catch (SQLException e) { e.printStackTrace(); }
		        }
		    }
	
	public Connection getConn() {
		// TODO Auto-generated method stub
		return null;
	}

}
