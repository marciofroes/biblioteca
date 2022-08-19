<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppPedido</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <div class="container-fluid">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link active" href="/">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/jornal/lista">Jornal</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/revista/lista">Revista</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="/livro/lista">Livro</a>
      </li>
       <li class="nav-item">
        <a class="nav-link disabled" href="/responsavel/lista">Responsável</a>
      </li>
    </ul>
  </div>
</nav>


	  <h3>Cadastro de Livros</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	      <th>ID</th>
	      	<th>Categoria</th>
	      	<th>Formato</th>
	      	<th>Valor</th>
	      	<th>Código</th>
	        <th>Autor</th>
	        <th>Titulo</th>
	        <th>Disponivel</th>
	        <th></th>
	      </tr>
	    </thead>
	    <tbody>
	    <c:forEach var="livro" items="${listagem}">
	      <tr>
	      <td>${livro.id}</td>
	        <td>${livro.nome}</td>
	        <td>${livro.formato}</td>
	        <td>${livro.valor}</td>
	        <td>${livro.codigo}</td>
	        <td>${livro.autor}</td>
	        <td>${livro.titulo}</td>
	        <td>${livro.disponivel}</td>
	        <td><a href="/livro/${livro.id}/excluir">excluir</a></td>
	      </tr>
	      </c:forEach>
	        </tbody>
	  </table>
	
</body>
</html>