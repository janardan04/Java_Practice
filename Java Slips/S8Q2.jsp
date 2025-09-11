<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prime Number Checker</title>
</head>
<body>
    <h2>Prime Number Checker</h2>
    <form action="Slip8_2.jsp" method="post">
        Enter a number: <input type="text" name="number">
        <input type="submit" value="Check">
    </form>

    <%
        String numberStr = request.getParameter("number");
        if (numberStr != null && !numberStr.isEmpty()) {
            int number = Integer.parseInt(numberStr);
            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            String result;
            if (isPrime) {
                result = number + " is a prime number.";
            } else {
                result = number + " is not a prime number.";
            }
    %>
            <p style="color: red;"><%= result %></p>
    <%
        }
    %>
</body>
</html>
