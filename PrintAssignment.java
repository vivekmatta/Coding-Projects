import java.util.Scanner;
import java.lang.String;

class PrintAssignment {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // -------------------------------- Assignment 1 -------------------------------------
        // Print out PI to 8 times, each time with one more decimal place, starting with 1 decimal place (use %f).
        // Left Justify so that the decimal points line up.
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Assignment to print pi with one more decimal place: Starts here");

        for (int j = 1; j <= 8; j++)
        {
            System.out.printf(j + ": " + "%." + j + "f", 3.14159265);
            System.out.println();

        }
        System.out.println("Assignment to print pi with one more decimal place: Ends here");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();

        //Print out a multiplication Table (up to 10 x 10)  formatted nicely, with each number taking up 5 spaces
        // (use %d)
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Assignment to print 10 x 10 multiplication table: Starts here");

        System.out.println();

        // -------------------------------- Assignment 2 -------------------------------------
        // Print out a multiplication Table (up to 10 x 10)  formatted nicely, with each number taking up 5 spaces
        // (use %d)

        System.out.printf("      ");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%5d", i);
        }
        System.out.println();
        System.out.printf("      ");
        for (int i = 1; i <= 10; i++) {
            System.out.print("    _");
        }

        System.out.println();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%5d" + "|", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }

        System.out.println("Assignment to print 10 x 10 multiplication table: Ends here");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();


        // -------------------------------- Assignment 3 -------------------------------------
        // Show how you can use %s to format/align text outputs, make up an example showing words lined up in a table.

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Assignment to use %s: Starts here");
        System.out.println();
        System.out.printf("the %s jumped over the %s, %d times", "Violinist", "trampoline", 2);
        System.out.println();
        System.out.printf("President's %s address is %s %s %s, %s", "house", "White", "House", "Road", "Washington");
        System.out.println();
        System.out.printf("My %s football team is the %s because I live in %s", "favorite", "New England Patriots", "Boston");

        System.out.println();
        System.out.println("Assignment to use %s: Ends here");
        System.out.println("-----------------------------------------------------------------------");

    }
}