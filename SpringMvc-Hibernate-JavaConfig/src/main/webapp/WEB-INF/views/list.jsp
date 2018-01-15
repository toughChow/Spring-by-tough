<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="http://apps.bdimg.com/libs/jquery/2.1.1/jquery.js"></script>
	<style type="text/css">
	#table{
		width:500px;
	}
	</style>
</head>
<body>
	<p>方向：
	<a href="javascript:void(0);" class="all">全部</a>
	<a href="javascript:void(0);" class="one">java开发</a>
	<a href="javascript:void(0);" class="one">大数据</a>
	<a href="javascript:void(0);" class="one">软件测试</a>
	<a href="javascript:void(0);" class="one">web前端</a>
	<p> 性别：
	<a href="javascript:void(0);" class="all">全部</a>
	<a href="javascript:void(0);" class="two">男</a>
	<a href="javascript:void(0);" class="two">女</a>
	<p>
	<table border="1" cellspacing="0" cellpadding="0" id="table">
		<thead>
			<tr>
				<td>学号</td>
				<td>姓名</td>
				<td>性别</td>
				<td>专业</td>
				<td>方向</td>
				<td>技术</td>
				<td>能力</td>
			</tr>
		</thead>
		<tbody class="tbody">
			<c:forEach items="${list }" var="list">
				<tr>
					<td>${list.stuNo }</td>
					<td>${list.name }</td>
					<td>${list.sex }</td>
					<td>${list.profession }</td>
					<td>${list.category }</td>
					<td>${list.skill }</td>
					<td>${list.ability }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p><a href="to_save">新增学生</a>
	<script type="text/javascript">
		$(function() {
			$(".all").click(
					function() {
						$(".tbody").html("");
						var opt = {
							url : "byAll",
							type : "post",
							dataType : "json",
							success : function(data) {
								for (var i = 0; i < data.list.length; i++) {
									$("#table").append(
											"<tbody class='tbody'><tr><td>"
													+ data.list[i].stuNo
													+ "</td><td>"
													+ data.list[i].name
													+ "</td><td>"
													+ data.list[i].sex
													+ "</td><td>"
													+ data.list[i].profession
													+ "</td><td>"
													+ data.list[i].category
													+ "</td><td>"
													+ data.list[i].skill
													+ "</td><td>"
													+ data.list[i].ability
													+ "</td></tr></tbody>");
								}
							}
						}
						$.ajax(opt);
					})
			$(".one").click(
					function() {
						var category = $(this).html();
						var content = {
							category : category
						};
						$(".tbody").html("");
						var opt = {
							url : "byCategory",
							type : "post",
							dataType : "json",
							data : content,
							success : function(data) {
								for (var i = 0; i < data.list.length; i++) {
									$("#table").append(
											"<tbody class='tbody'><tr><td>"
													+ data.list[i].stuNo
													+ "</td><td>"
													+ data.list[i].name
													+ "</td><td>"
													+ data.list[i].sex
													+ "</td><td>"
													+ data.list[i].profession
													+ "</td><td>"
													+ data.list[i].category
													+ "</td><td>"
													+ data.list[i].skill
													+ "</td><td>"
													+ data.list[i].ability
													+ "</td></tr></tbody>");
								}
							}
						}
						$.ajax(opt);
					})
			$(".two").click(
					function() {
						var sex = $(this).text();
						var content = {
							sex : sex
						};
						$(".tbody").html("");
						var opt = {
							url : "bySex",
							type : "post",
							dataType : "json",
							data : content,
							success : function(data) {
								for (var i = 0; i < data.list.length; i++) {
									$("#table").append(
											"<tbody class='tbody'><tr><td>"
													+ data.list[i].stuNo
													+ "</td><td>"
													+ data.list[i].name
													+ "</td><td>"
													+ data.list[i].sex
													+ "</td><td>"
													+ data.list[i].profession
													+ "</td><td>"
													+ data.list[i].category
													+ "</td><td>"
													+ data.list[i].skill
													+ "</td><td>"
													+ data.list[i].ability
													+ "</td></tr></tbody>");
								}
							}
						}
						$.ajax(opt);
					})
			
		})
	</script>
</body>
</html>