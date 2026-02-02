import java.util.Scanner;
import java.util.ArrayList;

public class InteractivePlayer {
    public static void main(String [] args) {
        //System.out.println("Nelson Wing");
        Scanner keyboard = new Scanner(System.in); //keyboard input
        System.out.println("How many players do you want?"); //prompt
        int numPlayers = keyboard.nextInt();
        //System.out.println(numPlayers);
        for (int i=0; i < numPlayers; i++) {
            //System.out.println(i); 
            System.out.println("What should player " +(i+1)+"'s name be?");
            String playerLoopName = keyboard.next();
            System.out.println("What should player " +(i+1)+"'s jersey number be?");
            int playerLoopJNum = keyboard.nextInt();
            Player nelson = new Player(playerLoopName,playerLoopJNum);
            System.out.println(nelson); 
        }
    }
}
