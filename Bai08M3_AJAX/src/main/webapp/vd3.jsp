<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chào</title>
<script>

function chao() {
	var ten = document.getElementById("ten").value;
	const xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
		  if(this.readyState == 4 && this.status == 200){
				var tl = this.responseText;
				var oblc = document.getElementById("loiChao");
				oblc.innerHTML = tl;
			}
	  };
	  xhttp.open("GET", "Vd3Servlet?ten="+ten);
	  xhttp.send();
}

	
</script>
</head>
<body>
<p><label>Nhập tên: </label><input type="text" id="ten" /></p>
<p id="loiChao" ></p>
<p><button onclick="chao()">Chào</button></p>
</body>

</html>