<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Devis</title>
</head>
<body>
	<form method="post" accept-charset="utf-8">
		<div>
			<label for="produits">Produits : </label>
			<select id="produits" name="produits">
				<option value=""></option>
				<c:forEach var="p" items="${produits}">
					<option value="${p.id}"/><c:out value="${p.libelle}"/></option>
				</c:forEach>
			</select>
		</div>
		<div>
			<input id="remise" name="remise" type="text" value="<c:out value="${param['remise']}" />"> 
			<span class="error"><c:out value="${errors['remise']}"/></span>
		</div>
		
		<div>
			<button type="submit">S'inscrire</button>
		</div>
	</form>
</body>
</html>