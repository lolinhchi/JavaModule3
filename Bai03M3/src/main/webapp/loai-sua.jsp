<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%
	Class.forName("com.mysql.jdbc.Driver");
	String url = "jdbc:mysql://localhost:3306/qlbansua";
	Connection conn = DriverManager.getConnection(url, "root", "");
	String sql = "select * from loai_sua";
	Statement stm = conn.createStatement();
	ResultSet rs = stm.executeQuery(sql);
%>
</head>
<body>
	<table align="center" border="1" width="500">
		<caption>DANH SÁCH LOẠI SỮA</caption>
		<tr>
			<th>Mã loại</th>
			<th>Tên loại</th>
		</tr>
		<%while (rs.next()){%>
		<tr>
			<td><%=rs.getString("ma_loai_sua") %> </td>
			<td><%=rs.getString("ten_loai") %> </td>
		</tr>
		<% }%>
	</table>
</body>
</html>