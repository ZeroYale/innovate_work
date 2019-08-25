<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset="UTF-8">
<title>stu</title>
</head>
<body>

<form action="stuFindServlet" method="post">
要查询的学生id:
<input type="text" name="num"/>
<button type="submit" value="1">学生信息查询</button>
<br/>
</form>

<form action=bookFindServlet method="post">
要查询的教材id:
<input type="text" name="num"/>
<button type="submit" value="1">教材查询</button>
<br/>
</form>

<form action="textFindServlet" method="post">
要查询的课程id:
<input type="text" name="num"/>
<button type="submit" value="5">课程查询</button>
<br/>
</form>
</body>
</html>