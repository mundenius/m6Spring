<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Listar Capacitaciones...bienvenido al sitio</title>
</head>
<body>

<input type="text" name="numerocapacitacion">



<div>


<input> type="submit" value = "mostrar" class btn btn-primary px-3">
</div>



<footer>
<%@include file="FIJOS/NavBar.jsp"%>
</footer>

<table>
		<tr>
			<th>ID Capacitacion</th>
			<th>Fecha Capacitacion</th>
			<th>Hora Capacitacion</th>
			<th>Lugar Capacitacion</th>
			<th>Duracion Capacitacion</th>
			<th>ID Usuario </th>
		</tr>
		<c:forEach items="${listacapacitacion}" var="cap">
			<tr>
				<td>${tg.idCapacitacion}</td>
				<td>${cap.fechaCap}</td>
				<td>${cap.hora}</td>
				<td>${cap.lugar}</td>
				<td>${cap.duracionCap}</td>
				<td>${cap.idUsuario_Run}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>5 nn 