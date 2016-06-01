package com.city.erp.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.erp.business.impl.ProductBusinessImpl;
import com.city.erp.value.ProductValue;

/**
 * Servlet implementation class ProductAddAction
 */
@WebServlet("/product/add.do")
public class ProductAddAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductAddAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pno = Integer.valueOf(request.getParameter("pno"));
		String pename = request.getParameter("pename");
		String pmodel = request.getParameter("pmodel");
		double price = Double.valueOf(request.getParameter("price"));
		
		ProductValue pv = new ProductValue();
		pv.setPno(pno);
		pv.setPename(pename);
		pv.setPmodel(pmodel);
		pv.setPrice(price);
		
		System.out.println(pno+","+pename+","+pmodel+","+price);
		
		
		ProductBusinessImpl pbi = new ProductBusinessImpl();
		
		try {
			pbi.add(pv);
		} catch (Exception e) {
			System.out.println("action error:"+e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
