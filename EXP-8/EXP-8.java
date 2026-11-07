Experiment 8: Threading
Program 8a: Payment Processing Using Runnable
Aim: To create a thread by implementing the Runnable interface.
Scenario: A payment gateway simulates a payment process in a separate thread.
Program:
class Payment implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing... (step " + i + ")");
        }
    }
}
 
public class PaymentThread {
    public static void main(String[] args) {
        Thread t = new Thread(new Payment());
        t.start();
    }
}
Sample Output:
Payment Processing... (step 1)
Payment Processing... (step 2)
Payment Processing... (step 3)
Payment Processing... (step 4)
Payment Processing... (step 5)
Result: The Runnable task ran inside a separate thread started with start().
Program 8b: Counter Thread with 1-Second Delay
Aim: To create a thread by extending the Thread class and pause it using sleep().
Scenario: A task manager simulates a timer that counts from 1 to 5.
Program:
class ThreadCounter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                return;
            }
        }
    }
}
 
public class ThreadCounterDemo {
    public static void main(String[] args) {
        ThreadCounter t = new ThreadCounter();
        t.start();
    }
}
Sample Output:
Count: 1
Count: 2
Count: 3
Count: 4
Count: 5   (each number appears after a 1-second gap)
Result: The thread counted from 1 to 5 with a one-second pause between each count.
