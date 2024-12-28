import java.util.Scanner;

public class Presents {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 1 ; i <= n ;i ++){
            int give = sc.nextInt();
            arr[give - 1] = i ;
        }
        for (int i = 0 ; i < n ; i++ ){
            System.out.print(arr[i]);
            if (i != n-1){
                System.out.print(" ");
            }
        }
    }
}
