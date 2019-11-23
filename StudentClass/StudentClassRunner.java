public class StudentClassRunner {
    public static void main (String [] args) {
        System.out.println("This is with no parameters: ");
        Student s = new Student();
        System.out.println();
        System.out.println("This is with two parameters: ");
        Student n = new Student("Bobby", "Brown");
        System.out.println();
        System.out.println("This is with only parameters: ");
        Student r = new Student("Bill", "Jackson", 455678, 2012, 150);
        System.out.println();

        /*
        // Getter and Setter Methods in use (remove comments):
        r.getFirstName();
        r.getLastName();
        r.getID();
        r.getYog();
        r.getHr();
         */
        String random = s.toString();

        System.out.println("Using the 'toString' function: ");
        System.out.println(random);
    }

}
