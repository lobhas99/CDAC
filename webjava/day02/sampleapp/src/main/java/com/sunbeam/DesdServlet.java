package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DesdServlet extends HttpServlet {
	private String color = "white";
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);	
		System.out.println("DesdServlet.init() called.");
		color = config.getInitParameter("color");
		// JDBC connection creation -- SqlException ex -- chain into ServletException and then throw it
			// throw new ServletException(ex);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DesdServlet.doGet() called.");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>DESD</title>");
		out.println("</head>");
		out.printf("<body bgcolor='%s'>\n", color);
		out.println("<h1>Welcome to DESD!!</h1>");
		String desc = this.getInitParameter("course-description");
		out.println(desc);
		out.println("</body>");
		out.println("</html>");
	}
	@Override
	public void destroy() {
		System.out.println("DesdServlet.destroy() called.");
	}
}
