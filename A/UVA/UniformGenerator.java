import java.util.Scanner;

public class UniformGenerator {
    // there is another solution using GCD O(1)
    // this solution is not so bad but may need  function O(mod)
    static int seed (int x , int step , int mod , Boolean[] arr ){
        
        arr[x] = true;
        x = (x+step)%mod;
        
        return x;
    }
    // euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        while (sc.hasNext()) {
            int step = sc.nextInt();
            int mod = sc.nextInt();
            // if (gcd(step, mod) == 1){
            //     System.out.println("Good Choice");
            // }else{
            //     System.out.println("Bad Choice");
            // }
            Boolean[] arr = new Boolean[mod];
            for (int i = 0 ; i < mod ;i++)
                arr[i] = false;
            int x = seed(0,step,mod,arr);
            for (int i = 0 ; i < mod ;i++)
                x = seed(x,step,mod,arr);
                
            boolean isbad = false;
            // need to see how right-justified is done need to handle this case
            
            System.out.printf("%10d%10d",step,mod);
            for (int i = 0 ; i < mod ; i ++){
                if (!arr[i]){
                    System.out.printf("    %s","Bad Choice");
                    isbad = true;
                    break;
                }
            }
            if (!isbad){
                System.out.printf("    %s","Good Choice");
            }
            System.out.println();
            System.out.println();

        }
    }
}
    