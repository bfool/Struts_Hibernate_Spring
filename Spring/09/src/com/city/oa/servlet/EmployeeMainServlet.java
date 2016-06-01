package com.city.oa.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.oa.business.IEmployeeBusiness;
import com.city.oa.business.impl.EmployeeBusinessImpl;
import com.city.oa.value.EmployeeValue;

/**
 * Servlet implementation class EmployeeMainServlet
 */
@WebServlet("/employee/main.do")
public class EmployeeMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			String departNo=request.getParameter("deptno");
			int dno=Integer.parseInt(departNo);
			IEmployeeBusiness eb=new EmployeeBusinessImpl();
			List<EmployeeValue> list=eb.getListByDepartment(dno);
			request.setAttribute("list", list);
			request.getRequestDispatcher("main.jsp").forward(request, response);
			
			
		}
		catch(Exception e)
		{
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
