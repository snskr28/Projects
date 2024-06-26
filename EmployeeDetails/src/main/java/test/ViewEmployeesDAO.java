package test;
import java.sql.*;
import java.util.*;
public class ViewEmployeesDAO {
	public ArrayList<EmployeeBean> al=new ArrayList<>();
	public ArrayList<EmployeeBean> retrieve(){
		try {
			//Establishing Connection
			Connection con=DBConnection.getCon();
			//Creating Statement Object
			PreparedStatement ps=con.prepareStatement("select * from employee61");
			//Executing Query
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				EmployeeBean eb=new EmployeeBean();
				eb.setEid(rs.getString(1));
				eb.setEname(rs.getString(2));
				eb.setEdesg(rs.getString(3));
				eb.setBsal(rs.getFloat(4));
				eb.setHra(rs.getFloat(5));
				eb.setDa(rs.getFloat(6));
				eb.setTotSal(rs.getFloat(7));
				//Adding Bean object to ArrayList
				al.add(eb);
			}//end of loop
		}//end of try
		catch(Exception e) {
			System.out.println(e);
		}
		return al;
	}
}
