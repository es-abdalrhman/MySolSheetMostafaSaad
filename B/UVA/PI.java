import java.util.Scanner;
import java.math.*;

public class PI {
    static int  gcd (int a, int b){
        if (b == 0)
            return a;

        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            if(n == 0 )break;
            int[] arr = new int[n];
            for (int i = 0; i <n; i++) {
                arr[i] = in.nextInt();
            }
            int allPairs = n * (n-1) /2;
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if(gcd(arr[i],arr[j]) == 1){
                        count ++;
                    }
                }
            }
            if (count == 0){
                System.out.println("No estimate for this data set.");
                continue;
            }
            double pi = Math.sqrt(6.0/((double)(count)/(double)(allPairs)));
            System.out.printf("%6f\n",pi);
        }
    }
}
