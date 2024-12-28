import java.util.Scanner;

public class Counterexample {
    public static long gcd(long a,long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long l =sc.nextLong();
        long r =sc.nextLong();
        
        for(long a = l ; a <= r;a++)
        {
            for(long b = a+1; b <= r ;b++ )
            {
            
                for(long c = b+1; c <= r; c++)
                {
                    if(gcd(c, b) == 1L && gcd(c, a) != 1L){
                    System.out.println(a + " " + b + " " + c);
                    return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}

// more creative solution 
// import java.util.*;
// as the two consecutive even numbers gcd == 2 and the odd number between them gcd with == 1 if(l-r+1 < 3)
public class Main {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      long l=in.nextLong(),r=in.nextLong();
      if(l%2!=0)
          l++;
      if(Math.abs(l-r)<2)
            System.out.println("-1");
      else 
            System.out.println(l+" "+(l+1)+" "+(l+2));
    }
}
