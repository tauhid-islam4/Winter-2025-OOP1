import com.dc.demo.Product;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Date date1 = new Date();
        /*date1.setYear(2025);
        date1.setMonth(1);
        date1.setDate(28);*/

        Date date2 = new Date();
        date2.setYear(135);
        /*date2.setMonth(1);
        date2.setDate(28);*/



        Product p1 = new Product(1, "Car", 100000, date1, date2, 5000);

        p1.printProductDescription();

        System.out.println("The manufacturer is : "+ p1.MANUFACTURER_NAME);
        System.out.println("The manufacturer is : "+ Product.MANUFACTURER_NAME);
        Product.MANUFACTURER_NAME = "TOYOTA";
        System.out.println("---------------------------------------------------");
        System.out.println("The manufacturer is : "+ p1.MANUFACTURER_NAME);
        System.out.println("The manufacturer is : "+ Product.MANUFACTURER_NAME);

    }
}