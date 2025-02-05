import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    //twoDimensionalArrays();
    //sortArrays();
        searchElementInArrays(45);
    }

    private static void oneDimensionalArrays() {
        double[] grades = new double[10];
        for (int i = 0; i < 10; i++) {
            grades[i] = Math.random() * 100;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("While starts now");
        int i=0;
        while(i<10) {
            System.out.println(grades[i]);
            i++;
        }
    }

    private static void twoDimensionalArrays(){

        int[][] twoDArray = new int[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                twoDArray[i][j] = i*j;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void sortArrays(){
        int[] unsortedArray = new int[10];
        for (int i = 0; i < 10; i++) {
            unsortedArray[i] = (int) (Math.random()*100);
        }
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(unsortedArray));

        Arrays.sort(unsortedArray);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(unsortedArray));

    }

    private static void searchElementInArrays(int target) {
        int[] array = new int[50];
        for (int i = 0; i < 50; i++) {
            array[i] = (int) (Math.random()*100);
        }

        System.out.println("The randomly generated array:");
        System.out.println(Arrays.toString(array));
        int linearIndex = -1;
        for (int i = 0; i < 50; i++) {
            if (array[i] == target) {
                linearIndex = i;
                break;
            }
        }
        System.out.println("Linear index: " + linearIndex);

        Arrays.sort(array);

        System.out.println("After sorting the randomly generated array:");
        System.out.println(Arrays.toString(array));
        int binaryIndex = Arrays.binarySearch(array, target);
        System.out.println("Binary index: " + binaryIndex);

    }
}