import java.util.Scanner;

public class ShaassOskols {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int []arr = new int[len];
        for (int i = 0 ; i < len ; i++){
            arr[i] = sc.nextInt();
        }
        int op = sc.nextInt();
        for (int i = 0 ; i < op ; i ++){
            int x = sc.nextInt(), y =sc.nextInt();
            if ((x-2) >= 0){
                arr[x - 2] += y-1;
            }
            if (x < len){
                arr[x] += arr[x-1] - y; 
            }
            arr[x-1] = 0;
        }
        for (int i = 0 ; i < len ;i++ ){
            System.out.println(arr[i]);
        }
    }
}
