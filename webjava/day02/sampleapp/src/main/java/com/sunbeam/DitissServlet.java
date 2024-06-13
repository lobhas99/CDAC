package com.sunbeam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ditiss")
public class DitissServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("uname");
		String pass = req.getParameter("passwd");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>DITISS</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>DITISS!!</h1>");
		if(user.equals(pass))
			out.println("You are most welcome.");
		else
			out.println("You are not valid user.");
		out.println("</body>");
		out.println("</html>");

	}
}

