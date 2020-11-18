<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Auto Complete with Spring MVC</title>
<script src="${pageContext.request.contextPath }/resources/js/jquery-1.4.2.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/jquery-ui.js"></script>
<link
	href="${pageContext.request.contextPath }/resources/css/themes/base/jquery.ui.css"
	rel="stylesheet" type="text/css">
<script type="text/javascript">
	$(document).ready(function() {
		$('#productName').autocomplete({
			source : '${pageContext.request.contextPath }/product/search'
		});
	});
</script>
</head>
<body>
 <div class="container" style="padding:2%">
	<h1>Search Product </h1>
	<input type="text" id="productName">
	</div>
</body>
</html>