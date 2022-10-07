<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="bussinessLogic.CSDL"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bài tập 2</title>
<%! 
	Connection kn = CSDL.getConnection();
	Statement stm;
	ResultSet rs;
	String sql = "select * from khach_hang";
%>
<%
	stm = kn.createStatement();
	rs = stm.executeQuery(sql);
%>
<style >
	caption {
	font-size: 30px;
}
	img {
		width: 30px;
		height: 30px
}
	td:nth-child(3) {
		text-align: center;
}
	tr:nth-child(even) {
		background-color: orange;
}
</style>
</head>
<body>
	<table border="1" align="center">
	<caption>THÔNG TIN KHÁCH HÀNG</caption>
		<tr>
			<th>Mã khách hàng </th>
			<th> Tên khách hàng </th>
			<th> Giới tính </th>
			<th> Địa chỉ </th>
			<th> Điện thoại </th>
			
		</tr>
		<%while(rs.next()){ %>
		<tr>
			<td><%=rs.getString("ma_khach_hang") %></td>
			<td><%=rs.getString("ten_khach_hang") %></td>
			<td><img src="images/<%=rs.getBoolean("phai")?"be_gai_2.jpg" : "be_trai_2.jpg" %>"></td>
			<td><%=rs.getString("dia_chi") %></td>
			<td><%=rs.getString("dien_thoai") %></td>
		</tr>
		<%} %>
	</table>
</body>
</html>