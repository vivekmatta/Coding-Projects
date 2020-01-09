public class PancakesRunner {

    public static void main (String [] args) {
        Pancakes p = new Pancakes();



        // Example 1
        int y = p.minutesNeeded(0, 4);
        System.out.println("Example 1: Condition 1");
        System.out.println("It takes " + y + " minutes");
        System.out.println();

        // Example 2
        int z = p.minutesNeeded(3, 3);
        System.out.println("Example 2: Condition 2");
        System.out.println("It takes " + z + " minutes");
        System.out.println();

        // Example 3
        int x = p.minutesNeeded(6, 4);
        System.out.println("Example 3: Condition 3");
        System.out.println("It takes " + x + " minutes");
        System.out.println();
    }


}
