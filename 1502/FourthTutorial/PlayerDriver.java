package FourthTutorial;

import java.time.LocalDate;

public class PlayerDriver {
    public static void main(String[] args) {
        //Players:
        Player me = new Player();
        Player defence = new Player(6, "ralph priso");
        Player forward = new Player("Jonathan David", 10);
        Player stephen = new Player(4, "stephen eustaquio", 178, 66);
        Player goalie = new Player(1, "dayne st. clair", 190.5, 86.18, LocalDate.of(1997, 5, 9));
        Player ahmed = new Player(21, "ali ahmed", 180, 69.85, LocalDate.of(2000, 10, 10), "Norwich City");

        System.out.println(me.getJerseyNum());
        System.out.println(me.getName());
       
        //Testing:
        defence.setJerseyNum(me.getJerseyNum());
        forward.setName(stephen.getName());
        goalie.setHeight(ahmed.getHeight());
        ahmed.setWeight(goalie.getWeight());
        me.setTeam(ahmed.getTeam());
        me.setDateOfBirth(LocalDate.of(2004,03,04));

        System.out.println(me.getJerseyNum());
        System.out.println(forward.getName());
        System.out.println(goalie.getHeight());
        System.out.println(ahmed.getWeight());
        System.out.println(me.getDateOfBirth());

        //Prints:
        System.out.println("me: " +me);
        System.out.println("defence: " +defence);
        System.out.println("forward: " +forward);
        System.out.println("stephen: " +stephen);
        System.out.println("goalie: " +goalie);
        System.out.println("ahmed: " +ahmed);
    }
}
