import java.text.NumberFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Date date = new Date();
        date.getTime();
        System.out.println(date);
        String result = NumberFormat.getCurrencyInstance().format(1329849387.13791);
        System.out.println(result);

        System.out.print("*");     // Line 1

        System.out.print("*");   // Line 2

        System.out.println();    // Line 3

        System.out.println("*"); // Line 4

        System.out.print("I do not fear computers." );   // Line 1

        System.out.println("I fear the lack of them.");  // Line 2

        System.out.println("--Isaac Asimov");            // Line 3
    }

}