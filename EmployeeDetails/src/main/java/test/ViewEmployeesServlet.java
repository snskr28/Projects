package test;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;
import java.util.*;
import java.io.*;
@WebServlet("/view")
public class ViewEmployeesServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		ViewEmployeesDAO ved=new ViewEmployeesDAO();
		ArrayList<EmployeeBean> al=ved.retrieve();
		req.setAttribute("alist", al);//Adding attribute to request Object
		req.getRequestDispatcher("ViewEmployees.jsp").forward(req, res);
	}
}
