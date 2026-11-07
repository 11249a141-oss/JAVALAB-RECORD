Experiment 11: File Operations
Program 11a: Write and Read a Text File Using FileWriter and FileReader
Aim: To write text into a file and read it back character by character.
Scenario: A text editor saves a note to a file and then reads it back.
Program:
import java.io.*;
import java.util.Scanner;
 
public class NoteFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter note text: ");
        String text = sc.nextLine();
 
        try (FileWriter writer = new FileWriter("notes.txt")) {
            writer.write(text);
        }
        System.out.println("Note saved to notes.txt");
 
        try (FileReader reader = new FileReader("notes.txt")) {
            System.out.println("Note content:");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        }
        sc.close();
    }
}
Sample Output:
Enter note text: Submit lab record on Monday
Note saved to notes.txt
Note content:
Submit lab record on Monday
Result: The text was written to notes.txt and read back exactly as entered.
Program 11b: Profile Data Using FileOutputStream and FileInputStream
Aim: To write bytes to a file and read them back using streams.
Scenario: A fitness app stores a user profile in a text file and displays it.
Program:
import java.io.*;
import java.nio.charset.StandardCharsets;
 
public class ProfileFile {
    public static void main(String[] args) {
        String data = "Name: Ravi\nAge: 20\nFitness Goal: Weight Loss";
        try {
            FileOutputStream fos = new FileOutputStream("profile.txt");
            fos.write(data.getBytes(StandardCharsets.UTF_8));
            fos.close();
            System.out.println("Profile data written successfully.");
 
            FileInputStream fis = new FileInputStream("profile.txt");
            int ch;
            System.out.println("\nUser Profile:");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
Sample Output:
Profile data written successfully.
 
User Profile:
Name: Ravi
Age: 20
Fitness Goal: Weight Loss
Result: The profile was written with FileOutputStream and read back with FileInputStream.
