// Slip - 5 Q1 [JAVA]
// Write a Java Program to create the hash table that will maintain the mobile number and student name. Display the details of student using Enumeration interface. 

import java.util.*;

public class S5Q1 {
    public static void main(String[] args) {
        Hashtable<String, String> studentDetails = new Hashtable<>();

        studentDetails.put("John", "1234567890");
        studentDetails.put("Alice", "9876543210");
        studentDetails.put("Bob", "8765432109");

        System.out.println("\n- Student Details -\n");
        Enumeration<String> studentNames = studentDetails.keys();
        while (studentNames.hasMoreElements()) {
            String studentName = studentNames.nextElement();
            String mobileNumber = studentDetails.get(studentName);
            System.out.println("Name: " + studentName + ", Mobile Number: " + mobileNumber);
        }
    }
}
