<!-- Slip - 20 Q1 [JAVA] -->
<!-- Create a JSP page to accept a number from a user and display it in words: Example: 123 – One Two Three. The output should be in red color.   -->

<%@ page import="pkg.NumberConverter" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Numbers to Words</title>
</head>
<body>
    <h2>Convert Number to Word</h2>
    <form action="" method="post">
        <label for="number">Enter a number:</label>
        <input type="text" id="number" name="number" required>
        <button type="submit">Convert</button>
    </form>

    <%
        if (request.getMethod().equalsIgnoreCase("POST")) {
            String numberStr = request.getParameter("number");
            try {
                long number = Long.parseLong(numberStr);
                String words = NumberConverter.convertToWords(number);
    %>
                <div style="color:red;">
                    <%= number %> - <%= words %> 
                </div>
    <%
            } catch (NumberFormatException e) {
    %>
                <div style="color: red;">
                    Invalid number entered!
                </div>
    <%
            }
        }
    %>
</body>
</html>
