<!-- Slip - 24 Q2 [JAVA] -->
<!-- Write a JSP script to accept username and password from user, if they are same then display “Login Successfully” message in Login.html file, otherwise display “Login Failed” Message in Error.html file.  -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
    </head>
    <body>
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            if(username != null && password != null && username.equals(password)) {
        %>
                <h1>Login Successfully</h1>
        <%
            } else {
                response.sendRedirect("Error.html");
            }
        %>
    </body>
</html>
