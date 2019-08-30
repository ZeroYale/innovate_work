package com.etc.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.etc.bean.Textbook;
import com.etc.db.ConnDB;
import com.etc.service.TextbookService;


public class BookUpdateServlet extends HttpServlet {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		
		String ISBN = request.getParameter("ISBN");
		String num = request.getParameter("num");
		String publishing = request.getParameter("publishing");
		String author = request.getParameter("author");
		String price = request.getParameter("price");
		
		Textbook textbook = new Textbook(); 
		textbook.setNum(num);
		textbook.setISBN(ISBN);
		textbook.setPublishing(publishing);
		textbook.setAuthor(author);
		textbook.setPrice(price);
		
		TextbookService textbookService = new TextbookService();
		textbookService.UpdateTextbook(textbook);
	}

}
