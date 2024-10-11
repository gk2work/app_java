package p1;

import java.sql.DriverManager;

public class A {
	public static void main(String[] args) {
		try {
			//connect to database
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1.3306/augdb","root","test")
			//Eexecute SQL Query
//			close database exception
		} catch (Exception e ) {
//			TODO: handle exception
			e.printStackTrace();
		}
	}
}
