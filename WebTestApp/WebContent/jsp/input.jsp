<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Input Here:</h2>
	<form name="form1" action="${pageContext.request.contextPath}/zip" method="post">
		<input type="radio" name="disp_type" value="0"  checked/>jsp
		<input type="radio" name="disp_type" value="1"  />gzip
		<input type="text" name="input_txt"  />
		<button type="submit">Submit</button>
	</form>

</body>
</html>