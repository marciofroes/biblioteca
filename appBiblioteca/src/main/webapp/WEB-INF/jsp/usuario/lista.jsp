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
<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">Home</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/jornal/lista">Jornal</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/revista/lista">Revista</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="/livro/lista">Livro</a></li>
				<li class="nav-item"><a class="nav-link"
					href="/responsavel/lista">Responsável</a>
				<li class="nav-item"><a class="nav-link"
					href="/biblioteca/lista">Biblioteca</a></li>
			</ul>
		</div>
	</nav>


	<h3>Cadastramento do usuários</h3>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Email</th>
				<th>Senha</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="usuario" items="${listagem}">
				<tr>
					<td>${usuario.nome}</td>
					<td>${usuario.email}</td>
					<td>${usuario.senha}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>