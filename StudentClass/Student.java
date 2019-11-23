import java.util.Random;
public class Student {
    //Attributes
    private String firstName;
    private String lastName;

    private int id;
    private int yog;
    private int hr;
    /* id: (six digit number > 99,999):  int
    yog: (valid: 2000 - 2030)  int
    hr: (valid: 100-999)  int
     */

    /* ------------------------------------------------ */

    // Constructor 1
    Random r = new Random();
    public Student() {

        // Letters of Alphabet for scrambling
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // First Name
        int upperLetter = 6;
        int lowerLetter = 3;
        int firstNameLength = r.nextInt((upperLetter - lowerLetter)) + lowerLetter;
        int count = 0;

        // Creates scrambled First Name
        while (count < firstNameLength) {
            if (count == 0) {
                int randomLetter = r.nextInt(26);
                firstName = Character.toString(upperCase.charAt(randomLetter));

            }
            int randomLetter = r.nextInt(26);
            firstName += Character.toString(lowerCase.charAt(randomLetter));
            count ++;
        }
        System.out.println("First name: " + firstName);

        // Last Name
        int upperLetterLower = 8;
        int lowerLetterLower = 4;
        int lastNameLength = r.nextInt((upperLetterLower - lowerLetterLower)) + lowerLetterLower;
        int counter = 0;

        // Creates scrambled Last Name
        while (counter < lastNameLength) {
            if (counter == 0) {
                int randomLetter = r.nextInt(26);
                lastName = Character.toString(upperCase.charAt(randomLetter));

            }
            int randomLetter = r.nextInt(26);
            lastName += Character.toString(lowerCase.charAt(randomLetter));
            counter ++;
        }
        System.out.println("Last name: " + lastName);

        // Creates random ID
        int upperID = 999999;
        int lowerID = 100000;
        id =  r.nextInt((upperID - lowerID)) + lowerID;
        System.out.println("ID: " + id);

        // Creates random YOG
        int upper = 2030;
        int lower = 2000;
        yog = r.nextInt((upper - lower)) + lower;
        System.out.println("YOG: " + yog);

        // Creates random HR
        int upperHR = 999;
        int lowerHR = 100;
        hr = r.nextInt((upperHR - lowerHR)) + lowerHR;
        System.out.println("HR: " + hr);

    }

    /* ------------------------------------------------ */

    // Constructor 2
    public Student(String first, String last) {
        firstName = first;
        System.out.println("First Name: " + firstName);
        lastName = last;
        System.out.println("Last Name: " + lastName);

        // Creates random ID
        int upperID = 999999;
        int lowerID = 100000;
        id =  r.nextInt((upperID - lowerID)) + lowerID;
        System.out.println("ID: " + id);

        // Creates random YOG
        int upper = 2030;
        int lower = 2000;
        yog = r.nextInt((upper - lower)) + lower;
        System.out.println("YOG: " + yog);

        // Creates random HR
        int upperHR = 999;
        int lowerHR = 100;
        hr = r.nextInt((upperHR - lowerHR)) + lowerHR;
        System.out.println("HR: " + hr);
    }

    /* ------------------------------------------------ */

    // Constructor 3
    public Student(String first, String last, int myID, int myYog, int myHr) {
        // Sets the variables
        firstName = first;
        lastName = last;
        id = myID;
        yog = myYog;
        hr = myHr;
        // Prints them out
        System.out.println("First Name: " + first);
        System.out.println("Last Name: " + last);
        System.out.println("ID: " + id);
        System.out.println("YOG: " + yog);
        System.out.println("HR: " + hr);


    }
    /* ------------------------------------------------ */

    // Getter and Setter Methods

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return id;
    }

    public int getYog() {
        return yog;
    }

    public int getHr() {
        return hr;
    }

    public void setFirstName(String s) {
        firstName = s;
    }

    public void setLastName(String s) {
        lastName = s;
    }

    public void setId(int s) {
        id = s;
    }

    public void setYog(int s) {
        yog = s;
    }

    public void setHr(int s) {
        hr = s;
    }
    /* ------------------------------------------------ */

    // Sets random name
    private String randName(int min, int max) {
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int upperLetter = max;
        int lowerLetter = min;
        int firstNameLength = r.nextInt((upperLetter - lowerLetter)) + lowerLetter;
        int count = 0;


        while (count < firstNameLength) {
            if (count == 0) {
                int randomLetter = r.nextInt(26);
                firstName = Character.toString(upperCase.charAt(randomLetter));

            }
            int randomLetter = r.nextInt(26);
            firstName += Character.toString(lowerCase.charAt(randomLetter));
            count ++;
        }
        System.out.println("First name: " + firstName);

        // Last Name
        int upperLetterLower = 6;
        int lowerLetterLower = 3;
        int lastNameLength = r.nextInt((upperLetter - lowerLetter)) + lowerLetter;
        int counter = 0;


        while (count < lastNameLength) {
            if (count == 0) {
                int randomLetter = r.nextInt(26);
                lastName = Character.toString(upperCase.charAt(randomLetter));

            }
            int randomLetter = r.nextInt(26);
            lastName += Character.toString(lowerCase.charAt(randomLetter));
            count ++;
        }
        System.out.println("Last name: " + lastName);
        return (firstName + " " + lastName);
    }

    /* ------------------------------------------------ */

    // Returns all variables in one string
    public String toString() {
        String first = getFirstName();
        String last = getLastName();
        int id = getID();
        int yog = getYog();
        int hr = getHr();
        return ("First Name: " + first + " Last Name: " + last + " ID: " + id + " YOG: " + yog + " HR: " + hr);
    }

}
