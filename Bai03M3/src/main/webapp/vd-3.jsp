<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>Tên đơn vị: <%=application.getAttribute("tenDV") %> </p>
<p>Tên người dùng: <%=session.getAttribute("tenND") %></p>
<p>Tên yêu cầu: <%=request.getAttribute("tenYC") %></p>
<p>Ngữ cảnh trang: <%=pageContext.getAttribute("trang") %></p>
</body>
</html>