import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber {

    public static void main (String [] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int x = key.nextInt();

        // new instance of Random 'r'
        Random r = new Random();

        // Variables
        int ans = r.nextInt(x);
        int count = 0;
        boolean hasFound = true;

        while (hasFound) {
            System.out.println("Please guess a number between 0 and " + x);
            int y = key.nextInt();

            // If your guess is the answer end the loop and tell the user how many guesses it took them
            if (y == ans) {
                System.out.println("You got it in " + count + " tries!");
                hasFound = false;
            }

            // If your guess is higher, tell the user to pick a number lower
            else if (y > ans) {
                System.out.println("Guess a little lower");
                System.out.println();
                count++;
            }

            // If your guess is lower, tell the user to pick a number higher
            else if (y < ans) {
                System.out.println("Guess a little higher");
                System.out.println();
                count++;
            }
        }
    }

}
