public class SieveOfEratosthenes {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int n = 1000000;
        boolean[] list = new boolean[n + 1];
        for (int i = 0; i < n; i++){
            list[i] = true;
        }
        list[0] = false;
        list[1] = false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (list[i] == true){
                for (int j = i + i; j < n; j += i) {
                    list[j] = false;
                }
            }
        }
        int x = n - 1;
        while(!list[x]){
            x--;
        }
        System.out.println(x);

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println(duration/1000000.0);//msec
        System.out.println("Seconds: " + (duration/1000000000.0)); //seconds
    }
}

