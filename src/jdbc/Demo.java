package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Demo {

	private static final String DB_USER = "root";
	private static final String DB_PASS = "root";

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//Class.forName("com.mysql.jdbc.Driver");
		 
		
		ResultSet res = null;
		try ( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", DB_USER, DB_PASS);
				Statement stmt = con.createStatement()){

			res = stmt.executeQuery("SELECT * FROM hr.employees");

			ArrayList<Employee> list = new ArrayList<Employee>();

			int indexNameColumn = res.findColumn("first_name");
			int indexSalaryColumn = res.findColumn("salary");

			while (res.next()) {
				String name = res.getString(indexNameColumn);
				float salary = res.getFloat(indexSalaryColumn);
				Employee e = new Employee(name, salary);
				list.add(e);
				System.out.println("Name: " + name + " salary: " + salary);
				if (name.equals("David")) {
					break;
				}
			}

			res = stmt.executeQuery("SELECT * FROM hr.countries");
			int indexCNameColumn = res.findColumn("country_name");
			int indexCIdColumn = res.findColumn("country_id");

			while (res.next()) {
				String countryName = res.getString(indexCNameColumn);
				String countryId = res.getString(indexCIdColumn);

				System.out.println(" id: " + countryId);

			}
		} catch (Exception e) {
			System.out.println("Ops");
		} 
		finally {
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

//		 System.out.println(res.isFirst());
//		 System.out.println(res.isLast());
//		 System.out.println(res.first());
//		 System.out.println(res.getString("first_name"));
//		 System.out.println(res.last());
//		 System.out.println(res.getString("first_name"));

	}

}
