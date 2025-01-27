import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //demonstrateSwitchCase();
        printCenteredTriangle();
    }

    private static void demonstrateSwitchCase(){
        String[] fruits  = {"apple", "banana", "orange", "pear", "pineapple"};
        //String choice1 = "banana";
        //String choice2 = "mango";
        Scanner input = new Scanner(System.in);
        String choice;
        choice = input.nextLine();
        switch(choice){
            case "apple":
                System.out.println("Fruit is: Apple");
                break;
            case "banana":
                System.out.println("Fruit is: Banana");
                break;
            case "orange":
                System.out.println("Fruit is: Orange");
                break;
            case "pear":
                System.out.println("Fruit is: Pear");
                break;
            case "pineapple":
                System.out.println("Fruit is: Pineapple");
                break;
            default:
                System.out.println("Not a valid fruit");
                break;
        }
    }

    private static void printCenteredTriangle(){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of rows
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();

        // Generate the centered triangle
        for (int i = 1; i <= rows; i++) {
            // Print spaces for centering
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks for the row
            for (int j = 1; j <= (2 * i - i); j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        scanner.close();
    }
}