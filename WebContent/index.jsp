<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil</title>

</head>
<body>
	<table height="100%" width="100%" border="2">
		<!-- Header -->
		<tr align="center">
			<td colspan="3" height="20%" width="15%">
				<p align="center">
				<h1>Gestion de contacts</h1>
				</p></td>
		</tr>
		<!-- Messages -->
		<tr>
			<td height="70%" width="20%"></td>
			<td height="70%" width="70%"></td>
			<td height="70%" width="10%"></td>
		</tr>
		<!-- Menu & main -->
		<tr valign="top" align="left">
			<td colspan="" height="10%" width="20%"><jsp:include
					page="menu.jsp" /></td>
			<td height="10%" width="70%" valign="top" align="center">
				<%
					if (request.getParameter("page") != null) {
						String p = request.getParameter("page") + ".jsp";
				%> <jsp:include page="<%= p.toString() %>" /> <%
 	}
 %>
			</td>
			<td height="10%" width="10%"></td>
		</tr>

		<!-- Footer -->
		<tr align="center">
			<td colspan="3" height="20%" width="15%">
				<p align="center">
				<h3>
					&copy; Management 2013
					</h1>
					</p>
			</td>
		</tr>
	</table>
</body>
</html>