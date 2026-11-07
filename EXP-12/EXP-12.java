Experiment 12: Swing GUI Development
Program 12a: Notes Window Using BorderLayout
Aim: To design a Swing window with header, text area and button using BorderLayout.
Scenario: A notes app shows a title at the top, a writing area in the middle and a Save button at the bottom.
Program:
import javax.swing.*;
import java.awt.*;
 
public class NotesApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Notes App");
        frame.setLayout(new BorderLayout(10, 10));
 
        JLabel header = new JLabel("My Notes", JLabel.CENTER);
        JTextArea noteArea = new JTextArea();
        JButton saveButton = new JButton("Save");
 
        saveButton.addActionListener(e ->
            JOptionPane.showMessageDialog(frame, "Note saved successfully."));
 
        frame.add(header, BorderLayout.NORTH);
        frame.add(new JScrollPane(noteArea), BorderLayout.CENTER);
        frame.add(saveButton, BorderLayout.SOUTH);
 
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
Sample Output:
A window titled "Notes App" opens with "My Notes" at the top, a text area in the middle and a "Save" button at the bottom. Clicking Save shows the message "Note saved successfully."
Result: The components were placed in the correct regions using BorderLayout and the button event worked.
Program 12b: Counter Window Using ActionListener
Aim: To handle button click events in a Swing application using ActionListener.
Scenario: A simple counter app increases a number on each click and resets it on demand.
Program:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class CounterApp extends JFrame implements ActionListener {
    JLabel countLabel;
    JButton increaseButton, resetButton;
    int count = 0;
 
    CounterApp() {
        setTitle("Counter App");
        setLayout(new FlowLayout());
 
        countLabel = new JLabel("Count: 0");
        increaseButton = new JButton("Increase");
        resetButton = new JButton("Reset");
 
        add(countLabel);
        add(increaseButton);
        add(resetButton);
 
        increaseButton.addActionListener(this);
        resetButton.addActionListener(this);
 
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == increaseButton) {
            count++;
        } else if (e.getSource() == resetButton) {
            count = 0;
        }
        countLabel.setText("Count: " + count);
    }
 
    public static void main(String[] args) {
        new CounterApp();
    }
}
Sample Output:
A "Counter App" window opens showing "Count: 0". After clicking Increase three times the label shows "Count: 3". Clicking Reset shows "Count: 0" again.
Result: Each button click was handled by actionPerformed() and the label was updated correctly.
