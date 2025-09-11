<!-- Slip - 12 Q1 [JAVA] -->
<!-- Write a JSP program to check whether given number is Perfect or not. (Use Include directive).  -->

<!-- This is one of the 3 files required for this program. [JSP] -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="pkg.PerfectNumberChecker" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Perfect Number Checker</title>
</head>
<body>
    <h1>Perfect Number Checker</h1>
    <%
        // Get the number from the request
        int number = Integer.parseInt(request.getParameter("number"));
        
        // Check if the number is perfect or not
        boolean isPerfect = PerfectNumberChecker.isPerfect(number);
    %>
    <%
        if (isPerfect) {
    %>
            <p><%= number %> is a perfect number.</p>
    <%
        } else {
    %>
            <p><%= number %> is not a perfect number.</p>
    <%
        }
    %>
</body>
</html>
