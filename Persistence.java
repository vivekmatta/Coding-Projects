import java.util.Scanner;

class Persistence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter a number (-1 to end):  ");
        int userNum = keyboard.nextInt();

        while (userNum != -1){
            int persistence = 0;
            int num = 1;
            String number = "" + userNum;
            System.out.print(userNum);

            while(number.length() != 1){
                for(int i = 0; i < number.length(); i++)
                    num = num * Integer.parseInt(number.substring(i, i + 1));
                persistence++;
                System.out.print(" --> " + num);
                number = "" + num;
                num = 1;
            }

            System.out.println();
            System.out.println("Persistence: " + persistence);
            System.out.println("Please enter a number (-1 to end):  ");
            userNum = keyboard.nextInt();
            System.out.println("Hi there");
        }

        System.out.println("Done");
    }
}