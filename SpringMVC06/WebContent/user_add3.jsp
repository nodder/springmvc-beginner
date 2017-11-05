<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>添加用户信息</h1>
	<form action="user/add3.do" method="post">
		编号：<input type="text" name="userId"/>
		姓名：<input type="text" name="userName"/>
		性别：<input type="text" name="userSex"/>
		兴趣爱好：
			<input type="checkbox" name="userXq" value="LOL"/>LOL
			<input type="checkbox" name="userXq" value="DOTA"/>DOTA<br/>
			
		<input type="submit" value="提交" />
	</form>
</body>
</html>