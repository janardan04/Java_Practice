// Slip - 25 Q2 [JAVA]
// Write a Java Program for the following: Assume database is already created. 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class S25Q2 extends JFrame implements ActionListener {
    // JDBC URL, username, and password of the database
    private static final String URL = "jdbc:postgresql://localhost:5432/ty92";
    private static final String USER = "ty92";
    private static final String PASSWORD = "ty92";

    private JTextField tableNameField;
    private JTextField queryField;
    private JButton createButton;
    private JButton alterButton;
    private JButton dropButton;

    public S25Q2() {
        super("Database Operations");

        // Set up the frame
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Create components
        JLabel tableNameLabel = new JLabel("Table Name:");
        tableNameField = new JTextField();
        JLabel queryLabel = new JLabel("SQL Query:");
        queryField = new JTextField();
        createButton = new JButton("Create Table");
        alterButton = new JButton("Alter Table");
        dropButton = new JButton("Drop Table");

        // Add components to the frame
        add(tableNameLabel);
        add(tableNameField);
        add(queryLabel);
        add(queryField);
        add(createButton);
        add(alterButton);
        add(dropButton);

        // Add action listeners to buttons
        createButton.addActionListener(this);
        alterButton.addActionListener(this);
        dropButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tableName = tableNameField.getText();
        String query = queryField.getText();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            Statement statement = connection.createStatement();

            if (e.getSource() == createButton) {
                String createTableSQL = "CREATE TABLE " + tableName + " " + query;
                statement.executeUpdate(createTableSQL);
                JOptionPane.showMessageDialog(this, "Table created successfully.");
            } else if (e.getSource() == alterButton) {
                String alterTableSQL = "ALTER TABLE " + tableName + " " + query;
                statement.executeUpdate(alterTableSQL);
                JOptionPane.showMessageDialog(this, "Table altered successfully.");
            } else if (e.getSource() == dropButton) {
                String dropTableSQL = "DROP TABLE " + tableName;
                statement.executeUpdate(dropTableSQL);
                JOptionPane.showMessageDialog(this, "Table dropped successfully.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error executing SQL query: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Create and display the GUI
        SwingUtilities.invokeLater(() -> {
            S25Q2 dbInterface = new S25Q2();
            dbInterface.setVisible(true);
        });
    }
}
