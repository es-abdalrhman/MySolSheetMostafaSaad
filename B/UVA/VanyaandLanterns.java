import java.util.Arrays;
import java.util.Scanner;

public class VanyaandLanterns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),l = in.nextInt();
        int[] arr = new int[n];
        double min = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();  
        }
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            min = Math.max(min , (arr[i]-arr[i-1])/2.0);
        }
        if(arr[0]!=0){
            if(arr[0]-min > 0) min = arr[0];
        }
        if(arr[n-1] != l){
            min = Math.max(min, (l-arr[n-1]));
        }
        System.out.printf("%.10f\n",min);
        // System.out.println(arr[0]);
    }
}
