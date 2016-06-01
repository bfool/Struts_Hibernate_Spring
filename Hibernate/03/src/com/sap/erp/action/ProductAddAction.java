package com.sap.erp.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sap.erp.business.impl.ProductBusinessImpl;
import com.sap.erp.value.ProductValue;

/**
 * Servlet implementation class ProductAddAction
 */
@WebServlet("/add.do")
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
		String pcode = request.getParameter("pcode");
		String pname = request.getParameter("pname");
		String ppdate = request.getParameter("pdate");
		String eedate = request.getParameter("edate");
		Double unitprice = Double.valueOf(request.getParameter("unitprice"));
		Double qtyinstock = Double.valueOf(request.getParameter("qtyinstock"));
		
		Date pdate = null,edate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			pdate = sdf.parse(ppdate);
			edate = sdf.parse(eedate);
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		
		System.out.println("ppdate:" + ppdate + "eedate:" + eedate);
		
		ProductValue pv = new ProductValue();
		pv.setPname(pname);
		pv.setPcode(pcode);
		pv.setPdate(pdate);
		pv.setEdate(edate);
		pv.setUnitprice(unitprice);
		pv.setQtyinstock(qtyinstock);
		
		ProductBusinessImpl pbi = new ProductBusinessImpl();
		try {
			pbi.add(pv);
		} catch (Exception e) {
			System.out.println("addaction error:" + e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
