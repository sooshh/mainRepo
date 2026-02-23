import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;

public class InteractivePlayer {
    public static void main(String[] args) {
        System.out.println("Apoorve Chokshi");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many players do you want to create? ");
        int numPlayers = keyboard.nextInt();
        // System.out.println("players to enter: " +numPlayers);

        keyboard.nextLine(); // read & discard the newline character after numPlayers is read

        // declare an array list of Player objects
        ArrayList<Player> playerList = new ArrayList<Player>();

        // using the information received earlier by the user, let's create
        // that many players
        for (int i = 0; i < numPlayers; i++) {
            System.out.print("Player " + (i + 1) + " name: ");

            // a player's name can have a space, so let's use nextLine()
            String playerName = keyboard.nextLine();

            // get the jersey number
            System.out.print("Player " + (i + 1) + " jersey #: ");
            int jerseyNum = keyboard.nextInt();

            keyboard.nextLine(); // read & discard the newline character after jerseyNum is read

            Player newPlayer = new Player(playerName, jerseyNum);
            // System.out.println(newPlayer);
            playerList.add(newPlayer);
        }

        System.out.println("finished creating player list:\n" + playerList+ "\n");

        // Step 6
        for (Player processPlayer : playerList) {
            System.out.println("Update player information:\n");

            // get birth year information from the user
            System.out.println("Update " + processPlayer.getName() + " date of birth: ");
            System.out.print("birth year: ");
            int birthYear = keyboard.nextInt();
            System.out.print("birth month: ");
            int birthMonth = keyboard.nextInt();
            System.out.print("day of the month: ");
            int dayOfMonth = keyboard.nextInt();

            keyboard.nextLine(); // read & discard the newline character after dayOfMonth is read

            // call the setter to update the date of birth from the default
            processPlayer.setDateofBirth(LocalDate.of(birthYear, birthMonth, dayOfMonth));
            // verify that age is no longer 0
            // System.out.println(processPlayer);

            // get team name from the user
            System.out.println("\nUpdate " + processPlayer.getName() + " team name: ");
            System.out.print("team name: ");
            String strTeamName = keyboard.nextLine();
            processPlayer.setTeam(strTeamName);

            // verify that team is no longer null
            // System.out.println(processPlayer);
        }

        System.out.println("finished processing player list:\n" + playerList+ "\n");

        // now that we no longer need the keyboard, let's close access to it
        keyboard.close();
    }
}
