<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Capacitacion</title>
<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N"
		crossorigin="anonymous"></script>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<%@include file="FIJOS/NavBar.jsp" %>
	<div class="container">
		<div class="row">
			<div class="col-4"></div>
			<div class="col-4 text-center">
				<br>
				<h1 class="h3 mb-3 fw-normal text-center">Crear capacitación</h1>

				<form  class="was'validated" action="CrearCapacitacion" method="post">
					<div class="form-group">
						<label class="text-center" for="idCapacitacion">ID de
							Capacitación:</label> <input type="number" class="form-control"
							id="idCapacitacion" required name="idCapacitacion">
					</div>
					<form  class="was-validated" action="CrearCapacitacion" method="post">
					<div class="form-group">
						<label class="text-center" for="rutCliente">RUT Cliente:</label> <input type="number" class="form-control"
							id="rutCliente" required name="rutCliente">
					</div>
				
<!-- 					<div class="form-group"> -->
<!-- 						<label for="rutCliente">Rut de Cliente:</label> <select class="form-select" required aria-label="select example" -->
<!-- 							id="rutCliente" name="rutCliente"> -->
<!-- 							<option value="" disabled selected hidden>Selecciona un Rut de Cliente Existente</option> -->
<!-- 						</select> -->
<!-- 					</div> -->
					<div class="form-group" >
						<label for="dia">Día:</label> 
						<select class="form-select" required aria-label="select example" id="dia" name="dia" >
							<option value="" disabled selected hidden>Selecciona un
								día</option>
							<option value="lunes">Lunes</option>
							<option value="martes">Martes</option>
							<option value="miercoles">Miércoles</option>
							<option value="jueves">Jueves</option>
							<option value="viernes">Viernes</option>
							<option value="sabado">Sábado</option>
							<option value="domingo">Domingo</option>
						</select>
					</div>
					<div class="form-group">
						<label class="text-center" for="hora">Hora (xx:xx):</label> <input
							type="time" class="form-control" id="hora" name="hora" required
							pattern="^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$">
					</div>
					<div class="form-group">
						<label class="text-center" for="lugar">Lugar:</label> <input
							type="text" required class="form-control" id="lugar" name="lugar">
					</div>
					<div class="form-group">
						<label class="text-center" for="duracion">Duración:</label> 
						<select class="form-select" required aria-label="select example" id="duracion" name="duracion" >
							<option value="" disabled selected hidden>Selecciona duracion</option>
							<option value="30">30 minutos</option>
							<option value="60">1 Hora</option>
							<option value="90">1 Hora 30 minutos</option>
							<option value="120">2 Horas</option>
							<option value="150">2 Horas 30 minutos</option>
							<option value="180">3 Horas</option>
							<option value="210">3 Horas 30 Minutos </option>
							<option value="240">4 Horas</option>
						</select>
					</div>
					<div class="form-group">
						<label class="text-center" for="cantAsist">Cantidad de
							Asistentes:</label> <input type="number" class="form-control"
							id="cantAsist" required name="cantAsist">
					</div>
					<br>
					<button type="submit" class="btn btn-primary" id="save">Guardar</button>
				</form>
			</div>
			<div class="col-4"></div>
		</div>

	</div>
	<%@include file="FIJOS/Footer.jsp" %>
</body>
</html>