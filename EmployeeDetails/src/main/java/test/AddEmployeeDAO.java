package test;
import java.sql.*;
public class AddEmployeeDAO {
	public int k=0;
	//Method for inserting values into database
	public int insert(EmployeeBean eb) {
		//Establishing Connection
		Connection con=DBConnection.getCon();
		try {
			//Creating Statement Object
			PreparedStatement ps=con.prepareStatement("insert into employee61 values(?,?,?,?,?,?,?)");
			//Appending values to PreparedStatement Object
			ps.setString(1, eb.getEid());
			ps.setString(2, eb.getEname());
			ps.setString(3, eb.getEdesg());
			ps.setFloat(4, eb.getBsal());
			ps.setFloat(5, eb.getHra());
			ps.setFloat(6, eb.getDa());
			ps.setFloat(7, eb.getTotSal());
			//executing query
			k=ps.executeUpdate();
		}//end of try
		catch(Exception e) {
			System.out.println(e);
		}
		return k;
	}
}
