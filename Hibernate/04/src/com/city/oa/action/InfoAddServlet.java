package com.city.oa.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.city.oa.business.impl.InfoBusinessImpl;
import com.city.oa.value.InfoValue;

/**
 * Servlet implementation class InfoAddServlet
 */
@WebServlet("/info/add.do")
public class InfoAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String category = request.getParameter("category");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		String infoDate = request.getParameter("date");
		
//		InfoValue iv = new InfoValue();
//		iv.setContent(content);
//		iv.setInfodate(date);
//		iv.setSubject(subject);
//		iv.setGno(Integer.parseInt(category));
		
		InfoBusinessImpl ib = new InfoBusinessImpl();
		try {
			ib.add(Integer.valueOf(category), subject, content, infoDate);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
