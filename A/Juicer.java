import java.util.Scanner;

public class Juicer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0 ;
        int waste = 0 ;
        int n = sc.nextInt(), b =sc.nextInt(), d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++){
            if (arr[i] <= b){
                waste += arr[i];
            }
            if (waste > d){
                count ++;
                waste = 0;
            }
        }
        System.out.println(count);
    }
}
