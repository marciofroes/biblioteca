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


	<h3>Cadastramento de Jornal</h3>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nome</th>
				<th>Formato</th>
				<th>Valor</th>
				<th>Código</th>
				<th>Edição Especial</th>
				<th>Edição</th>
				<th>Tema</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="jornal" items="${listagem}">
				<tr>
					<td>${jornal.id}</td>
					<td>${jornal.nome}</td>
					<td>${jornal.formato}</td>
					<td>${jornal.valor}</td>
					<td>${jornal.codigo}</td>
					<td>${jornal.edicaoEspecial}</td>
					<td>${jornal.edicao}</td>
					<td>${jornal.tema}</td>
					<td><a href="/jornal/${jornal.id}/excluir">excluir</a></td>
				</tr>
			</c:forEach>
	</table>

</body>
</html>