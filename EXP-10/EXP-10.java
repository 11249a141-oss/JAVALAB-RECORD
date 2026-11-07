Experiment 10: Predefined Exceptions
Program 10a: ArrayIndexOutOfBoundsException
Aim: To handle an invalid array index without stopping the program.
Scenario: A school app reads marks from an array, but one index is outside the array.
Program:
public class MarksAccess {
    public static void main(String[] args) {
        int[] marks = {45, 67, 89, 72, 90};
        try {
            System.out.println("Mark at index 2: " + marks[2]);
            System.out.println("Mark at index 5: " + marks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Program continues normally.");
    }
}
Sample Output:
Mark at index 2: 89
Error: Index 5 out of bounds for length 5
Program continues normally.
Result: The exception was caught, and the rest of the program continued to run.
Program 10b: NumberFormatException
Aim: To catch the error raised when a text value cannot be converted to an integer.
Scenario: An app asks the user for their age and converts the input to a number.
Program:
import java.util.Scanner;
 
public class AgeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String input = sc.nextLine();
 
        try {
            int age = Integer.parseInt(input);
            System.out.println("Age entered: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid whole number.");
        }
        sc.close();
    }
}
Sample Output:
Enter your age: 21
Age entered: 21
 
Enter your age: twenty
Error: Please enter a valid whole number.
Result: The invalid text input was caught by NumberFormatException and a clear message was shown.
