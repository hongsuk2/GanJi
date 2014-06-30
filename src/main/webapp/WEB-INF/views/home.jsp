<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<form action="/login/logout" method="get">
    <table>
        <tr>
            <td><input type="submit" value="logout"></td>
        </tr>
        
    </table>
</form>
</body>
</html>
