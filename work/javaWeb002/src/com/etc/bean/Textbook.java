package com.etc.bean;

public class Textbook {
	String ISBN;
	String num;
	String publishing;
	String author;
	String price;
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPublishing() {
		return publishing;
	}
	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Textbook [ISBN=" + ISBN + ", num=" + num + ", publishing=" + publishing + ", author=" + author
				+ ", price=" + price + "]";
	}
}
