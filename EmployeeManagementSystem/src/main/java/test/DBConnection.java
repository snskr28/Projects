package test;
import java.sql.*;
public class DBConnection {
	public static Connection con=null;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(DBInfo.DBUrl,DBInfo.uName,DBInfo.pWord);
		}//end of try
		catch(Exception e) {
			System.out.print(e);
		}
	}
	public static Connection getCon() {
		return con;
	}
}
