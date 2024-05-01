package test;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.util.*;
@WebServlet("/view")
public class ViewAllBookServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		ViewAllBookDAO vbd=new ViewAllBookDAO();
		ArrayList<BookBean> bb=vbd.retrieve();
		req.setAttribute("alist", bb);//Adding ArrayList to request 
		//Forwarding Request to JSP
		req.getRequestDispatcher("ViewAllBooks.jsp").forward(req,res);
	}
}
