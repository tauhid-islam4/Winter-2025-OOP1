import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.



        customObjectTest();
    }
    private static void testBasicCollection(){
        List<String> listOfNames = new ArrayList<String>();
        listOfNames.add("John");
        listOfNames.add("Jane");
        listOfNames.add("Bob");

        listOfNames.add(1,"Mary");

        System.out.println(listOfNames.getFirst());

        System.out.println(listOfNames);

        System.out.println(listOfNames.size());

        String input = "Mary";

        System.out.println("The array list contains Mary : " + listOfNames.contains(input));

        Collections.sort(listOfNames.reversed());
        System.out.println(listOfNames);
    }

    private static void customObjectTest() {
        Student student1 = new Student("John", "Snow", 1998);
        Student student2 = new Student("Jamie", "Lannister", 1980);
        Student student3 = new Student("Arya", "Stark", 2005);
        Student student4 = new Student("Tywin", "Lannister", 1980);

        Student student5 = new Student("Jamie", "Lannister", 1980);

        List<Student>   studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println(studentList);

        System.out.println("Student 1 is equal to Student 2 : " + student1.equals(student2));
        System.out.println("Student 2 is equal to Student 3 : " + student2.equals(student3));
        System.out.println("Student 3 is equal to Student 4 : " + student3.equals(student4));
        System.out.println("Student 4 is equal to Student 5 : " + student4.equals(student5));
        System.out.println("Student 5 is equal to Student 2 : " + student5.equals(student2));
        System.out.println("Student 2 is equal to Student 4 : " + student2.equals(student4));

        System.out.println(student3);



    }
}