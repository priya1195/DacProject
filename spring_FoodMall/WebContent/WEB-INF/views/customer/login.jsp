<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5 style="color: red;">${requestScope.mesg}</h5>
<!-- def action=same URL : /user/login  -->
	<form  method="post">
		<table style="background-color: cyan; margin: auto;" border="1">
			<tr>
				<td>Enter User Email</td>
				<td><input type="text" name="em" /></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="pass" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>

</body>
</html>