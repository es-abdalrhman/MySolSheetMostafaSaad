import java.util.Arrays;
import java.util.Scanner;
// so difficult question
// I really didn't under stand the question I didn't use the c value
public class AGGRCOW {
    static int n,c;
    static int[] arr ;
    static boolean can(int dist){
        int count = 1;
        int current = arr[0];
        // find if the num of cows can be put in this line using this distance 
        for (int i = 0; i < n; i++) {
            if(arr[i]-current >= dist){
                count++;
                current = arr[i];
            }
        }
        return count >= c;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();in.nextLine();
        while(t-- > 0){
            n = in.nextInt();c = in.nextInt();
            // in.nextLine();
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                // in.nextLine();
            }
            Arrays.sort(arr, 0, n);
            int st = 0,end = 1000000000 ,mid,ans = 0; // distance find the value of distance which is the largest value
            while(st <= end){
                mid = st + (end-st)/2;
                if(can(mid)){
                    ans = mid;
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
            System.out.println(ans);
        }
        in.close();
    }
}
