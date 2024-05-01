package test;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
@WebServlet("/code")
public class ViewBookCodeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		BookBean bb=new BookBean();
		bb.setbCode(req.getParameter("bcode"));//getting book code
		//Retrieving data
		ViewBookCodeDAO vcd=new ViewBookCodeDAO();
		vcd.retrieve(bb);
		//Attaching Bean object to request
		req.setAttribute("bean", bb);
		//Forwarding Request
		req.getRequestDispatcher("ViewBookCode.jsp").forward(req, res);
	}
}
