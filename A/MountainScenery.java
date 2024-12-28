import java.util.Scanner;

public class MountainScenery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k = in.nextInt();
        in.nextLine();
        int[] arr = new int[2*n+1];
        for(int i = 1;i<= 2*n+1 ; i++){
            arr[i-1] = in.nextInt();
        }
        in.nextLine();
        int v = arr[0];
        for(int i = 1;i<2*n+1 && k>0 ; i++){
            // if old greater than new
            if(i>=2 && v > arr[i] && v-arr[i] > 1 && v-arr[i-2] > 1){
                arr[i-1] -= 1;
                k--;
            }
            v = arr[i];
        }
        for(int i = 0 ; i < 2*n+1 ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
