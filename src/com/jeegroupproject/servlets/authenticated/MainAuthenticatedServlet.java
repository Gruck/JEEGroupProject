package com.jeegroupproject.servlets.authenticated;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeegroupproject.filters.IsAuthenticated;

/**
 * Servlet implementation class MainAuthenticatedServlet
 */
@WebServlet("/MainServlet")
public class MainAuthenticatedServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	public static final String VIEW = "/WEB-INF/Views/authenticated/mainauthenticated.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainAuthenticatedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.getAttribute(IsAuthenticated.AUTH_PERSON_ATTR_NAME); // returns the authenticated person set by the filter
		
		//TODO : do something with the authenticated person
		
		this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
