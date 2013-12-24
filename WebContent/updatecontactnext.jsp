<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier un contact</title>
</head>
<body>
<h3>Veillez entrer ...</h3>
<form method="post" action="UpdateContact">
Identity : <input type="text" name="id" size="25">
<br />
First Name: <input type="text" name="firstname" size="25">
<br />
Last Name: <input type=text" name="lastname" size="25">
<br />
Email: <input type=text" name="email" size="25">
<br />
<input type="submit" value="Submit">
<input type="reset" value="Reset">
</form>
</body>
</html>