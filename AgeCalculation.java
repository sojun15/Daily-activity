package main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AgeCalculation {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Age Calculation");

        // Create a JTextField
        JTextField textField = new JTextField();
        JButton button = new JButton("Click here");
        JLabel label = new JLabel("Type your birth date(dd-mm-yyyy):");

        // Set bounds (x, y, width, height) for the text field
        textField.setBounds(50, 50, 200, 30);
        button.setBounds(50, 100, 200, 30);
        label.setBounds(50, 10, 200, 30);
        
        button.addActionListener(new ActionListener() {           
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();               
                LocalDate dateNow = LocalDate.now();
                LocalDate datePast = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                Period period = Period.between(datePast, dateNow);
                JTextField textField3 = new JTextField("Now Your Age : "+period.getYears()+" year "+period.getMonths()+" month "+period.getDays()+" day");
                textField3.setBounds(50, 150, 250, 30);
                frame.add(textField3);

            }
        });

        // Add the text field to the frame
        frame.add(textField);
        frame.add(button);
        frame.add(label);
        //Set frame size and make it visible
        frame.setSize(500, 500);
        frame.setLayout(null); // We're using null layout for simplicity
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
