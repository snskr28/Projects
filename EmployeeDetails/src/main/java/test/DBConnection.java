package test;
import java.sql.*;
public class DBConnection {
	public static Connection con=null;
	static {
		try {
			//Loading Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Establishing Connection
			con=DriverManager.getConnection(DBInfo.dbUrl,DBInfo.uName,DBInfo.pWord);
		}//end of try
		catch(Exception e) {
			System.out.println(e);
		}
	}//end of static block
	//Creating method for creating Connection
	public static Connection getCon() {
		return con;
	}
}
