import java.util.ArrayList;
import java.util.Scanner;
public class TaxiTaxi {
    public static void main (String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number less than 1,000,000: ");
        int ans = keyboard.nextInt();
        checker(ans);
        // System.out.println(17 % 1);
    }

    public static void checker(int n) {
        int total = 3;
        double cube1 = 0;
        double cube2 = 0;
        int counter = 0;
        int counter2 = 0;
        ArrayList<Double> list = new ArrayList<Double>();
        String[] header = new String[] {"Ramanujan Number ", "First Cube ", "Second Cube ", "First Root ", "Second Root ", "Order "};

        for (int a = 0; a < header.length; a++) {
            System.out.printf("%-30s", header[a]);
        }
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        while (total < n) {

            for (int i = 0; i < Math.cbrt(total); i++) {
                for (int j = 0; j < i; j++) {
                    if (Math.pow(i, 3) + Math.pow(j, 3) == total) {

                        if ((i % 1 == 0) && (j % 1 == 0)) {
                            cube1 = Math.pow(i, 3);
                            cube2 = Math.pow(j, 3);
                            list.add(cube1);
                            list.add(cube2);
                            counter++;
                            if (counter == 2) {

                                counter2++;
                                System.out.printf("%-30d %-30.0f %-30.0f %-30.0f %-30.0f %-30d", total, list.get(0), list.get(1), Math.cbrt(list.get(0)), Math.cbrt(list.get(1)), counter2);
                                System.out.println();
                                System.out.printf("%-30s %-30.0f %-30.0f %-30.0f %-30.0f %-30.0s", "", list.get(2), list.get(3), Math.cbrt(list.get(2)), Math.cbrt(list.get(3)), "");
                                System.out.println();
                                counter = 0;
                                list.clear();
                            }
                        }
                    }
                }
            }
            total++;
            counter = 0;
            list.clear();
        }




    }
}
