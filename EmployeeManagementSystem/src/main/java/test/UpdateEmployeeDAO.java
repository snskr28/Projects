package test;
import java.sql.*;

public class UpdateEmployeeDAO {
	public int k=0;
	public int update(EmployeeBean eb) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("update employee61 set bsal=?, hra=?, da=?, totsal=? where eid=?");
			ps.setFloat(1, eb.getBsal());
			ps.setFloat(2, eb.getHra());
			ps.setFloat(3, eb.getDa());
			ps.setFloat(4, eb.getTotSal());
			ps.setString(5, eb.getEid());
			k=ps.executeUpdate();
		}//end of try
		catch(Exception e) {
			System.out.println(e);
		}
		return k;
	}
}
