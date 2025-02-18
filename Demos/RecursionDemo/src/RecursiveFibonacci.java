//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RecursiveFibonacci {
    public static void main(String[] args) {
        int number = 12;
        System.out.println("The "+ number+"th number in fibonacci sequence is  " );
        System.out.println(fibonacci(number));
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}