package FirstTutorial;

public class Question2 {
    public static void main(String [] args) {
        int speed = 75;
        double fine = 0;

        if (speed >= 35) {
            fine = 50;
        }

        if (speed >= 75) {
            fine = 30;
        }

        if (speed >= 75) {
            fine = 30;
        }

        if (fine > 50) {
            fine = 70;
        } else if (fine > 30) {
            fine = 100;
        }

        System.out.printf("$%.2f", fine);
    }
}
