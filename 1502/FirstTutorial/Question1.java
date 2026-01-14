package FirstTutorial;

public class Question1 {
    public static void main(String [] args) {
        int x = 7/2;
        int y = (int) (4.0*x);
        double z = Math.min(13,y);

        y = x * x;
        x += y;
        z = 2 * z; 

        System.out.print(x+"\n"+y+"\n"+z);
    }
}
