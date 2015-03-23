<%@page import="java.util.List"%>
<%@page import= "PProdutos.Produto" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produtos Cadastrados</title>
</head>
<body>

<h1> Produtos Cadastrados </h1>

<%
	
	List<Produto>Produtos = (List<Produto>)request.getAttribute("Produto");


	for(Produto P : Produtos){
		out.print ("<br> Produto.:"+P.getId()+"<br>");
		out.print("--------------------<br>");
		out.print ("Descrição.:"+P.getDescricao()+"<br>");
		out.print("--------------------<br>");
		out.print ("Valor.:"+P.getValor()+"<br>");
		out.print("_________________________<br>_________________________<br>");
		
		
	}

%>

</body>
</html>