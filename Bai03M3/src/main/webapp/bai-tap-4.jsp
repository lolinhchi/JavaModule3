<%@page import="java.text.NumberFormat"%>
<%@page import="java.util.Locale"%>
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
<title>Bài tap 4</title>
<%!
	Connection conn = CSDL.getConnection();
	Statement stm;
	ResultSet rs;
	String sql = "select * from sua";
	Locale lc = new Locale("vi-VN");
	NumberFormat nf = NumberFormat.getNumberInstance(lc);
	
%>
<%
	stm = conn.createStatement();
	rs = stm.executeQuery(sql);
	int sc= 1;
%>
</head>

<body>
<table border="1">
	<tr>
		<th colspan="5">THÔNG TIN SẢN PHẨM</th>
	</tr>
	<%while(rs.next()) { %>
	<%if(sc++==1){ %> <tr><%} %>
		<td>
			<b><%=rs.getString("ten_sua") %></b><br>
			<%=rs.getString("trong_luong") %> gr - <%=nf.format(rs.getInt("don_gia")) %> VNĐ <br>
			<img src="images/<%=rs.getString("hinh") %>" >
		</td>
		<%if(sc==6){sc=1; %></tr><%} %>
		<%} %>
</table>
</body>
</html>