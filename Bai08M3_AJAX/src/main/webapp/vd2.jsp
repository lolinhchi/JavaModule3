<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chào</title>
<%
	String lc = "";
	if(request.getParameter("btnChao") != null){
		lc = "Chào mừng bạn " + request.getParameter("ten") + " Lập trình AJAX";
	}
%>
</head>
<body>
<form >
	<p><label>Nhập tên: </label><input type="text" name="ten" /></p>
	<p><%=lc %></p>
	<p><input type="submit" name="btnChao" value="Chào" /></p>
</form>

</body>
</html>