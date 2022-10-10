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
<title>Bai tap 3</title>
<%!
	Connection conn = CSDL.getConnection();
	Statement stm;
	ResultSet rs;
	String sql = "SELECT s.Ten_sua, h.Ten_hang_sua, l.Ten_loai, s.Trong_luong, s.Don_gia, s.Hinh"
	+" FROM sua s INNER JOIN loai_sua l on l.Ma_loai_sua = s.Ma_loai_sua"
	+" INNER JOIN hang_sua h on h.Ma_hang_sua = s.Ma_hang_sua ";
	
%>
<%
	stm = conn.createStatement();
	rs = stm.executeQuery(sql);
%>

</head>
<body>
	<table border="1" align="center">
		<tr>
			<th colspan="2"> THÔNG TIN CÁC SẢN PHẨM </th>
		</tr>
		<%while(rs.next()){ %>
		<tr>
			<td><img src="images/<%=rs.getString("hinh") %>"></td>
			<td><%=rs.getString("ten_sua") %>
			 </br> Nhà sản xuất: <%= rs.getString("ten_hang_sua") %>
			 </br> <%=rs.getString("ten_loai") %> - <%=rs.getString("trong_luong") %> - <%=rs.getString("don_gia") %>
			</td>
			
		</tr>
		<%} %>
	</table>
	
</body>
</html>