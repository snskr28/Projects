package test;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.io.*;
@WebServlet("/admin")
public class AdminLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		String uname=req.getParameter("uname");
		String pword=req.getParameter("pword");
		AdminBean ab=new AdminLoginDAO().login(uname, pword);
		if(ab==null) {
			req.setAttribute("msg", "Invalid username or password");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			HttpSession hs=req.getSession();//Creating Session Object
			hs.setAttribute("abean", ab);
			req.getRequestDispatcher("AdminLogin.jsp").forward(req, res);
		}
		
	}
}
