import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Book book1 = new Book("Data Structures and Algorithms", "Author-1");
        Book book2 = new Book("Data Structures and Algorithms-2", "Author-2");
        Book book3 = new Book("Data Structures and Algorithms-3", "Author-3");

        Book book4 = new Book("OOP-1", "OOP-Author-1");
        Book book5 = new Book("OOP-2", "OOP-Author-2");
        Book book6 = new Book("OOP-3", "OOP-Author-3");


        Stack<Book> stack1 = new Stack<>();
        stack1.push(book1);
        stack1.push(book4);
        stack1.push(book6);


        //System.out.println("THe top of the stack is :" +stack1.peek());
        System.out.println("THe top of the stack before popping :" +stack1.pop());
        System.out.println("THe top of the stack after popping :" +stack1.peek());

        while(!stack1.isEmpty()) {
            System.out.println(" Now processing : " + stack1.pop());
        }

        Queue<Student> queue1 = new LinkedList<>();
        Student student1 = new Student("John Snow");
        Student student2 = new Student("Tyrion Lannister");
        Student student3 = new Student("Arya");
        Student student4 = new Student("Jamie");

        queue1.add(student1);
        queue1.add(student2);
        queue1.add(student3);
        queue1.add(student4);


        System.out.println("The front of the queue before removing :" +queue1.remove());
        System.out.println("The front of the queue after removing :" +queue1.peek());

        while(!queue1.isEmpty()) {
            System.out.println(" Now processing is Queue: " + queue1.remove());
        }

        Deque<Student> deque1 = new LinkedList<>();
        Student student5 = new Student("John Snow 2");
        Student student6 = new Student("Tyrion Lannister 2");

        Student student7 = new Student("Arya 1234");
        Student student8 = new Student("Jamie 2");
        deque1.add(student5);
        deque1.add(student6);
        deque1.add(student7);
        deque1.add(student8);


        System.out.println("THe front of the queue  :" +deque1.getFirst());
        System.out.println("The back of the queue :" +deque1.getLast());

        Map<Character, Integer> characterIntegerMap = new HashMap<>();

        characterIntegerMap.put('A', 11);
        characterIntegerMap.put('B', 2);
        characterIntegerMap.put('C', 3);
        characterIntegerMap.put('E', 23);
        characterIntegerMap.put('I', 31);
        characterIntegerMap.put('S', 41);

        System.out.println( " The frequency of I is : " + characterIntegerMap.get('I'));


        for (Map.Entry<Character, Integer> entry : characterIntegerMap.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key = "+key + " : " + " Value = "+value);
        }

        characterIntegerMap.put('A', characterIntegerMap.getOrDefault('A', 0)+1);
        System.out.println(characterIntegerMap.get('A'));


    }
}