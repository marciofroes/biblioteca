<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<div class="container-fluid">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active" href="/">Home</a>
				</li>
				<c:if test="${not empty user}">
					<li class="nav-item"><a class="nav-link" href="/usuario/lista">Usu�rio</a></li>
					<li class="nav-item"><a class="nav-link" href="/jornal/lista">Jornal</a></li>
					<li class="nav-item"><a class="nav-link" href="/revista/lista">Revista</a></li>
					<li class="nav-item"><a class="nav-link" href="/livro/lista">Livro</a></li>
					<li class="nav-item"><a class="nav-link"
						href="/responsavel/lista">Respons�vel</a>
					<li class="nav-item"><a class="nav-link"
						href="/biblioteca/lista">Biblioteca</a></li>
				</c:if>
			</ul>

			<ul class="navbar-nav"> 
				<c:if test="${empty user}">
					<li class="nav-item"><a class="nav-link" href="/usuario">Signup</a></li>
					<li class="nav-item"><a class="nav-link" href="/login">Login</a>
					</li>
				</c:if>
				<c:if test="${not empty user}">
					<li class="nav-item"><a class="nav-link" href="/logout">Logout
							${user}</a></li>
				</c:if>
			</ul>
		</div>
	</nav>