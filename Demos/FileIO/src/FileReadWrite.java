import java.io.*;
import java.util.Scanner;

enum Operation {
    READ, WRITE, EXIT
}

public class FileReadWrite {
    private static final String FILE_NAME = "example.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Read File");
            System.out.println("2. Write to File");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 3.");
                continue;
            }

            Operation operation;
            switch (choice) {
                case 1:
                    operation = Operation.READ;
                    break;
                case 2:
                    operation = Operation.WRITE;
                    break;
                case 3:
                    operation = Operation.EXIT;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    continue;
            }

            switch (operation) {
                case READ:
                    readFile();
                    break;
                case WRITE:
                    writeFile(scanner);
                    break;
                case EXIT:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
            }
        }
    }

    private static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\nFile Contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read.");
        }
    }

    private static void writeFile(Scanner scanner) {
        System.out.print("Enter text to write to the file: ");
        String data = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(data);
            writer.newLine();
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to file.");
        }
    }
}
