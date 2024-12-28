import java.util.Scanner;

public class BearandFindingCriminals{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = in.nextInt();
        a--;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        } 
        int p1 = a ,p2 = a ;
        int count = 0;
        if (arr[a] == 1)
            count ++;
        for (int i = 0; i < n; i++) {
            p1--;
            p2++;
            if(p1 < 0 && p2 < n){
                if (arr[p2] == 1){
                    count++;
                }
            }else if (p1 >= 0 && p2 >= n){
                if (arr[p1] == 1 ){
                    count++;
                }
            }else if (p1 < 0 && p2 >= n) {
                break;
            }else {
                if (arr[p1] == 1 && arr[p1] == arr[p2] ){
                    count+=2;
                }
            }
        }
        System.out.println(count);
    }
    
}