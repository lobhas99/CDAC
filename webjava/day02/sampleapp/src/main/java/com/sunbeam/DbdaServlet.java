package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dbda",
		loadOnStartup = 2,
		initParams = { 
			@WebInitParam(name="color", value="green"),
			@WebInitParam(name="course-description", value="PG Diploma course in Big Data Analytics")
		})
public class DbdaServlet extends HttpServlet {
	private String color = "white";
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);	
		System.out.println("DbdaServlet.init() called.");
		color = config.getInitParameter("color");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("DbdaServlet.doGet() called.");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>DBDA</title>");
		out.println("</head>");
		out.printf("<body bgcolor='%s'>\n", color);
		out.println("<h1>Welcome to DBDA!!</h1>");
		String desc = this.getInitParameter("course-description");
		out.println(desc);
		out.println("</body>");
		out.println("</html>");
	}
	@Override
	public void destroy() {
		System.out.println("DbdaServlet.destroy() called.");
	}
}
