<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/ServletDemo03?method=addStu" method="post">
	用户<input type="text" name="username"/><br/>
	<button>提交</button>
</form>
<br/>
<a href="${pageContext.request.contextPath}/ServletDemo03?method=delStu">删除学生</a><br/>
<button onclick="fn()">按钮</button>
<script>
function fn(){
	$.post("${pageContext.request.contextPath}/ServletDemo03?",{"method":"checkStu","user":"tom"},function(data){
		alert(data);
	});
}
</script>
</body>
</html>