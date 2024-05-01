package test;
import java.sql.*;
import java.util.*;
public class ViewAllBookDAO {
	public ArrayList<BookBean> al=new ArrayList<>();
	public ArrayList<BookBean> retrieve(){
		try {
			//Establishing Connection
			Connection con=DBConnection.getCon();
			//Preparing Statement
			PreparedStatement ps=con.prepareStatement("select * from bookdetails61");
			//Executing Query
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				BookBean bb=new BookBean();
				//Appending Values to bean Object
				bb.setbCode(rs.getString(1));
				bb.setbName(rs.getString(2));
				bb.setbAuthor(rs.getString(3));
				bb.setbPrice(rs.getFloat(4));
				bb.setbQty(rs.getInt(5));
				//Adding Bean Object to ArrayList
				al.add(bb);
			}//end of loop
		}//end of try
		catch(Exception e) {
			System.out.println(e);
		}
		return al;
	}
}
