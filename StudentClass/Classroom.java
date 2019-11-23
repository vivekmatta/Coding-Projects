import java.util.Scanner;

public class Classroom {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int count = 0;
        Student[] list = new Student[28];
        int students = 20;

        for (int i = 0; i < students; i++) {
            list[i] = new Student();
            count++;
        }

        // System.out.println(count);

        boolean shouldRun = true;

        while (shouldRun) {

            System.out.println("Enter 1 to display students");
            System.out.println("Enter 2 to add student");
            System.out.println("Enter 3 to delete student");
            System.out.println("Enter 4 to end");
            int ans = keyboard.nextInt();

            if (ans == 1) {
                for (int i = 0; i < students; i++) {
                    System.out.println(i + 1 + ")  " + list[i].toString());
                }
            }

            else if (ans == 2) {
                list[students] = new Student();
                students++;

            }

            else if (ans == 3) {
                System.out.println("Which number would you like to delete? ");
                int num = keyboard.nextInt();

                for (int i = num - 1; i < students - 1; i++) {
                    list[i] = list[i + 1];
                }

                students--;

            }

            else if (ans == 4){
                shouldRun = false;
                System.out.println("Thank you come again!");
            }
        }
    }
}



