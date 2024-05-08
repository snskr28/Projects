package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			EmployeeBean eb=new EmployeeBean();
			eb.setEid(req.getParameter("eid"));
			eb.setEname(req.getParameter("ename"));
			eb.setEdesg(req.getParameter("desg"));
			float bsal=Float.parseFloat(req.getParameter("bsal"));
			float hra=bsal*Float.parseFloat(req.getParameter("hra"));
			float da=bsal*Float.parseFloat(req.getParameter("da"));
			float totSal=bsal+hra+da;
			eb.setBsal(bsal);
			eb.setHra(hra);
			eb.setDa(da);
			eb.setTotSal(totSal);
			int k=new AddEmployeeDAO().insert(eb);
			if(k>0) {
				req.getRequestDispatcher("AddEmployee.jsp").forward(req, res);
			}
		}
	}
}
