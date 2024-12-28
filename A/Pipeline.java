import java.util.Scanner;

public class Pipeline {
    static long alg_series(long st,long mid){
        long result = (st+1)*st/2 - (mid+1)*mid/2 + mid;
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong() ,k = in.nextLong();
        long result = k*(k+1)/2 - (k-1);
        long ans = 1 ;
        if(result >= n){
            long x = n-k;
            int count = 1;
            // this solution is O(k) time limit 
            if(x == 0){System.out.println(count);return;}
            else if (x < 0){
                System.out.println(0);return ;
            }
            /*for(long i=  k - 2 ; i >= 0;i--){
                x -= i;
                count ++;
                if(x <= 0){System.out.println(count);return;}
            }*/
            long st = k-2 ,end = 1; // we are searching in this series of numbers to get the min num of this numbers when sum get result greater than or equal to n
            while(st>=end){
                long mid = end + (st-end)/2;
                if(alg_series((k-2), mid) >= x){
                    ans = mid;
                    end = mid+1;
                }else{
                    // ans = mid;
                    st = mid-1;
                }
            }

        }else{
            System.out.println(-1);
            return;
        }
        System.out.println((1+(k-1)- ans));
    }
}
