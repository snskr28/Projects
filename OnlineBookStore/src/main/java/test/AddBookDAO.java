package test;
import java.sql.*;
public class AddBookDAO {
	public int k=0;
	public int insert(BookBean bb) {
		try {
			//Establishing Connection
			Connection con=DBConnection.getCon();
			//Preparing Statement
			PreparedStatement ps=con.prepareStatement("insert into bookdetails61 values(?,?,?,?,?)");
			//Appending values to PreparedStatement Object
			ps.setString(1, bb.getbCode());
			ps.setString(2, bb.getbName());
			ps.setString(3, bb.getbAuthor());
			ps.setFloat(4, bb.getbPrice());
			ps.setInt(5, bb.getbQty());
			//Executing Query
			k=ps.executeUpdate();
		}//end of try
		catch(Exception e) {
			System.out.println(e);
		}
		return k;
	}
}
