package FirstClass;
public class Main {

	public static void main(String[] args) { // DO NOT CONTAIN EVERYTHING IN STATIC
		int x = 7 / 2; // must always declare datatype 
		int y = (int) (4.0*x); // (int) is same as int(value)
		double z = Math.min(13, y); // always use double (float is for small) 
// Math is a library of methods, min takes the smaller of the two values given
		y = x * x; // multiplication
		x += y; // adds y to x and the sum now equals x
		z = 2 * z; // when a int is multiplied wih a double it turns into a double
		System.out.println(x + "\n" + y + "\n" + z); // printing the line of variables
	}


}
