import java.math.BigInteger;
import java.util.Scanner;

public class Combinations {
    public static BigInteger comb(int n ,int m ){
        if (m > n/2){
            m = n - m;
        }
        BigInteger res = BigInteger.ONE;
        int count = 0; 
        
        for (int i = 1; i <= m; i++) {
            res = res.multiply(BigInteger.valueOf(n));
            n --;
            count++;
        }
        if (m > 0 ){
            for (int j = 1; j <= count; j++) {
                res = res.divide( BigInteger.valueOf(m));
                m --;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int n = in.nextInt();
            // in.nextLine();
            int m = in.nextInt();
            in.nextLine();
            if(m == 0 && n == 0 ) return ;
            System.out.printf("%d things taken %d at a time is ",n,m);
            if (m == n || m == 0){
                System.out.print(1);
            }else{
                try{
                System.out.print(comb(n, m));
                }catch(Exception e){

                }
            }

            System.out.println(" exactly.");
        }
    }
}


