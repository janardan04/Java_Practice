<!-- Slip - 3 Q1 [JAVA] -->
<!-- Write a JSP program to display the details of Patient (PNo, PName, Address, age, disease) in tabular form on browser. -->

<!-- For the sake of all that's holy save these files using .jsp extension -->
<!-- Do NOT compile or try to run these files just put them in the WEB-INF folder in tomcat directory -->
<!-- Open a browser preferably Chrome and search http://localhost:8080/S3Q1.jsp in the address bar and pray to GOD -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Patient Details</title>
</head>
<body>

<h2>Patient Details</h2>

<table border="1">
  <tr>
    <th>Patient Number</th>
    <th>Patient Name</th>
    <th>Address</th>
    <th>Age</th>
    <th>Disease</th>
  </tr>
  <%
    // Sample patient data (replace this with actual patient data)
    String[][] patients = {
        {"P001", "John Doe", "123 Main St", "35", "Fever"},
        {"P002", "Jane Smith", "456 Elm St", "42", "Headache"},
        {"P003", "David Johnson", "789 Oak St", "28", "Allergy"}
    };
    
    // Loop through each patient and display their details in the table
    for (String[] patient : patients) {
  %>
  <tr>
    <td><%= patient[0] %></td>
    <td><%= patient[1] %></td>
    <td><%= patient[2] %></td>
    <td><%= patient[3] %></td>
    <td><%= patient[4] %></td>
  </tr>
  <%
    }
  %>
</table>

</body>
</html>
