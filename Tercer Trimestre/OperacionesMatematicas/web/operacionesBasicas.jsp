<%-- 
    Document   : operaciionesBasicas
    Created on : 20 abr. 2021, 9:47:21
    Author     : Franky
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Operaciones matemáticas</h1>
        <%
            double numero1 = Double.parseDouble(request.getParameter("numero1"));
            double numero2 = Double.parseDouble(request.getParameter("numero2"));
        %>
        <p>La suma de los numeros <%= numero1 %> y <%= numero2 %> es <%= suma %></p>
        <p>La resta de los numeros <%= numero1 %> y <%= numero2 %> es <%= numero1 - numero2 %></p>
        <p>La division de los numeros <%= numero1 %> y <%= numero2 %> es <%= numero1 / numero2 %></p>
        <p>La multiplicacion de los numeros <%= numero1 %> y <%= numero2 %> es <%= multiplica %></p> 
        
    </body>
</html>
