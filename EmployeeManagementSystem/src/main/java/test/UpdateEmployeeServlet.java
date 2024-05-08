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

@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		HttpSession hs=req.getSession(false);
		if(hs==null) {
			req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, res);
		}else {
			String eid=req.getParameter("eid");
			float bSal = Float.parseFloat(req.getParameter("bsal"));
			float hra = Float.parseFloat(req.getParameter("hra"))*bSal;
			float da = Float.parseFloat(req.getParameter("da"))*bSal;
			float totSal = bSal+hra+da;
			ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)hs.getAttribute("alist");
			Iterator<EmployeeBean> it=al.iterator();
			while(it.hasNext()) {
				EmployeeBean eb=(EmployeeBean)it.next();
				if(eid.equals(eb.getEid())) {
					eb.setBsal(bSal);
					eb.setHra(hra);
					eb.setDa(da);
					eb.setTotSal(totSal);
					int k=new UpdateEmployeeDAO().update(eb);
					if(k>0) {
						req.setAttribute("msg", "Employee Updated Successfuly...<br>");
						req.getRequestDispatcher("UpdateEmployee.jsp").forward(req, res);
					}
					break;
				}
			}
		}
	}
}
