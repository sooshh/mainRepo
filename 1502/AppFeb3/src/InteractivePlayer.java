import java.util.Scanner;
import java.time.LocalDate; //needed to import LocalDate to use LocalDate.of()
import java.util.ArrayList;

public class InteractivePlayer {
    public static void main(String [] args) {
        //System.out.println("Nelson Wing");
        Scanner keyboard = new Scanner(System.in); //keyboard input initialize
        System.out.println("How many players do you want?"); //prompt
        int numPlayers = keyboard.nextInt(); //integer input
        //System.out.println(numPlayers);
        
        ArrayList <Player> playerList = new ArrayList<Player>(); //creates an ArrayList that takes Player type objects and is named playerList
        //ArrayList is VERY different from Array
        
        //for loop that will loop as many times as the user defined and will create a new Plater object each loop and add it to the ArrayList
        for (int i=0; i < numPlayers; i++) {
            //System.out.println(i); 
            System.out.println("What should player " +(i+1)+"'s name be?");
            String playerLoopName = keyboard.next();
            System.out.println("What should player " +(i+1)+"'s jersey number be?");
            int playerLoopJNum = keyboard.nextInt();
            Player newPlayer = new Player(playerLoopName,playerLoopJNum); //makes a new Player object 
            //System.out.println(newPlayer); 
            playerList.add(newPlayer); // adds the created Player object to the ArrayList
        }

        //System.out.println(playerList); 
        
        //for loop that goes through each item in player list and names it processPlayer, this is to set the team name and DOB to all objects inside the arrayList
        for(Player processPlayer : playerList) {
            //prompt and input for team name
            System.out.println("What should " + processPlayer.getName() + "'s team be?");
            processPlayer.setTeam(keyboard.next());

            //prompts and inputs for date of birth
            //System.out.println("What should " + processPlayer.getName() + "'s birth YEAR be?");
            //int playerBirthYear = keyboard.nextInt();

            //System.out.println("What should " + processPlayer.getName() + "'s birth MONTH be?");
            //int playerBirthMonth = keyboard.nextInt();

            //System.out.println("What should " + processPlayer.getName() + "'s birth DAY be?");
            //int playerBirthDay = keyboard.nextInt();

            //setting date of birth thru LocalDate.of, taken from prev lab, using individually set variables
            //processPlayer.setDateOfBirth(LocalDate.of(playerBirthYear, playerBirthMonth, playerBirthDay));

            
            //experimenting:
            System.out.println("What should " + processPlayer.getName() + "'s date of birth be? (YYYY MM DD)");
            //instead of setting each variable individually i tried to call keyboard inside LocalDate.of(), and when i compiled it let me do each input on multiple lines or on the same line (seperated by spaces)
            processPlayer.setDateOfBirth(LocalDate.of(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt()));
        } 
        
        keyboard.close(); //closes the Scanner object named keyboard

        System.out.println(playerList); 
    }
}
