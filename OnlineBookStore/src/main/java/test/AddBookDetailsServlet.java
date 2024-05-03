package test;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
@WebServlet("/add")
public class AddBookDetailsServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		BookBean bb=new BookBean();
		//setting values to bean object
		bb.setbCode(req.getParameter("bcode"));
		bb.setbName(req.getParameter("bname"));
		bb.setbAuthor(req.getParameter("bauthor"));
		bb.setbPrice(Float.parseFloat(req.getParameter("bprice")));
		bb.setbQty(Integer.parseInt(req.getParameter("qty")));
		//Inserting values to database
		AddBookDAO ad=new AddBookDAO();
		int k=ad.insert(bb);
		if(k>0) {
			req.getRequestDispatcher("AddBookDetails.jsp").forward(req, res);//Forwarding request to JSP
		}
	}
}
