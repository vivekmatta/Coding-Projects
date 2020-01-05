import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {

    public static void main (String [] args) {
        // Creates new scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the length of your password (Less than 66): ");
        int x = keyboard.nextInt();
        // Runs "getPass" function then prints out output
        System.out.println(getPass(x));

    }

    public static String getPass(int length) {
        // List of letters, numbers and symbols to randomize password
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$";
        int rand;
        String output = "";

        // Randomizes a number then prints out the character at that location. Repeats "length" times
        for (int i = 0; i < length; i++) {
            rand = (int) (Math.random() * (66)) + 1;
            output += symbols.charAt(rand);
        }
        return "Password is: " + output;
    }

}
