package test;
import java.sql.*;
public class ViewBookCodeDAO {
	public BookBean retrieve(BookBean bb) {
		try {
			//Establishing Connection
			Connection con=DBConnection.getCon();
			//Preparing Statement
			PreparedStatement ps=con.prepareStatement("select * from bookdetails61 where bcode=?");
			//Appending Value to PreparedStatement Object
			ps.setString(1, bb.getbCode());
			//Executing Query
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				bb.setbName(rs.getString(2));
				bb.setbAuthor(rs.getString(3));
				bb.setbPrice(rs.getFloat(4));
				bb.setbQty(rs.getInt(5));
			}
		}//end of try
		catch(Exception e) {
			System.out.println(e);
		}
		return bb;
	}
}
