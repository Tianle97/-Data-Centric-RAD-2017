package lab4;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mongo {
	
	static final String JDBC_DRIVER = "com.mtsql.jdbc.Driver";
	
	public static void main(String arg[]) {
		
	try {
		   
			MysqlDataSource mysqlDS = new MysqlDataSource();
	
			mysqlDS.setURL("jdbc:mysql://localhost:3306/superheroes");
			mysqlDS.setUser("root");
			mysqlDS.setPassword("");
			
			System.out.println("Press Enter on the Console to Continue");
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
			sc.close();
	
			Connection conn = mysqlDS.getConnection();
			Statement myStmt = conn.createStatement();
			String query = "select * from superhero_table;";
			ResultSet rs = myStmt.executeQuery(query);
	
			while( rs.next() ) {
				//  id = rs.getInt("id");
				
				String name = rs.getString("name");
				String realfirstname = rs.getString("real_first_name");
				String realsurname = rs.getString("real_surname");
				String dob = rs.getString("dob");
				double powers = rs.getInt("powers");
				System.out.print(name + ", ");
				System.out.print(realfirstname+", ");
				System.out.print(realsurname+", ");
				System.out.print(dob+", ");
				System.out.println(powers+", ");
				
			}
			} catch( SQLException se ) {
			            System.out.println(se.getMessage());
			}
	}
}