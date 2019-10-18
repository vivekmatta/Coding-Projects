// Complete the fnMultiply function using a new method of multiplication


public class fnMultiply {
    public static void main (String[] args) {
        System.out.println (fnMultiply (23,55));
        System.out.println ("Correct Answer: " + (23 * 55));
    }


    // This function takes two integers a and b.  It divides a and if the resulting operand is odd, it multiplies
    // by 2.  It does that until the operand is 1.  Once the operand reaches 1, it adds up all the b values and
    // returns that total.
    public static int fnMultiply (int a, int b) {
        int total = 0;
        while (a >= 1) {
            System.out.println("------------------------------------");
            System.out.print("A value is --> " + a + " ::");
            if (a % 2 != 0) {
                total += b;
            }
            System.out.println(" B value is --> " + b);
            a /= 2;
            b *= 2;
        }
        System.out.println("------------------------------------");
        System.out.print("Answer when using the function 'fnMultiply': ");
        return total;
    }
}

