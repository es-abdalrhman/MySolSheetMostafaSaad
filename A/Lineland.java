import java.util.Scanner;

public class Lineland {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ;i < n ;i ++ ){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int min;
        for (int i = 0 ; i < n ; i++){
            max = Math.abs(arr[i] - arr[n-1]);
            if (Math.abs(arr[i] - arr[0]) > max){
                max = Math.abs(arr[i] - arr[0]);
            } 
            if ( i == 0){
                min = Math.abs(arr[i] - arr[1]);
                System.out.println(min + " " + max);
                continue;
            }

            min = Math.abs(arr[i] - arr[i-1]);
            if (i != n-1 && min > Math.abs(arr[i] - arr[i+1]))
            {
                min =Math.abs(arr[i] - arr[i+1]);
            }
            System.out.println(min + " " + max);
        }
    }
}
