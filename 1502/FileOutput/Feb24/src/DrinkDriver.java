//step 1
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;

public class DrinkDriver {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Name your new drink:");
        Drink newDrink = new Drink(keyboard.nextLine());
        System.out.println(newDrink);

        
        //step 2
        String filename = "output.txt";
        PrintWriter output = new PrintWriter(filename);
        output.println(newDrink);
        output.close();


        //step 3
        ArrayList<Drink> drinkList = new ArrayList<Drink>();
        
        System.out.println("How may drinks do you want to make?");
        int iterations = Integer.parseInt(keyboard.nextLine());

        for (int i = 0; i < iterations; i++) {
            System.out.println("What is the name of drink " + (i+1) + "?");
            Drink tempDrink = new Drink(keyboard.nextLine());
            drinkList.add(tempDrink);
        }

        System.out.println(drinkList);


        //step 4
        String drinkFilename = "drinks.txt";
        output = new PrintWriter(drinkFilename);
        for (Drink drink : drinkList) {
            output.println(drink);
        }
        output.close();

        keyboard.close();
    }
}
