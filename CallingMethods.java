/* CallingMethods.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethods
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Testing");
	}

	public static void printTwo() {
		printOne();
		printOne();
		System.out.println("123!");
	}
}