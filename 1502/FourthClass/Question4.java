package FourthClass;
import java.util.Scanner;

public class Question4 {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        //String num = keyboard.next(); //num = "123"
        int iNum = keyboard.nextInt(); // num = 123
        //int iNum = Integer.parseInt(num); //num = 123
        iNum = iNum*3; //num = 369
        System.out.println("value: " + iNum); // "value: 369"
    }
}