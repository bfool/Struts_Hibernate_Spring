package com.city.oa.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.business.impl.EmployeeBusinessImpl;
import com.city.oa.value.DepartmentValue;
import com.city.oa.value.EmployeeValue;

/**
 * Servlet implementation class EmployeeAddServlet
 */
@WebServlet("/employee/add.do")
public class EmployeeAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try{
			
			String id=request.getParameter("id");
			String password=request.getParameter("password");
			String name=request.getParameter("name");
			String sage=request.getParameter("age");
			String sdeptno=request.getParameter("departmentNo");
			
			IEmployeeBusiness eb=new EmployeeBusinessImpl();
			EmployeeValue ev=new EmployeeValue();
			
			ev.setId(id);
			ev.setPassword(password);
			ev.setName(name);
			
			ev.setAge(Integer.parseInt(sage));
			int deptno=Integer.parseInt(sdeptno);
			DepartmentValue dv=new DepartmentValue();
			dv.setNo(deptno);
			ev.setDepartment(dv);
					
			
			eb.add(ev);
			
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
