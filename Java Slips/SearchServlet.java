// Slip - 11 Q1 [JAVA]
// Design an HTML page which passes customer number to a search servlet. The servlet searches for the customer number in a database (customer table) and returns customer details if found the number otherwise display error message.

// This is the Servlet file of the program there is also a HTML file.

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SearchServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();
        String custNum = req.getParameter("customerNum");

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ty92", "ty92", "ty92");

            String sql = "SELECT * FROM customer WHERE cust_num = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, custNum);
            ResultSet rs = pstmt.executeQuery();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Search Customer</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Search Customer</h1>");

            if(rs.next()) {
                String custName = rs.getString("cust_name");
                String custAddr = rs.getString("cust_addr");

                out.println("<h2>Customer Details</h2>");
                out.println("<p>Customer Number: " + custNum + "</p>");
                out.println("<p>Customer Name: " + custName + "</p>");
                out.println("<p>Customer Address: " + custAddr + "</p>");
            } else {
                out.println("<p>Error: Customer not found</p>");
            }

            out.println("</body>");
            out.println("</html>");

            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            out.println(e);
        }
        out.close();
    }
}
