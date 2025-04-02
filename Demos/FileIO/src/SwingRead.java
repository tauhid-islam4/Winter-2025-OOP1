import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class SwingRead {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("File Chooser Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create a button to open the file chooser
        JButton openButton = new JButton("Open File");
        openButton.setBounds(130, 50, 120, 30);
        frame.add(openButton);

        // Add ActionListener to open file chooser when button is clicked
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);

                // Check if the user selected a file
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    readFile(selectedFile);
                }
            }
        });

        // Show the frame
        frame.setVisible(true);
    }

    private static void readFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("\nFile Contents:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        }
    }
}
