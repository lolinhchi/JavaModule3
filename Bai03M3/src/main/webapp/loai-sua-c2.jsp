<%@page import="businessLogic.*"%>
<%@page import="javaBeans.LoaiSua"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loại sữa C2</title>
<%
	List<LoaiSua> dsls = LoaiSuaBL.docTatCa();
%>
</head>
<body>
<table border="1">
	<caption>DANH SÁCH LOẠI SỮA</caption>
	<tr>
		<th>Mã loại</th>
		<th>Tên loại</th>
	</tr>
	<%for(LoaiSua ls:dsls){ %>
		<tr>
			<td><%=ls.getMaLoai() %></td>
			<td><%=ls.getTenLoai() %></td>
		</tr>
	<%} %>
</table>
</body>
</html>