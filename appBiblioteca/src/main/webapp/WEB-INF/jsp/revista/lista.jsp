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

	<h3>Cadastramento de Revista</h3>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Formato</th>
				<th>Valor</th>
				<th>Código</th>
				<th>titulo</th>
				<th>Edição Especial</th>
				<th>Data Publicação</th>
				<th>Disponivel</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="revista" items="${listagem}">
				<tr>
					<td>${revista.id}</td>
					<td>${revista.nome}</td>
					<td>${revista.formato}</td>
					<td>${revista.valor}</td>
					<td>${revista.codigo}</td>
					<td>${revista.titulo}</td>
					<td>${revista.edicaoEspecial}</td>
					<td>${revista.dataPublicacao}</td>
					<td>${revista.disponivel}</td>
					<td><a href="/revista/${revista.id}/excluir">excluir</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>