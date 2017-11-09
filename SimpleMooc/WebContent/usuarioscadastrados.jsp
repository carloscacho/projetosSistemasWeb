<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrados</title>
</head>
<body>
<h1>Lista de Usuários Cadastrados</h1>
<c:if test="${empty listUser}" >
	<h2>Não há usuarios Cadastrados no Sistema</h2>
</c:if>

<c:if test="${!empty listUser}">

	<table>
		<thead>
			<tr>
				<th>Nome</th>
				<th>Email</th>
				<th>Sexo</th>
			</tr>
		</thead>
		<tbody>

<c:forEach  var="user" items="${listUser}">
			<tr>
				<td>${user.nome }</td>
				<td>${user.email }</td>
				<td>${user.sexo }</td>
			</tr>

</c:forEach>

		</tbody>
	</table>

</c:if>



</body>
</html>