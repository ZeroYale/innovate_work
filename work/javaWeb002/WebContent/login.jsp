<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<link rel="stylesheet" type="text/css" href="js/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
<title>login</title>
</head>
<body>
<b>请输入您的信息:</b>
<hr>
<br/>
<form action="loginServlet" method="post">
<div class="form-group">
	<label for="name">输入id:</label>
	<input type="text" class="form-control"  placeholder="请输入id"  name="num"/>
</div>

<div class="form-group">
	<label for="text">输入名字</label>
	<input type="text" class="form-control" placeholder="请输入名字" name="name"/>
</div>
<button type="submit" class="btn btn-warning">登录</button>

<br/>
请选择身份:
<input type="radio" name="10" value="1">学生
<input type="radio" name="10" value="2" checked>教师
<img src="img/1.jpg"/ style="position:absolute; left:100px; top:300px; ">
</body>
</html>