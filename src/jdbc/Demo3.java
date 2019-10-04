package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Demo3 {

	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";

	public static void main(String[] args) throws SQLException {

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}S
		
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", DB_USER, DB_PASS);
				Statement stmt = con.createStatement()) {

//			int result = stmt.executeUpdate("CREATE TABLE Lukanka (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,  firstname VARCHAR(30) NOT NULL )");
//			System.out.println(result);
			
			// Insert row and return PK
//			int rowCount = stmt.executeUpdate(
//			"INSERT INTO Lukanka(firstname) VALUES ('Madjarov')");
			
			
			// Get the auto generated PK
			ResultSet rs = stmt.getGeneratedKeys(); 
			rs.next();
			long primaryKey = rs.getLong(1);
			System.out.println(primaryKey);
			//int result = stmt.executeUpdate("INSERT INTO MyGuests (id, firstname, lastname, email, reg_date) VALUES ('1', 'Didi', 'Dineva', 'didka@abv.bg', '1990'");
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
