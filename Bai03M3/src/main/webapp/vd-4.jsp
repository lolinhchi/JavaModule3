<%@page import="javaBeans.LoaiSua"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language (EL)</title>
<%
	//1. bien don
	int a =2;
	request.setAttribute("a", a);
	
	//2. bien mang
	int [] b= {1, 2, 3 ,4};
	pageContext.setAttribute("b", b);
	
	//3. danh sach list
	//4. map
	//5. java bean
	LoaiSua ls = new LoaiSua();
	ls.setMaLoai("TH");
	ls.setTenLoai("TH True milk");
	request.setAttribute("ls", ls);
%>
</head>
<body>
<p> a = <%=a %></p>
<p>a = ${a } </p>
<p>b[2] = <%=b[2] %></p>
<p>b[3] = ${b[3]} </p>
<p>Mã loại: ${ls.maLoai} - Tên loại: ${ls.getTenLoai() } </p>
</body>
</html>