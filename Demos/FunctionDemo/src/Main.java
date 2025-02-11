import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      int number = 15;

      //Pass by value
      System.out.println("The value of number is (before): " + number);
      changeValue(number);
      System.out.println("The value of number is (after): " + number);

      number = 20;
      //Pass by reference
      NumberWrapper numberWrapper = new NumberWrapper(number);
      System.out.println("The value of number in NumberWrapper is (before): " + numberWrapper.number);
      changeValue2(numberWrapper);
      System.out.println("The value of number in NumberWrapper is (after): " + numberWrapper.number);

      Integer num = 25;

      System.out.println("The value of num in Integer is (before): " + num);
      changeValue3(num);
      System.out.println("The value of num in Integer is (after): " + num);

      //Pass array to sort method
      int [] unsortedArray = new int[] { 56, 23, 1, 45, 6};
      System.out.println("The value of unsorted array is (before): " + Arrays.toString(unsortedArray));
      sort(unsortedArray);
      System.out.println("The value of unsorted array is (after): " + Arrays.toString(unsortedArray));

    }

    //Pass by Value
    static void changeValue(int number){
        number = number + 10;

    }

    static void changeValue3(Integer number){
        number = number + 10;

    }

    //Pass by reference
    static void changeValue2(NumberWrapper numberWrapper){
        numberWrapper.number = numberWrapper.number + 10;
    }

    static class NumberWrapper{
        public int number;
        public NumberWrapper(int number){
        this.number = number;
        }
    }

    public static void sort(int[] array){
        Arrays.sort(array);
    }
}