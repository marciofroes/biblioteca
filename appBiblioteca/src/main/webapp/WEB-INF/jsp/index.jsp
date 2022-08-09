<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<meta charset="ISO-8859-1">
	<title>AppPedido</title>
</head>
<body>
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

	  <h3>Classe: Bebida</h3>	              
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
	        <td>gelada</td>
	        <td>boolean</td>
	        <td>Indicativo se a bebida é gelada ou não</td>
	      </tr>
	      <tr>
	        <td>tamanho</td>
	        <td>float</td>
	        <td>Quantidade de líquido da bebida</td>
	      </tr>
	      <tr>
	        <td>marca</td>
	        <td>String</td>
	        <td>Marca da bebida</td>
	      </tr>
	    </tbody>
	  </table>
	</div>	
</body>
</html>