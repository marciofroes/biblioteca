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
        <a class="nav-link active" href="#">Home</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Jornal</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Revista</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="#">Livro</a>
      </li>
       <li class="nav-item">
        <a class="nav-link disabled" href="#">Responsável</a>
      </li>
    </ul>
  </div>
</nav>

	<div class="container mt-3">
	  <h2>AppBiblioteca</h2>
	  <p>Projeto de Gestão de Bibliotecas</p>
	  
	  <h3>Classe: Biblioteca</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>Descricao</td>
	        <td>String</td>
	        <td>Descrição da Biblioteca</td>
	      </tr>
	      <tr>
	        <td>data</td>
	        <td>LocalDateTime</td>
	        <td>Data de criacação da biblioteca</td>
	      </tr>
	      <tr>
	        <td>ativo</td>
	        <td>boolean</td>
	        <td>Indicativo se biblioteca esta ativa</td>
	      </tr>
	    </tbody>
	  </table>

	  <h3>Classe: Jornal</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>disponivel</td>
	        <td>boolean</td>
	        <td>Indicativo se o jornal esta diponível</td>
	      </tr>
	      <tr>
	        <td>Edição</td>
	        <td>String</td>
	        <td>Edição de publicação</td>
	      </tr>
	      <tr>
	        <td>Tema</td>
	        <td>String</td>
	        <td>Tema principal do Jornal</td>
	      </tr>
	        </tbody>
	  </table>
	      
	       <h3>Classe: Livro</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>Autor</td>
	        <td>String</td>
	        <td>Autor do livro</td>
	      </tr>
	      <tr>
	        <td>Titulo</td>
	        <td>String</td>
	        <td>Titulo do livro</td>
	      </tr>
	      <tr>
	        <td>disponivel</td>
	        <td>boolean</td>
	        <td>Indica se esta disponivel</td>
	      </tr>
	    </tbody>
	  </table>
	  
	   <h3>Classe: Revista</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Atributo</th>
	        <th>Tipo</th>
	        <th>Descrição</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>Titulo</td>
	        <td>String</td>
	        <td>Titulo do livro</td>
	      </tr>
	      <tr>
	        <td>disponivel</td>
	        <td>boolean</td>
	        <td>Indica se esta disponivel</td>
	      </tr>
	       <tr>
	        <td>Edição</td>
	        <td>String</td>
	        <td>Edição de publicação</td>
	      </tr>
	    </tbody>
	  </table>
	</div>	
</body>
</html>