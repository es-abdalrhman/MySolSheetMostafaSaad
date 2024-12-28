import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KuriyamaMiraisStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n+1];
        long[] pref = new long[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
            pref[i] = arr[i] + pref[i-1];
        }
        Arrays.parallelSort(arr);
        int m = in.nextInt();
        // prefix sum for the sorted 
        long[] prefs = new long[n+1];
        for (int i = 1; i <= n; i++) {
            prefs[i] = arr[i] + prefs[i-1];
        }
        for (int i = 0; i < m; i++) {
            int ch = in.nextInt();
            int l = in.nextInt(),r = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println(pref[r]-pref[l-1]);
                    break;
                case 2:
                    System.out.println(prefs[r]- prefs[l-1]);
                   break ;
            }
        }
    }
}
