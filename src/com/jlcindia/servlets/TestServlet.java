package com.jlcindia.servlets;

import java.io.IOException;
//import java.sql.Date;

import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet{
	protected void service(HttpServletRequest request,HttpServletResponse response)throws
	ServletException,IOException{
		String fnm=request.getParameter("fname");
		Date dt=new Date();
		if (fnm==null || fnm.trim().length()==0) {
			fnm="Guest";
		}
		String msg="<h1>Hi"+fnm+"<br/>You have sent request on"+dt;
		response.setContentType("text/html");
		response.getWriter().write(msg);
	}
}
