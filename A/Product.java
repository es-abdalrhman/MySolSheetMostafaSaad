import java.math.BigInteger;
import java.util.Scanner;
// in this problem I need to make the mulitplication rule using strings
// there is class called big integer 
 class Product {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        // to check if there is other inputs coming or not
        while(sc.hasNext()){
            BigInteger x = sc.nextBigInteger(); 
            BigInteger y = sc.nextBigInteger(); 
            BigInteger z = x.multiply(y);
            System.out.println(z);
        }
    }
}
