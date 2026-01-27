import java.time.LocalDate;

public class ProfPlayerDriver {
    public static void main (String [] args) {
        System.out.println("BEGIN testing the setters and getters that you created.\n");

        Player me = new Player();

        // 1. test the setters and getters for height
		Player defense = new Player(6, "ralph priso");
        defense.setHeight(100.3);
        System.out.println(100.3 +" ? "+ defense.getHeight());

        // 2. test the setters and getters for jersey num
		Player forward = new Player("jonathan david", 10);
        forward.setJerseyNum(25);
        System.out.println(25 +" ? "+ forward.getJerseyNum());

        // 3. test the setters and getters for weight
        Player stephen = new Player(4, "stephen eustáquio", 178, 66);
        stephen.setWeight(78);
        System.out.println(78 + " ? " +stephen.getWeight());

        // 4. test the setters and getters for date of birth
		Player goalie = new Player(1, "Dayne St. Clair", 190.5, 86.18255, LocalDate.of(1997, 5, 9));
        goalie.setDateofBirth(LocalDate.now());
        System.out.println(goalie.getDateofBirth());

        // 5. test the setters and getters for team
        Player ahmed = new Player(21, "ali ahmed", 180, 69.85, LocalDate.of(2000, 10, 10),  "Norwich City");
        ahmed.setTeam("CANMNT");
        System.out.println("CANMNT ? " +ahmed.getTeam());

        // 6. test the setters and getters for name
        me.setName("Apoorve Chokshi");
        System.out.println("Apoorve Chokshi ? " +me.getName());
        
        System.out.println("\nEND testing the setters and getters that you created.\n");

        // test whether the 'getAge' logic was correctly implemented
        System.out.println(26 + " ? " +ahmed.getAge());

        System.out.println("Finish testing all the code from weeks 2 and 3....\n\n\n");

        System.out.println("Test printing of Player objects...");
        // more logic that we will eventually complete...shortly
        System.out.println("me: " +me);
        System.out.println("defense: " +defense);
        System.out.println("forward: " +forward);
        System.out.println("stephen: " +stephen);
        System.out.println("goalie: " +goalie);
        System.out.println("ahmed: " +ahmed);
    }
}