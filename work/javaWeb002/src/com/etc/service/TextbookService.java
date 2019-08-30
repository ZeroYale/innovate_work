package com.etc.service;

import com.etc.bean.Student;
import com.etc.bean.Textbook;
import com.etc.dao.TextbookDAO;

public class TextbookService {
	TextbookDAO textbookDAO = new TextbookDAO();
	
	public int AddTextbook(Textbook textbook) {
		return textbookDAO.AddTextbook(textbook);
	}
	
	public int UpdateTextbook(Textbook textbook) {
		return textbookDAO.UpdateTextbook(textbook);
	}
	
	public int DeleteTextbook(String id) {
		return textbookDAO.DeleteTextbook(id);
	}
	
	public Textbook FindTextbook(String id) {
		return textbookDAO.FindTextbook(id);
	}
} 
