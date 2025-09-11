<!-- Slip - 5 Q2 extension [JAVA] -->
<!-- This is an extension file required to run this question so fear GOD and don't skip it. -->

<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Test Result</title>
</head>
<body>
    <h1>Test Result</h1>
    <%
        // Database connection parameters
        String url = "jdbc:postgresql://localhost:5432/ty92";
        String user = "ty92";
        String password = "ty92";

        // Retrieve the user's selected answer from the previous page
        String userAnswer = request.getParameter("answer");

        // Connect to the database
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            // Retrieve the correct answer from the database
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT correct_answer FROM questions WHERE question_id = 1"); // Change question_id as per your requirement
            String correctAnswer = "";
            if (rs.next()) {
                correctAnswer = rs.getString("correct_answer");
            }

            // Display the user's answer and the correct answer
            out.println("<p>Your answer: " + userAnswer + "</p>");
            out.println("<p>Correct answer: " + correctAnswer + "</p>");

            // Check if the user's answer is correct and display the result
            if (userAnswer.equals(correctAnswer)) {
                out.println("<p><strong>Congratulations! Your answer is correct!</strong></p>");
            } else {
                out.println("<p><strong>Sorry, your answer is incorrect.</strong></p>");
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    %>
</body>
</html>
