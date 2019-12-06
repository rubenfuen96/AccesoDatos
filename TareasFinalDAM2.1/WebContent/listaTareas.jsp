<%@page import="moledo.ListaTareas"%>
<%@page import="moledo.Tarea"%>

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

<h1>Lista de tareas</h1>


<table border=1>

<%

	ListaTareas lista = new ListaTareas();
	String imprime = lista.pintaTarea();
	
%>
<%=imprime %>
</table>


</section>

<%@include file="includes/footer.jsp" %>

</div>

</body>
</html>