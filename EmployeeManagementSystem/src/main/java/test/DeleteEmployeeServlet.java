package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/delete")
public class DeleteEmployeeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			String eid=req.getParameter("eid");
			ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)hs.getAttribute("alist");
			Iterator<EmployeeBean> it=al.iterator();
			while(it.hasNext()) {
				EmployeeBean eb=(EmployeeBean)it.next();
				if(eid.equals(eb.getEid())) {
					al.remove(eb);
					int k=new DeleteEmployeeDAO().delete(eb);
					if(k>0) {
						req.setAttribute("msg", "Employee Deleted Successfully...");
						req.getRequestDispatcher("DeleteEmployee.jsp").forward(req, res);
					}
					break;
				}
			}
		}
	}
}
