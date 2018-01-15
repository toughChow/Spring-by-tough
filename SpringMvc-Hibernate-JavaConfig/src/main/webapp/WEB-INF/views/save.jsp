<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
#main{
	width:500px;
	height:500px;
	margin-left:500px;
}
</style>
</head>
<body>
<div id="main">
<h2>添加学生信息</h2>
<form action="do_save" method="post">
	<p>请输入学生学号：<input type="text" name="stuNo">
	<p>请输入学生姓名：<input type="text" name="name">
	<p>请输入学生性别：<input type="text" name="sex">
	<p>请输入学生专业：<input type="text" name="profession">
	<p>请输入学生方向：<input type="text" name="category">
	<p>请输入学生技术：<input type="text" name="skill">
	<p>请输入学生能力：<input type="text" name="ability">
	<p><input type="submit" value="提交"><input type="reset" value="重置">
</form>
</div>
</body>
</html>