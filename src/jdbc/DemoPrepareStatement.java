package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;



public class DemoPrepareStatement {

		private static final String DB_USER = "root";
		private static final String DB_PASS = "root";

		public static void main(String[] args) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}

			ResultSet res = null;
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", DB_USER, DB_PASS);
					Statement stmt = con.createStatement()) {
				
				String name = new Scanner(System.in).nextLine();
//				// Insert row and return PK
//				int rowCount = stmt.executeUpdate(
//				"INSERT INTO Lukanka(firstname) VALUES ('" + name + "')");
				
				
				String insertSQL = "INSERT INTO Lukanka(firstname) VALUES (?)";
				PreparedStatement pstmt = con.prepareStatement(insertSQL);
				pstmt.setString(1, name);  
				pstmt.executeUpdate();
				
				// Get the auto generated PK
//				ResultSet rs = stmt.getGeneratedKeys(); 
//				rs.next();
//				long primaryKey = rs.getLong(1);
//				System.out.println(primaryKey);
				//int result = stmt.executeUpdate("INSERT INTO MyGuests (id, firstname, lastname, email, reg_date) VALUES ('1', 'Didi', 'Dineva', 'didka@abv.bg', '1990'");
				

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}


