package com.etc.bean;

public class Student {
	private String num;
	private String name;
	private String sex;
	private String academy;
	private String cla;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAcademy() {
		return academy;
	}
	public void setAcademy(String academy) {
		this.academy = academy;
	}
	public String getCla() {
		return cla;
	}
	public void setCla(String cla) {
		this.cla = cla;
	}
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", sex=" + sex + ", academy=" + academy + ", cla=" + cla
				+ "]";
	}
	
	
}
