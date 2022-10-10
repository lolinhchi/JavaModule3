<%@page import="javaBeans.LoaiSua"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL</title>
<%
	List<LoaiSua> lst = new ArrayList<>();
	LoaiSua ls1 = new LoaiSua();
	ls1.setMaLoai("A1");
	ls1.setTenLoai("Sữa A1");
	
	LoaiSua ls2 = new LoaiSua();
	ls2.setMaLoai("A2");
	ls2.setTenLoai("Sữa A2");
	
	lst.add(ls1);
	lst.add(ls2);
	request.setAttribute("lst", lst);
%>
</head>
<body>
<p><c:out value="Minh họa JSTL" /></p>
<c:set value="1234.56" var="so" />
<c:out value="Giá trị số = ${so}" />
<%--  --%>
<fmt:setLocale value="vi-VN"/>
<fmt:formatNumber value="${so }" var="soVN" />
<%--  --%>
<p>Số VN: ${soVN } </p>
--<%--  --%>
<c:forEach var="i" begin="1" end="3" step="1">
	<p> Đây là dòng thứ ${i }</p>
</c:forEach>
<c:forEach  items="${lst}" var="item">
	<p>Mã loại: ${item.maLoai} - Tên loại: ${item.tenLoai}</p>
</c:forEach>
</body>
</html>