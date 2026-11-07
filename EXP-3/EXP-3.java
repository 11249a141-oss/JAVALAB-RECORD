Experiment 3: Control Statements and Operators
Program 3a: Shopping Discount Using if-else
Aim: To apply a 10% discount when the purchase amount is more than Rs. 1000.
Scenario: A shopping app gives a discount on large purchases.
Program:
import java.util.Scanner;
 
public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
 
        if (amount > 1000) {
            double discount = amount * 0.10;
            System.out.println("Discount: Rs. " + discount);
            System.out.println("Final Amount: Rs. " + (amount - discount));
        } else {
            System.out.println("No discount available.");
            System.out.println("Final Amount: Rs. " + amount);
        }
        sc.close();
    }
}
Sample Output:
Enter purchase amount: 1500
Discount: Rs. 150.0
Final Amount: Rs. 1350.0
 
Enter purchase amount: 800
No discount available.
Final Amount: Rs. 800.0
Result: The discount condition and arithmetic operators worked as expected for both inputs.
Program 3b: Temperature Message Using if-else
Aim: To display a message based on the temperature range.
Scenario: A weather app shows Cold, Normal or Hot depending on the temperature.
Program:
import java.util.Scanner;
 
public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
 
        if (temp < 20) {
            System.out.println("The weather is Cold.");
        } else if (temp <= 30) {
            System.out.println("The weather is Normal.");
        } else {
            System.out.println("The weather is Hot.");
        }
        sc.close();
    }
}
Sample Output:
Enter temperature: 15
The weather is Cold.
 
Enter temperature: 35
The weather is Hot.
Result: The if-else ladder selected the correct message for each temperature range.
