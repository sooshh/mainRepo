package FirstTutorial;

public class Question3 {
    public static void main(String [] args) {
        int num = 1;
        int sqr = 0;
        while (num <= 10) {
            sqr = num * num;
            System.out.println(num + " " + sqr);
            num += 2;
        }
        System.out.println(num + " " + sqr);
    }
}
