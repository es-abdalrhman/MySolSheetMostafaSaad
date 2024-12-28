import java.util.Scanner;

public class BigMod {
    // this is a function used in pow moduler for large numbers
    public static long powModuler (long B,long P , long M){
        
        long res = 1;
        // case power == 0 -> 1
        if (P == 0)
            return 1;
        // if the base divisable by M then module return 0 and as B*B*B mod M == (((B mod M)*(B mod M)) mod m *(B mod M)) mod M 
        B = B%M ;
        if (B == 0){
            return 0;
        }
        while (P>0){
            if (P%2 ==1){
                res = ((res) * (B))%M;
                // P --;
            }

            B =((B%M)*(B%M))%M;
            P = P>>1; // the last change P = P / 2;
            
        }
        return res ;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
         while(true){
        long B = in.nextLong();
        in.nextLine();
        long P = in.nextLong();
        in.nextLine();
        long M = in.nextLong();
        in.nextLine();
        if (M <= 0 ) continue;
        if (P == 0 && B == 0) continue;
        System.out.println(powModuler(B, P, M));

        }
    } catch (Exception e ){

    }finally {
        in.close();
    }

    }
}