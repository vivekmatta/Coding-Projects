// imports
import java.util.Random;
import java.io.*;
import java.util.ArrayList;

public class WordScrambler{


    public static String scramble(String s){
        // New random object named 'rand'
        Random rand = new Random();
        // New ArrayList
        ArrayList<Character> list = new ArrayList<>();

        // Variables
        String output = "";
        int temp;


        if (s.length() > 3) {
            for (int i = 1; i < s.length() - 1; i++) {
                // System.out.println("ListSize: " + list.size());
                list.add(s.charAt(i));
            }
            output += s.charAt(0);

            while (list.size() != 0) {
                int range = list.size();
                temp = rand.nextInt(range);
                // temp = (int) (Math.random() * range);
                output += list.get(temp);
                list.remove(temp);
                // System.out.println("ListSize: " + list);
                // System.out.println("Output: " + output);
                // System.out.println("Temp: " + temp);
            }

            output += s.charAt(s.length() - 1);

        }

        else {
            output = s;
        }
        // Return output
        return output;
    }


    public static void main (String[] args)
            throws FileNotFoundException, IOException
    {
        MyFileReader3 f = null;

            // Variables
            int count = 0;

            f = new MyFileReader3("src/gatsby.txt"," (),.\"\'`:[]{};?!=-/");

            // ***Use this line instead of above if you want the program to prompt the user for a file name
            //f = new MyFileReader3(" (),.\"\'`:[]{};?!=-/");

            //This Loop reads in all the data from the file, one line at a time
            //While there is more data, get and print it
            while (f.hasNext()) {

                //read in one line from file
                String s = f.next();

                    // If variable count is less than 25, then print on same line
                    if (count < 25) {
                        System.out.print(scramble(s) + " ");
                        count++;
                    }
                    // Else, create new line and set count to 0
                    else {
                        System.out.println();
                        count = 0;
                    }

            }

    }

}
