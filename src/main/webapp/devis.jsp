<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Devis</title>
</head>
<body>
	<form method="post" accept-charset="utf-8">
		<div>
			<label for="libelle">Libelle : </label>
			<select id="libelle" name="libelle">
				<option value=""></option>
				<c:forEach var="libelle" items="${libelles}">
					<option value="${libelle}"><c:out value="${libelle}" /></option>
				</c:forEach>
			</select>
		</div>
		<div>
			<input id="remise" name="remise" type="text" value="<c:out value="${param['remise']}" />"> 
			<span class="error"><c:out value="${errors['remise']}"/></span>
		</div>
		
		</div>
		<div>
			<button type="submit">S'inscrire</button>
		</div>
	</form>
</body>
</html>