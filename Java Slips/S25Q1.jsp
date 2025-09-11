<!-- Slip - 25 Q1 [JAVA] -->
<!-- Write a JSP program to accept Name and Age of Voter and check whether he is eligible for voting or not. -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Voting Eligibility Checker</title>
</head>
<body>
    <form action="" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>
        
        <label for="age">Age:</label>
        <input type="number" id="age" name="age"><br><br>
        
        <input type="submit" value="Check Eligibility">
    </form>
    
    <%
        String name = request.getParameter("name");
        int age = 0;
        
        if(request.getParameter("age") != null) {
            try {
                age = Integer.parseInt(request.getParameter("age"));
            } catch(NumberFormatException e) {
                out.println("<h2>Please enter a valid age.</h2>");
                return;
            }
        }
        
        if (name != null && age >= 18) {
    %>
            <h1>Hello <%= name %>,</h1>
            <h2>You are eligible to vote.</h2>
    <%
        } else if (name != null && age < 18) {
    %>
            <h1>Hello <%= name %>,</h1>
            <h2>Sorry, you are not eligible to vote.</h2>
    <%
        }
    %>
</body>
</html>
