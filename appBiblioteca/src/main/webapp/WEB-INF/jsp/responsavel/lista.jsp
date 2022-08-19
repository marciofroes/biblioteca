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
<title>AppPedido</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/jornal/lista">Jornal</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/jornal/lista">Revista</a>
				</li>
				<li class="nav-item"><a class="nav-link disabled"
					href="/jornal/lista">Livro</a></li>
				<li class="nav-item"><a class="nav-link disabled" href="#">Responsável</a>
				</li>
			</ul>
		</div>
	</nav>


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
			<c:forEach values="responsavel" items="${listagem}">
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