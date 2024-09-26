<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
<title>title page</title>
</head>
<body>
    <form action="/savedetails" method="POST">
        Name: <input type="text" name="name" /><br>
        Email: <input type="text" name="email" /><br>
        Age: <input type="text" name="age" /><br>
        Phone number: <input type="text" name="phonenumber" /><br>
        Qualification: <input type="text" name="qualification" /><br>
        CTC: <input type="text" name="age" /><br>
        Street: <input type="text" name="address.street"><br>
        City: <input type="text" name="address.city"><br>
        
        <input type="submit" value="submit" />
    </form>
</body>
</html>