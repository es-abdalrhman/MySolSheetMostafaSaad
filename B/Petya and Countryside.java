import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        // O(n)
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int l_index = i , r_index = i;
            int cur_height = arr[i] ,left_n_height, right_n_height ;
            // left expanding 
            for (int j = 0; j < n; j++) {
                if (l_index > 0)
                    l_index--;
                left_n_height = arr[l_index];
                if (left_n_height <= cur_height){
                    cur_height = left_n_height;
                }else{
                    l_index++;
                    break;
                }
            }
            cur_height = arr[i]; 
            // right expanding 
            for (int j = 0; j < n; j++) {
                if (r_index < n-1)
                    r_index++;
                right_n_height = arr[r_index];
                if (right_n_height <= cur_height){
                    cur_height = right_n_height;
                }else{
                    r_index --;
                    break;
                }
            }
            max = Math.max(max, r_index - l_index + 1);
        } 
        System.out.println(max);

    }
}