import java.sql.*;

public class JavaLesson34 {
	// dbUrl protocol = jdbc, sub-protocol = mysql, localhost = hostname, jdbc port = not given
	static final String dbUrl = "jdbc:mysql://localhost/test";
	static final String username = "root";
	static final String password = "password";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection(dbUrl, username, password);
			
			Statement sqlState = conn.createStatement();
			
			String selectStuff = "Select first_name from students";
			
			ResultSet rows = sqlState.executeQuery(selectStuff);
			
			while(rows.next()) {
				System.out.println(rows.getString("first_name"));
			} 
		} catch(SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("VendorError: " + ex.getErrorCode());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}