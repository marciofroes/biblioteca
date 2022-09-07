<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="ISO-8859-1">
<title>AppBiblioteca</title>
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<h3>Cadastramento do Responsavel</h3>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Id</th>
				<th>Nome</th>
				<th>CPF</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="responsavel" items="${listagem}">
				<tr>
					<td>${responsavel.id}</td>
					<td>${responsavel.nome}</td>
					<td>${responsavel.cpf}</td>
					<td>${responsavel.email}</td>
					<td><a href="/responsavel/${responsavel.id}/excluir">excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>