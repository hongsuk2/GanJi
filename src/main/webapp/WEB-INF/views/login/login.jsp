<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    로그인 하세요 ..
<form action="/login/loginAction" method="post">
    <table>
        <tr>
            <th> 아이디 </th>
            <td><input type="text" name="id"></td>
         </tr>
         <tr>
            <th> password </th>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="login" />
            </td>
        </tr>
    </table>
</form> 
</body>
</html>