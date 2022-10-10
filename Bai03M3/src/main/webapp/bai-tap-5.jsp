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
<title>Insert title here</title>
<%!
	Connection conn = CSDL.getConnection();
	Statement stm;
	ResultSet rs = null;
	String sql = "SELECT s.Ten_sua, h.Ten_hang_sua, l.Ten_loai, s.Trong_luong, s.Don_gia"
			+" FROM sua s INNER JOIN loai_sua l on l.Ma_loai_sua = s.Ma_loai_sua"
			+" INNER JOIN hang_sua h on h.Ma_hang_sua = s.Ma_hang_sua ";
	int soDongTrang = 5, tongSoTrang, trang=1;
	
%>
<%
	if(rs ==null) {
		stm = conn.createStatement();
		rs = stm.executeQuery(sql);
		rs.last();
		int tsd = rs.getRow();
		tongSoTrang = tsd/soDongTrang + (tsd%soDongTrang != 0? 1:0);
	}
	if(request.getParameter("trang") !=null) {
		trang = Integer.parseInt(request.getParameter("trang"));
	}
	int vt = (trang-1)* soDongTrang;
	rs = stm.executeQuery(sql+ " limit " + vt +", " + soDongTrang);
	int stt = vt +1;
%>
</head>
<body>
<table border="1">
	<caption>THÔNG TIN SỮA</caption>
	<tr>
		<th>Số TT</th>
		<th> Tên sữa </th>
		<th> Hãng sữa </th>
		<th> Loại sữa </th>
		<th> Trọng lượng</th>
		<th>Đơn giá</th>
	</tr>
	<%while (rs.next()) { %>
	<tr>
		<td><%=stt++ %></td>
		<td> <%=rs.getString("ten_sua") %>
		<td><%=rs.getString("ten_hang_sua") %></td>
		<td><%=rs.getString("ten_loai") %></td>
		<td><%=rs.getString("trong_luong") %></td>
		<td><%=rs.getString("don_gia") %></td>
	</tr>
	<%} %>
</table>
</body>
</html>