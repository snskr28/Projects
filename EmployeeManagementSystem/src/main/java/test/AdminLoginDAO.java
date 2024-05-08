package test;
import java.sql.*;
public class AdminLoginDAO {
	AdminBean ab=null;
	public AdminBean login(String uN,String pW) {
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement("select * from admin61 where uname=? and pword=?");
			ps.setString(1, uN);
			ps.setString(2, pW);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				ab=new AdminBean();
				ab.setUname(uN);
				ab.setPword(pW);
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getNString(4));
				ab.setAddr(rs.getString(5));
				ab.setMid(rs.getNString(6));
				ab.setPhno(rs.getLong(7));
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return ab;
	}
}
