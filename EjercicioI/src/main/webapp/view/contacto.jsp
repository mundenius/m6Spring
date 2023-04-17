<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Contacto</title>
</head>
<body>
<nav>
        <%@ include file="/FIJOS/NavBar.jsp" %>
</nav>

<h2 class="text-center py-3 my-5">Contacto</h2>
<div class= "row justify-content-center">
	<form action="Contacto" method="GET" class="needs-validation col-xs-12 col-sm-11 col-md-9 col-xl-8" novalidate>
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Nombre</label>
	    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre Completo">
	  </div>
	  <div class="form-group">
	    <label for="exampleFormControlInput1">Email</label>
	    <input type="email" class="form-control" id="mail" name="mail" placeholder="name@example.com">
	  </div>
	  <div class="form-group">
	    <label for="exampleFormControlTextarea1">Motivo de Contacto</label>
	    <textarea type= "text" class="form-control" id="contacto" name="contacto" rows="3"></textarea>
	  </div>
	</form>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>