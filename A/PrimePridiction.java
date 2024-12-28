import java.util.Scanner;

public class PrimePridiction {
    static boolean isprime (int p){
        // boolean isprime = true;
        for (int i = 2;i < p;i++ ){
            if(p%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        int n = in.nextInt(),m = in.nextInt();
        if(n == 2){
            if(m== 3){
                System.out.println("YES");
                return;
            }else{
                System.out.println("NO");
                return;
            }
        }
        int x = n;
        // int i = 2;
        for(int i = n+2 ;i < m;i+=2){
            if(isprime(i)){
                System.out.println("NO");
                return;
            }
        }
        if(!isprime(m)){
            System.out.println("NO");
            return;
        }

        
        System.out.println("YES");
    }
}
