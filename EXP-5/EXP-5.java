Experiment 5: Interfaces
Program 5a: Fare Interface with Bus and Auto
Aim: To create a user-defined interface and implement it in two classes.
Scenario: A transport app calculates the fare for different vehicles.
Program:
interface Fare {
    void calculateFare();
}
 
class Bus implements Fare {
    public void calculateFare() {
        System.out.println("Bus fare: Rs. 50");
    }
}
 
class Auto implements Fare {
    public void calculateFare() {
        System.out.println("Auto fare: Rs. 80");
    }
}
 
public class FareDemo {
    public static void main(String[] args) {
        Fare f1 = new Bus();
        Fare f2 = new Auto();
        f1.calculateFare();
        f2.calculateFare();
    }
}
Sample Output:
Bus fare: Rs. 50
Auto fare: Rs. 80
Result: Both classes implemented the interface method and the correct fare was displayed.
Program 5b: Notification Interface with Email and SMS
Aim: To implement one interface in two classes and show runtime use of the interface.
Scenario: An e-commerce app sends the same message by email and by SMS.
Program:
interface Notification {
    void send(String message);
}
 
class Email implements Notification {
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
 
class SMS implements Notification {
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}
 
public class NotificationDemo {
    public static void main(String[] args) {
        String msg = "Your order has been shipped";
        Notification n1 = new Email();
        Notification n2 = new SMS();
        n1.send(msg);
        n2.send(msg);
    }
}
Sample Output:
Email sent: Your order has been shipped
SMS sent: Your order has been shipped
Result: The same interface reference produced different behaviour for each implementing class.
