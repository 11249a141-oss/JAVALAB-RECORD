Experiment 9: User-Defined Exceptions
Program 9a: Invalid File Format Exception
Aim: To create a user-defined exception and throw it when the file extension is not supported.
Scenario: A video editor accepts only .mp4, .avi and .mov files.
Program:
import java.util.Scanner;
 
class InvalidFileFormatException extends Exception {
    InvalidFileFormatException(String message) {
        super(message);
    }
}
 
public class FileFormatCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();
 
        try {
            if (!(fileName.endsWith(".mp4") || fileName.endsWith(".avi")
                    || fileName.endsWith(".mov"))) {
                throw new InvalidFileFormatException("Unsupported file format.");
            }
            System.out.println("Valid video file format.");
        } catch (InvalidFileFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
Sample Output:
Enter file name: lecture.pdf
Error: Unsupported file format.
 
Enter file name: movie.mp4
Valid video file format.
Result: The custom exception was thrown for an unsupported extension and caught by the handler.
Program 9b: Invalid Quantity Exception
Aim: To define a custom exception that is thrown when the quantity is zero or negative.
Scenario: An online shop does not accept an order quantity of zero or less.
Program:
import java.util.Scanner;
 
class InvalidQuantityException extends Exception {
    InvalidQuantityException(String message) {
        super(message);
    }
}
 
public class QuantityCheck {
    static void checkQuantity(int q) throws InvalidQuantityException {
        if (q <= 0) {
            throw new InvalidQuantityException("Quantity must be greater than zero.");
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int q = sc.nextInt();
 
        try {
            checkQuantity(q);
            System.out.println("Order accepted for " + q + " item(s).");
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
Sample Output:
Enter quantity: 0
Error: Quantity must be greater than zero.
 
Enter quantity: 4
Order accepted for 4 item(s).
Result: The user-defined exception was thrown from a method and handled in main().
