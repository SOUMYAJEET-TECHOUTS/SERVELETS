package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Connectivity {
 
	public Connection getCon() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Chhotu1148");
			System.out.println("Connected " + con);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
