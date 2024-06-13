package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet is Java class that is executed on the server side when request is received from
 * the client and produces response to be sent to the client.
 * */

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	// doGet() is executed when GET request is received from the client
	// for servlet url given in web.xml or @WebServlet()
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp); // delete this line
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter(); // getWriter() returns a PrintWriter object, using it we will write into response body.
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Hello</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>This is HelloServlet!</h1>");
		Date now = new Date();
		out.println(now.toString());
		out.println("</body>");
		out.println("</html>");
	}
}





