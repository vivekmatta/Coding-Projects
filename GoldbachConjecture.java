import java.util.Scanner;
public class GoldbachConjecture {
    public static void main(String[] args) {
        goldbach();
    }

    public static void goldbach() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("START: ");
        int start = keyboard.nextInt();
        System.out.println("FINISH: ");
        int finish = keyboard.nextInt();

        boolean[] list = new boolean[finish];
        list = listOfPrimes(finish);
        for (int i = start; i < finish + 2; i += 2) {
            for (int j = 0; j < finish; j++) {
                if ((list[j] == true) && (list[i - j] == true)) {
                    System.out.println((i - j) + " + " + j + " = " + i);
                    break;
                }
            }
        }
    }

    public static boolean[] listOfPrimes(int n) {
        boolean[] list = new boolean[n + 1];
        for (int i = 0; i < n; i++){
            list[i] = true;
        }

        list[0] = false;
        list[1] = false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (list[i] == true) {
                for (int j = i + i; j < n; j += i) {
                    list[j] = false;
                }
            }
        }
        return list;
    }
}
