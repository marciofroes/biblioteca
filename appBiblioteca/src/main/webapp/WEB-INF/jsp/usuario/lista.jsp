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


	<h3>Cadastramento do usuários</h3>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Email</th>
				<th>Senha</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="usuario" items="${listagem}">
				<tr>
					<td>${usuario.nome}</td>
					<td>${usuario.email}</td>
					<td>${usuario.senha}</td>
					<td><a href="/usuario/${usuario.email}/excluir">excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>