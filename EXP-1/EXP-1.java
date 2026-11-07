Experiment 1: Classes, Methods and Arrays
Program 1a: Student Details Using Class and Methods
Aim: To store and display student details using a class with methods.
Scenario: A school stores the name, roll number and department of a student.
Program:
import java.util.Scanner;
 
class Student {
    String name;
    int roll;
    String department;
 
    void setDetails(String n, int r, String d) {
        name = n;
        roll = r;
        department = d;
    }
 
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Department: " + department);
    }
}
 
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
 
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter department: ");
        String dept = sc.nextLine();
 
        s.setDetails(name, roll, dept);
        System.out.println("\nStudent Details:");
        s.displayDetails();
        sc.close();
    }
}
Sample Output:
Enter name: Priya
Enter roll number: 21
Enter department: CSE
 
Student Details:
Name: Priya
Roll No: 21
Department: CSE
Result: The program stored the student details in an object and displayed them correctly.
Program 1b: Highest Mark Using Arrays
Aim: To find the highest mark among five marks stored in an array.
Scenario: A college wants the highest mark from five students.
Program:
import java.util.Scanner;
 
public class HighestMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
 
        System.out.println("Enter marks of 5 students:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
 
        int highest = marks[0];
        for (int i = 1; i < 5; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
        }
        System.out.println("Highest Mark: " + highest);
        sc.close();
    }
}
Sample Output:
Enter marks of 5 students:
45 78 62 91 70
Highest Mark: 91
Result: The array was traversed and the largest value was identified correctly.
