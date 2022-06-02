

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
   <form action="age" method="Post">
       <h1><label for=age>Age Calculator</label><br/></h1>
       <br><input type=text name=age id=age></input><br/>
       <br><input type=submit value=AgeNextBirthday /><br/>
       <p>
           ${message}
       </p>
      
       <a href=arithmatic>Arithmatic Calculator</a>
       <br/>
   </form>
</body>
</html>
