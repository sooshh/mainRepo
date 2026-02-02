package feb2Class;

public class Main {
    public static void main(String [] args) {
        String oneString = "hello";
        String twoString = "hello";
        String threeString = new String("hello");

        System.out.println(oneString + " " + twoString + " " + threeString + " " + (oneString == twoString) + " " + (oneString == threeString));
    }
    
}
