import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Click Me");
        frame.getContentPane().add(button); // Adds the button to the frame

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked in console displayed!");
            }
        });

        frame.setVisible(true); // Displays the frame
    }

}