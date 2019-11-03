import java.util.Scanner;
public class GuardianAngles {

    public static void main (String [] args) {
        if (inequality() == -1)
            System.out.println("Program ended");
    }

    public static int inequality() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This is the Guardian Angle Program. (1 to begin, -1 to exit): ");
        int ans = keyboard.nextInt();
        if (ans == -1)
            return -1;

        while (ans != -1) {
            System.out.println("Please enter three numbers (-1 to exit): ");
            int x = keyboard.nextInt();
            // System.out.println("Please enter the second number: ");
            int y = keyboard.nextInt();
            // System.out.println("Please enter the third number: ");
            int z = keyboard.nextInt();

            if ((x * x + y * y) == (z * z) || (y * y + z * z) == (x * x) || (x * x + z * z) == (y * y)) {
                System.out.println(x + " " + y + " " + z + " is a right triangle");
            }
            else if (x >= (y + z) || y >= (x + z) || z >= (x + y)) {
                System.out.println(x + " " + y + " " + z + " is not a triangle");
            }
            else if ((x == y) && (y == z)) {
                System.out.println(x + " " + y + " " + z + " is a equilateral triangle");
            }
            else if ((x == y && y != z) || (x != y && z == x) || (z != y && z == x)) {
                System.out.println(x + " " + y + " " + z + " is a isosceles triangle");
            }
            else if ((x != y) && (y != z)) {
                System.out.println(x + " " + y + " " + z + " is a scalene triangle");
            }
            else if ((x == -1) || (y == -1) || (z == -1)){
                ans = -1;
            }
            System.out.println();
            System.out.println("(1 to begin, -1 to exit): ");
            ans = keyboard.nextInt();
        }
        return ans;
    }
}
