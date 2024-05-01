package test;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;
@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		//Calculating HRA,DA,total Salary
		float bsal=Float.parseFloat(req.getParameter("bsal"));
		float hra= bsal * Float.parseFloat(req.getParameter("hra"));
		float da= bsal * Float.parseFloat(req.getParameter("da"));
		float totSal= bsal+hra+da;
		//Creating and loading data to Bean Object
		EmployeeBean eb=new EmployeeBean();
		eb.setEid(req.getParameter("eid"));
		eb.setEname(req.getParameter("name"));
		eb.setEdesg(req.getParameter("desg"));
		eb.setBsal(bsal);
		eb.setHra(hra);
		eb.setDa(da);
		eb.setTotSal(totSal);
		//Performing insert operation
		AddEmployeeDAO ad=new AddEmployeeDAO();
		int k=ad.insert(eb);
		if(k>0) {
			//Forwarding request
			req.getRequestDispatcher("AddEmployee.jsp").forward(req, res);
		}
	}
}
