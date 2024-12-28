import java.math.BigInteger;
import java.util.Scanner;

public class Olesya_And_Rodion {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();int t = sc.nextInt();
        if (n == 1 && t == 10){System.out.println(-1);return;}
        BigInteger x =  BigInteger.valueOf(1L);
        while(n-- > 0){
            x = x.multiply(BigInteger.valueOf(10L));
        }
        x = x.divide(BigInteger.valueOf(10));
        if (t == 10){
            System.out.println(x);
            return;
        }
        x = x.multiply(BigInteger.valueOf(t));
        System.out.println(x);
    }
}
