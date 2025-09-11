<!-- Slip - 12 Q1 [JAVA] -->
<!-- Write a JSP program to check whether given number is Perfect or not. (Use Include directive).  -->

<!-- This is one of the 3 files required for this program. [JSP] -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Perfect Number Checker</title>
</head>
<body>
    <h1>Perfect Number Checker</h1>
    <form action="CheckPerfectNumber.jsp" method="post">
        Enter a number: <input type="number" name="number" required>
        <input type="submit" value="Check">
    </form>
</body>
</html>
