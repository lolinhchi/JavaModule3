<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="title" type="String" %>
<%@ attribute name="content" fragment="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title }</title>
<style type="text/css">
	header, footer{
		background-color: lightblue;
		height: 100px;
		padding: 10px
	}
	main{
		display: flex;
		width: 100%
	}
	nav{
		width: 20%;
		background-color: khaki;
		padding: 20px
	}
	article{
		width: 80%;
		background-color: lightyellow;
		padding: 20px
	}
</style>
</head>

<body>
<header>
	<h1>Minh hoạ Template</h1>
</header>
<main>
	<nav>
		<ul>
			<li><a href="chao.jsp">Chào</a> </li>
			<li><a href="temp1.jsp">Template 1</a> </li>
			<li> Thực đơn 3 </li>
		</ul>
	</nav>
	<article>
		<jsp:invoke fragment="content"></jsp:invoke>
	</article>
</main>
<footer>
	<h3>Trang mau 01</h3>
</footer>
</body>
</html>