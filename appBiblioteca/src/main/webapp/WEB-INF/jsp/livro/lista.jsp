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


	  <h3>Classe: Jornal</h3>	              
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Edição Especial</th>
	        <th>Edição</th>
	        <th>Tema</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr>
	        <td>True</td>
	        <td>Fevereiro</td>
	        <td>Campeonato Brasileiro</td>
	      </tr>
	      <tr>
	        <td>False</td>
	        <td>Campeonato Brasileiro</td>
	        <td>Campeonato Espanhol</td>
	      </tr>
	      <tr>
	        <td>False</td>
	        <td>O Futebol</td>
	        <td>Copa do Mundo</td>
	      </tr>
	        </tbody>
	  </table>
	
</body>
</html>