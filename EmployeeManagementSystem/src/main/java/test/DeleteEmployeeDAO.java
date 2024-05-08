package test;
import java.sql.*;
public class DeleteEmployeeDAO {
	public int k=0;
	public int delete(EmployeeBean eb) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("Delete from employee61 where eid=?");
			ps.setString(1, eb.getEid());
			k=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return k;
	}
}
