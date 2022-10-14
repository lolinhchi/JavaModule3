<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload files</title>
</head>
<body>
<form action="UploadServlet" method="post" enctype='multipart/form-data' >
	<h1>Minh họa Upload file</h1>
	<p><lable>Tập tin: </lable><input type="file" name="tapTin" /></p>
	<p><input type="submit" name="upload" value="Upload" /></p>
</form>
<c:if test="${not empty tenTapTin }">
	<img alt="" src="uploads/${tenTapTin }" align="center" border="1">
</c:if>
</body>
</html>