// Slip - 22 Q2 [JAVA]
// Write a JSP program which accepts UserName in a TextBox and greets the user according to the time on server machine.

import java.time.LocalTime;

public class GreetingService {

    public static String getGreeting(String username) {
        String greeting = "";
        int hour = LocalTime.now().getHour();
        if (hour >= 0 && hour < 12) {
            greeting = "Good morning";
        } else if (hour >= 12 && hour < 18) {
            greeting = "Good afternoon";
        } else {
            greeting = "Good evening";
        }
        return greeting + ", " + username + "!";
    }
}
