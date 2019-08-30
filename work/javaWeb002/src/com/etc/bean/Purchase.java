package com.etc.bean;

public class Purchase {
	String num;
	String course;
	String teacher;
	String cla;
	String quantity;
	String price;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getCla() {
		return cla;
	}
	public void setCla(String cla) {
		this.cla = cla;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Purchase [num=" + num + ", course=" + course + ", teacher=" + teacher + ", cla=" + cla + ", quantity="
				+ quantity + ", price=" + price + "]";
	}
	
}
