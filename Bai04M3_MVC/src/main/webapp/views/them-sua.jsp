<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sữa</title>
<style type="text/css">
	form {
		margin-left: 100px
	}
</style>
</head>
<body>
<h1 align="center">Thêm sữa mới</h1>
<form action="ThemSuaServlet" method="post">
	
	<p><label>Mã sữa: </label> <input type="text" name="maSua" /></p>
	<p><label>Tên sữa: </label> <input type="text" name="tenSua" /></p>
	<p><label>Mã Loại: </label>
		<select name="cboLoai">
           <c:forEach items="${dsls}" var="ls">
               <option value="${ls.maLoai}" ${param.cboLoai==null?"":(param.cboLoai eq ls.maLoai?"selected":"")}>${ls.tenLoai}</option>
           </c:forEach> 
        </select>
     </p>
     <p><label>Mã hãng: </label>
		 <select name="cboHang">
            <c:forEach items="${dshs}" var="hs">
                <option value="${hs.maHang}" ${param.cboHang==null?"":(param.cboHang eq hs.maHang?"selected":"")}>${hs.tenHang}</option>
            </c:forEach> 
         </select>
     </p>
     <p><label>Trọng lượng: </label> <input type="text" name="trongLuong" /></p>
     <p><label>Đơn giá: </label> <input type="text" name="donGia" /></p>
     <p><label>Thành phần dinh dưỡng: </label> <input type="text" name="tpDinhDuong" /></p>
     <p><label>Lợi ích: </label> <input type="text" name="loiIch" /></p>
     <p><label>Hình: </label> <input type="file" name="hinh" /></p>
     <p> <input type="submit" value="Thêm sữa" /></p>
</form>
</body>
</html>