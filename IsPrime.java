public class IsPrime {

    // Finds all prime numbers less than 100.
    public static void main(String [] args){
        for (int i = 2; i < 100; i++){
            boolean b = isPrime(i);
            if (b == true){
                System.out.println(i);
            }
        }
    }

    // Function that checks through every number from 0 - 99 and sees if it is a prime number or not.
    public static boolean isPrime(int x){
        int count = 0;
        for (int i = 2; i < x; i++){
            if (x % i == 0){
                count++;
            }
        if (count > 0){
            return false;
        }
        }
        return true;
    }







}
