import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n+1];
        int[] pref = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
            pref[i] = arr[i] + pref[i-1];
        }
        int min = 1000000000;
        int index = 0;
        for (int i = k; i <= n ; i++) {
            int temp = pref[i] - pref[i-k];
            if(min > temp){
                min = temp;
                index = i-k+1 ;
            }
        }
        System.out.println(index);
    }
}
