import java.util.Scanner;
import java.lang.String;

class UnfilledBox {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("First int: ");
        int L = keyboard.nextInt();

        System.out.println("Second Int: ");
        int H = keyboard.nextInt();

        if ((L > 0 && H > 0) && (L < 21) && (H < 21)) {
            for(int i = 0; i < H; i++){
                for (int j = 0; j < L; j++){
                    if ((i == 0 || i == H - 1) || (j == 0 || j == L - 1))
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();

            }
            return;
        }
        System.out.println("Bad input. Please enter values between 1 - 20.");

    }
}
