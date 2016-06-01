package com.city.oa.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.oa.business.IDepartmentBusiness;
import com.city.oa.business.impl.DepartmentBusinessImpl;

/**
 * Servlet implementation class DepartmentAddServlet
 */
@WebServlet("/department/add.do")
public class DepartmentAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
			IDepartmentBusiness db=new DepartmentBusinessImpl();
			String code=request.getParameter("code");
			String name=request.getParameter("name");
			
			db.add(code, name);
			System.out.print("OK");
			
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
