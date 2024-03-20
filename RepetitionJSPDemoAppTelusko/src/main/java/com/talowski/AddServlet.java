/**
 * 
 */
package com.talowski;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
public class AddServlet extends HttpServlet{


	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("num1"));	
		int j = Integer.parseInt(req.getParameter("num2"));	
		
		int k = i+j;
		
		PrintWriter out = res.getWriter();
		out.println("result is " + k);
		
	}
	/*
	 * public void doPost(HttpServletRequest req, HttpServletResponse res) throws
	 * IOException { doGet(req, res); }
	 */
}

