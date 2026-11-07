Experiment 7: Method Overriding and Polymorphism
Program 7a: Account Type Using Method Overriding
Aim: To override a method in subclasses and call it through a base class reference.
Scenario: A bank displays the type of each account (Savings or Current).
Program:
class BankAccount {
    void displayAccountType() {
        System.out.println("General Bank Account");
    }
}
 
class Savings extends BankAccount {
    @Override
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}
 
class Current extends BankAccount {
    @Override
    void displayAccountType() {
        System.out.println("Current Account");
    }
}
 
public class BankPolymorphism {
    public static void main(String[] args) {
        BankAccount acc;
        acc = new Savings();
        acc.displayAccountType();
        acc = new Current();
        acc.displayAccountType();
    }
}
Sample Output:
Savings Account
Current Account
Result: Java chose the correct overridden method at runtime for each object, demonstrating runtime polymorphism.
Program 7b: Area of Shapes Using Polymorphism
Aim: To override an abstract method and call it for different objects stored in one array.
Scenario: A drawing app calculates the area of different shapes.
Program:
abstract class Shape {
    abstract void displayArea();
}
 
class Circle extends Shape {
    double radius;
    Circle(double r) { radius = r; }
 
    @Override
    void displayArea() {
        System.out.printf("Circle area: %.2f%n", Math.PI * radius * radius);
    }
}
 
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }
 
    @Override
    void displayArea() {
        System.out.printf("Rectangle area: %.2f%n", length * width);
    }
}
 
public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(7), new Rectangle(4, 5) };
        for (Shape s : shapes) {
            s.displayArea();
        }
    }
}
Sample Output:
Circle area: 153.94
Rectangle area: 20.00
Result: Each object used its own overridden displayArea() method through the common Shape reference.
