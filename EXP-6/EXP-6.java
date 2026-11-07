Experiment 6: Inheritance
Program 6a: Savings Account Balance Using Inheritance
Aim: To display an account balance through a subclass that inherits from a base class.
Scenario: A bank has a base Account class and a SavingsAccount subclass.
Program:
class Account {
    double balance = 5000;
 
    void displayBalance() {
        System.out.println("Account Balance: Rs. " + balance);
    }
}
 
class SavingsAccount extends Account {
    void displaySavingsDetails() {
        System.out.println("Savings Account Details:");
        displayBalance();
    }
}
 
public class BankInheritance {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.displaySavingsDetails();
    }
}
Sample Output:
Savings Account Details:
Account Balance: Rs. 5000.0
Result: SavingsAccount reused the balance and method of Account through inheritance.
Program 6b: Manager Salary Using Inheritance
Aim: To extend a class and use inherited fields and methods to compute a total salary.
Scenario: A company has Employee as the base class and Manager as a subclass with a bonus.
Program:
class Employee {
    String name;
    double salary;
 
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }
}
 
class Manager extends Employee {
    double bonus;
 
    void displayManagerDetails() {
        displayDetails();
        System.out.println("Bonus: Rs. " + bonus);
        System.out.println("Total Pay: Rs. " + (salary + bonus));
    }
}
 
public class ManagerDemo {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Anil";
        m.salary = 50000;
        m.bonus = 10000;
        m.displayManagerDetails();
    }
}
Sample Output:
Name: Anil
Salary: Rs. 50000.0
Bonus: Rs. 10000.0
Total Pay: Rs. 60000.0
Result: Manager inherited the salary field and displayDetails() method from Employee.
