public class IsPrime {

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




    public static void main(String [] args){
        for (int i = 2; i < 100; i++){
            boolean b = isPrime(i);
            if (b == true){
                System.out.println(i);
            }
        }
    }


}
