// You are to write a program that contains a function called boolean isPerfect(int n) that takes an
// integer n and returns true if n is perfect and false otherwise. Your program should output all the perfect
// numbers between 1 and 100,000.

public class PerfectNumbers {
    // Goes through every number to 100,000 and finds the perfect numbers
    public static void main(String[] args) {
        for (int j = 1; j <= 100000; j++) {
            if (isPerfect(j)) {
                System.out.println(j + " is a perfect number");
            }
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            return true;
        }
        else {
            return false;
        }
    }
}

