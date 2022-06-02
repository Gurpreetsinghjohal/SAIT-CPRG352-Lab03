<%-- 
    Document   : arithmeticcalc
    Created on : 1 Jun, 2022, 5:39:22 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method ="post" action ="arithmatic">
            <label>First: </label>
            <input type ="text" name ="n1" value =""></input>
            
            <label>Second: </label>
            <input type ="text" name ="n2" value ="" ></input><br><br>
            <br><input type ="submit" name="op" value ="+"> </input>
            <input type ="submit" name="op" value ="-"> </input>
            <input type ="submit" name="op" value ="*"> </input>
            <input type ="submit" name="op" value ="/"> </input><br>
            Result: ${message}
            <br><br><a href ="age">Age Calculator</a> 
    </body>
</html>
