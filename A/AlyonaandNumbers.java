import java.util.Scanner;

public class AlyonaandNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(),m = in.nextLong();
        in.nextLine();
        int count = 0;
        // O(n*m) time limit
        // for(int i = 1;i <= n;i++ ){
        //     for(int j = 1 ; j <= m;j ++){
        //         int x = j + i;
        //         if(x%5 == 0){
        //             count++;
        //         }
        //     }
        // }
        

        // O(n*m/5) time limit
    if(n < 5 || m < 5){
        long min = Math.min(n, m);
        long max = Math.max(n, m);
        for(int i = 1 ;i <= min; i++){
            long l = 0;
            for(int k = 1; l<=max;k++){
                long x = 5*k - i;
                if(x > 0 &&x <= max ){
                    count++;
                }
                l = x;
            }
        }
        System.out.println(count);

    }else{
        // int min = Math.min(n, m);
        // int max = Math.max(n, m);
        
        long x = m/5 * n;
        x += (m%5) * (n/5);
        // the last 5 
        long i = n%5, j =  5 - i;
        while((i+j) >= 5 && i > 0 && j <= m%5  ){
            x++ ;
            i--;
            j++;
        }
        // x += n%5  ; 

        System.out.println(x);
    }
    }
}
