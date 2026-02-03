import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class InteractivePlayer {
    public static void main(String [] args) {
        //System.out.println("Nelson Wing");
        Scanner keyboard = new Scanner(System.in); //keyboard input
        System.out.println("How many players do you want?"); //prompt
        int numPlayers = keyboard.nextInt();
        //System.out.println(numPlayers);
        
        ArrayList <Player> playerList = new ArrayList<Player>();

        for (int i=0; i < numPlayers; i++) {
            //System.out.println(i); 
            System.out.println("What should player " +(i+1)+"'s name be?");
            String playerLoopName = keyboard.next();
            System.out.println("What should player " +(i+1)+"'s jersey number be?");
            int playerLoopJNum = keyboard.nextInt();
            Player newPlayer = new Player(playerLoopName,playerLoopJNum);
            //System.out.println(newPlayer); 
            playerList.add(newPlayer);
        }

        //System.out.println(playerList); 
        

        for(Player processPlayer : playerList) {
            //prompt and input for team name
            System.out.println("What should " + processPlayer.getName() + "'s team be?");
            processPlayer.setTeam(keyboard.next());

            //prompts and inputs for date of birth
            System.out.println("What should " + processPlayer.getName() + "'s birth YEAR be?");
            int playerBirthYear = keyboard.nextInt();

            System.out.println("What should " + processPlayer.getName() + "'s birth MONTH be?");
            int playerBirthMonth = keyboard.nextInt();

            System.out.println("What should " + processPlayer.getName() + "'s birth DAY be?");
            int playerBirthDay = keyboard.nextInt();

            //setting date of birth thru LocalDate.of, taken from prev lab
            processPlayer.setDateOfBirth(LocalDate.of(playerBirthYear, playerBirthMonth, playerBirthDay));
        } 
        
        keyboard.close();

        System.out.println(playerList); 
    }
}
