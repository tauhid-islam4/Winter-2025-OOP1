import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //basicDateTime();
        //workingWithDates();
        useCalendar();
    }

    private static void basicDateTime(){
        LocalDateTime myDate = LocalDateTime.now();
        System.out.println("Before formatting: " + myDate);
        DateTimeFormatter myFormat =
             DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss");
        String formattedDate = myDate.format(myFormat);
        System.out.println("After formatting: " + formattedDate);
    }

    private static void workingWithDates(){
        LocalDateTime myDate = LocalDateTime.now();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes of delay: ");
        int minutesToAdd = input.nextInt();
        LocalDateTime modifiedDate = myDate.plusMinutes(minutesToAdd);

        DateTimeFormatter myFormat =
             DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String formattedDate = modifiedDate.format(myFormat);
        System.out.println("After delay: " + formattedDate);
    }

    private static void useCalendar(){
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println( "Current year is: " + year );
        System.out.println( "Current month is: " + month );
        System.out.println( "Current day is: " + day );
        System.out.println( "Current hour is: " + hour );
        System.out.println("Current minute is: " + minute );
        System.out.println( "Current second is: " + second );

        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeZone());

    }
}