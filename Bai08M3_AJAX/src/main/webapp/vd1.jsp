<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chào</title>
<script type="text/javascript">
	function chao() {
		var obTen = document.getElementById("ten");
		var ten = obTen.value;
		var obLoiChao = document.getElementById("loiChao");
		obLoiChao.innerHTML = "Chào mừng bạn " + ten + " đến với Lập trình AJAX";
	}
</script>
</head>
<body>
<p><label>Nhập tên: </label><input type="text" id="ten" /></p>
<p id="loiChao" ></p>
<p><button onclick="chao()">Chào</button></p>
</body>
</html>