<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Créer un nouveau contact</title>
</head>
<body>
	<form method="post" action="newContact">
		<table height="100%" width="100%">
			<tr>
				<td width="15%">First Name</td>
				<td><input type="text" name="firstname" size="25">
				</td>
			</tr>
			<tr>
				<td width="15%">Last Name</td>
				<td><input type=text " name="lastname" size="25">
				</td>
			</tr>
			<tr>
				<td width="15%">Email</td>
				<td><input type=text " name="email" size="25">
				</td>
			</tr>
			<tr>
				<td width="15%">Street</td>
				<td><input type=text " name="street" size="25">
				</td>
			</tr>
			<tr>
				<td width="15%">City</td>
				<td><input type=text " name="city" size="25">
				</td>
			</tr>
			<tr>
				<td width="15%">Zip</td>
				<td><input type=text " name="zip" size="25">
				</td>
			</tr>

			<tr>
				<td width="15%">Country</td>
				<td><input type=text " name="country" size="25">
				</td>
			</tr>
			<tr>
				<td width="15%">Phone Number</td>
				<td><input type=text " name="phonenumber" size="25">
				</td>
			</tr>
			<tr>
				<td width="15%">Phone Kind</td>
				<td><input type=text " name="phonekind" size="25">
				</td>
			</tr>
			<tr>
				<td><INPUT type="checkbox" name="entreprisecheck" value="1">
					Entreprise </input>
				</td>
				<td width="15%"><input type=text " name="numsiret" size="25">
				</td>
			</tr>
		</table>


		<INPUT type="checkbox" name="groupename" value="1"> Groupe 1 </input>
		<INPUT type="checkbox" name="groupename" value="2"> Groupe 2 </input>
		<INPUT type="checkbox" name="groupename" value="3"> Groupe 3 </input>

		<!-- Group Name  : <input type=text" name="groupename" size="25">  -->
		<br /> <br /> <input type="submit" value="Submit"> <input
			type="reset" value="Reset">
	</form>
</body>
</html>