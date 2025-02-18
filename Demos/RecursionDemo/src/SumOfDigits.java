public class SumOfDigits {
    public static int sumDigits(int n) {
        if (n == 0) return 0;
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int num = 9875;
        System.out.println("Sum of digits: " + sumDigits(num)); // Output: 29
    }
}
