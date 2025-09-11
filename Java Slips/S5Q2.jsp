<!-- Slip - 5 Q2 [JAVA] -->
<!-- Create a JSP page for an online multiple choice test. The questions are randomly selected from a database and displayed on the screen. The choices are displayed using radio buttons. When the user clicks on next, the next question is displayed. When the user clicks on submit, display the total score on the screen.  -->

<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Online Multiple Choice Test</title>
</head>
<body>
    <h1>Online Multiple Choice Test</h1>
    <form action="submitTest.jsp" method="post">
        <%
            // Database connection parameters
            String url = "jdbc:postgresql://localhost:5432/ty92";
            String user = "ty92";
            String password = "ty92";

            // Connect to the database
            try {
                Class.forName("org.postgresql.Driver");
                Connection con = DriverManager.getConnection(url, user, password);

                // Retrieve a random question from the database
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Questions ORDER BY RANDOM() LIMIT 1");
                if (rs.next()) {
                    String question = rs.getString("question_text");
                    String choiceA = rs.getString("choice_a");
                    String choiceB = rs.getString("choice_b");
                    String choiceC = rs.getString("choice_c");
                    String choiceD = rs.getString("choice_d");

                    // Display the question and choices with radio buttons
        %>
                    <h3><%= question %></h3>
                    <input type="radio" name="answer" value="A"> <%= choiceA %> <br>
                    <input type="radio" name="answer" value="B"> <%= choiceB %> <br>
                    <input type="radio" name="answer" value="C"> <%= choiceC %> <br>
                    <input type="radio" name="answer" value="D"> <%= choiceD %> <br>
        <%
                }
                rs.close();
                stmt.close();
                con.close();
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        %>
        <br>
        <input type="submit" value="Next">
    </form>
</body>
</html>
