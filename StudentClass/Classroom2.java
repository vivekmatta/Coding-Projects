import java.util.ArrayList;
import java.util.Scanner;

public class Classroom2 {

    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Student> classroom = new ArrayList<Student>();
        int count = 0;
        int numStudents = 28;
        boolean shouldRun = true;


        for (int i = 0; i < numStudents; i++) {
            classroom.add(new Student());
            count++;
        }

        while (shouldRun) {

            System.out.println("Enter 1 to display students");
            System.out.println("Enter 2 to add student");
            System.out.println("Enter 3 to delete student");
            System.out.println("Enter 4 to end");
            int ans = keyboard.nextInt();

            if (ans == 1) {
                for (int i = 0; i < classroom.size(); i++) {
                    System.out.println(i + 1 + ")  " + (classroom.get(i).toString()));
                }
            }

            else if (ans == 2) {
                classroom.add(new Student());
                count++;

            }

            else if (ans == 3) {
                System.out.println("Which number would you like to delete? ");
                int num = keyboard.nextInt();
                classroom.remove(num - 1);

            }

            else if (ans == 4){
                shouldRun = false;
                System.out.println("Thank you, come again!");
            }
        }
    }

}

