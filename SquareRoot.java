import java.util.Scanner;
public class SquareRoot {




    public static void SquareRootFunction() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number greater than 0 (-1 to end): ");
        double num = keyboard.nextDouble();

        if (num != -1) {
            System.out.println("Please enter a level of accuracy: ");
            double margin = keyboard.nextDouble();

            int marg = (int)(1/margin);
            int ans = (int) Math.ceil(Math.log10(marg));

            // int end = -1;
            double x = 1;
            int i = 1;

            boolean shouldRun = true;

            while(shouldRun) {
                if (((i * i) - num) >= margin || i <= num) {
                    x = (1.0 / 2.0) * (x + (num / x));
                    i++;
                } else {
                    shouldRun = false;
                }
            }

            System.out.printf("The square root of " + num + " is %." + ans + "f\n", x);
            SquareRootFunction();
        } else {
            System.out.println("Great having you!");
        }
    }

    public static void main(String[] args) {
        SquareRootFunction();
    }

}
