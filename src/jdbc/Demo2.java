package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Demo2 {

	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		ResultSet res = null;
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", DB_USER, DB_PASS);
				Statement stmt = con.createStatement()) {

			int count = stmt.executeUpdate("UPDATE hr.employees SET first_name = 'Gosho' WHERE first_name = 'Steven' ");
			System.out.println(count);
			
		}
		catch (Exception e) {
			System.out.println("exception");
			// TODO: handle exception
		}
		
		

	}

}
