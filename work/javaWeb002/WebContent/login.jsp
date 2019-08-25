<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>login</title>
</head>
<body>
<b>请输入您的信息:</b>
<hr>
<br/>
<form action="loginServlet" method="post">
输入id:
<input type="text" name="num"/>
输入名字:
<input type="text" name="name"/>
<input type="submit" value="登录"/>
<br/>
请选择身份:
<input type="radio" name="10" value="1">学生
<input type="radio" name="10" value="2" checked>教师
<img src="img/1.jpg"/ style="position:absolute; left:100px; top:150px; ">
</body>
</html>