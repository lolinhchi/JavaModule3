<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Multi Upload</title>
</head>
<body>
<form action="" method="post" enctype="multipart/form-data">
	<h1>Minh họa upload nhiều file</h1>
	<p><label>Các tập tin: </label><input type="file" multiple="multiple" name="f" /></p>
	<p><input type="submit" value="Upload" /></p>
</form>
<c:if test="${not empty list }">
	<c:forEach  items="${list}" var="img">
		<img alt="" src="uploads/${img}">
	</c:forEach>
</c:if>
</body>
</html>