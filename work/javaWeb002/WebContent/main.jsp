<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset="UTF-8">
<link rel="stylesheet" type="text/css" href="js/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
<title>main</title> 
</head>
<body>


<form action=bookFindServlet method="post">
要查询的教材id:
<input type="text" name="num"/>
<button type="submit" class="btn btn-warning" >教材查询</button>
<br/>
</form>


<form action="bookAddServlet" method="post">
<!--增加-->
要增加的教材id:
<input type="text" name="num"/>
要增加的教材ISBN:
<input type="text" name="ISBN"/>
<!--这里少了名字的添加，数据库的问题-->
要增加的教材出版社:
<input type="text" name="publishing"/>
要增加的教材作者:
<input type="text" name="author"/>
要增加的教材价格:
<input type="text" name="price"/>
<button type="submit" class="btn btn-success">教材录入</button>
</form>


<form action="bookUpdateServlet" method="post">
<!--修改-->

<br/>
修改后的ISBN:
<input type="text" name="ISBN"/>
修改后的出版社:
<input type="text" name="publishing"/>
修改后的作者:
<input type="text" name="author"/>
修改后的价格:
<input type="text" name="price"/>
要修改的教材num:
<input type="text" name="num"/>
<button type="submit" class="btn btn-info">
				<span class="glyphicon glyphicon-pencil"></span>
				修改</button>
</form>


<form action=bookDelteServlet method="post">
要删除的教材id:
<input type="text" name="num"/>
<button type="submit" class="btn btn-danger">
<span class="glyphicon glyphicon-trash"></span>
			教材删除</button>
<br/>
</form>



<br/>
<hr>



<form action="courseFindServlet" method="post">
要查询的课程id:
<input type="text"  name="num"/>
<button type="submit" class="btn btn-warning" >课程查询</button>
<br/>
</form>


<form action="courseAddServlet" method="post">
<!--注册(要所有的信息啊！)-->
要增加的课程id:
<input type="text" name="num"/>
要增加的课程名字：
<input type="text" name="name"/>
要增加的课程类别：
<input type="text" name="type"/>
要增加的课程学分：
<input type="text" name="credit"/>
<button type="submit" class="btn btn-success">课程录入</button>
</form>

<!-- 新 -->
<form action=courseDelteServlet method="post">
要删除的课程id:
<input type="text" name="num"/>
<button type="submit" class="btn btn-danger">
<span class="glyphicon glyphicon-trash"></span>
			课程删除</button>
<br/>
</form>

<br/>
<hr>

<form action="teaFindServlet" method="post">

要查询的教师num:
<input type="text" name="num"/>
<button type="submit" class="btn btn-warning">教师信息查询</button>
<br/>
</form>


<form action="teaAddServlet" method="post">
<!--注册(要所有的信息啊！)-->
要增加的教师num:
<input type="text" name="num"/>
要增加的教师名字:
<input type="text" name="name"/>
要增加的教师性别:
<input type="text" name="sex"/>
要增加的教师学院:
<input type="text" name="academy"/>
要增加的教师权力:
<input type="text" name="authority"/>
<button type="submit" class="btn btn-success">教师信息录入</button>


</form>

<form action=teaDelteServlet method="post">
要删除的教师id:
<input type="text" name="num"/>
<button type="submit" class="btn btn-danger">
<span class="glyphicon glyphicon-trash"></span>
			教师删除</button>
<br/>
</form>

<br/>
<hr>
<form action="stuFindServlet" method="post">
要查询的学生num:
<input type="text" name="num"/>
<button type="submit" class="btn btn-warning">学生信息查询</button>
<br/>
</form>

<form action="stuAddServlet" method="post">

<!--注册(要所有的信息啊！)-->
要增加的学生num:
<input type="text" name="num"/>
要增加的学生名字:
<input type="text" name="name"/>
要增加的学生性别:
<input type="text" name="sex"/>
要增加的学生学院:
<input type="text" name="academy"/>
要增加的学生班级:
<input type="text" name="cla"/>
<button type="submit" class="btn btn-success">学生信息录入</button>
</form>

<form action=stuDelteServlet method="post">
要删除的学生id:
<input type="text" name="num"/>
<button type="submit" class="btn btn-danger">
<span class="glyphicon glyphicon-trash"></span>
			学生删除</button>
<br/>
</form>
</body>
</html>