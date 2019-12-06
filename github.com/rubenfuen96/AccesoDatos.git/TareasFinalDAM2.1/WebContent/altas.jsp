<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<link rel="stylesheet" href="css/estilos.css" type="text/css">
</head>
<body>


<div class="container">

<%@include file = "includes/header.jsp" %>

<%@include file = "includes/nav.jsp" %>

<section>

<h1>Nueva Tarea</h1>

<form name="altas" action="AltaTarea" method="post">
	<label>Título</label><input type="text" name="titulo">
	<label>Descripción</label>
	<textarea name="descripcion"></textarea><br>
	<label>Categoría</label><br>
	<select name="categoria">
		<option value="0">Sin categoría</option>
		<option value="1">Proyectos IMF</option>
		<option value="2">Proyectos Prácticas</option>
		<option value="3">Personales</option>
		</select><br>
		<label>Importancia</label><br>
		<select name="importancia">
		<option value="0">...</option>
		<option value="1">Baja</option>
		<option value="2">Media</option>
		<option value="3">Alta</option>
		</select><br>
		<label>Fecha ínicio</label><input type="date" name="f_inicio"><br>
		<label>Fecha Termino</label><input type="date" name="f_final"><br>
			<label>Pertenece a la tarea:</label><br>
		<select name="dependencia">
		<option value="0">...</option>
		<option value="1">Ejemplo Proyecto 1</option>
		<option value="2">Ejemplo Proyecto 2</option>
		<option value="3">Ejemplo Proyecto 3</option>
		</select><br>
		
				<label>Estado:</label><br>
		<select name="estado">
		<option value="0">...</option>
		<option value="1">Sin empezar</option>
		<option value="2">En proceso</option>
		<option value="3">En espera</option>
		<option value="4">Terminada</option>
		</select>
		<br>
		<br><br>
		
		<input type="submit" value="Enviar">
		
</form>


</section>

<%@include file="includes/footer.jsp" %>

</div>

</body>
</html>