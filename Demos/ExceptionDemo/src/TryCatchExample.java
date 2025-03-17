//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TryCatchExample {
    public static void main(String[] args) {
            // Divison by 0 will cause an ArithmeticException.
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("The operation in the Try block was not successful " +
                 "because there was an attempted " + e.getMessage());
            //System.out.println(e.getStackTrace());
        }


        System.out.println("The operation in the Try block was successful");
    }
}
