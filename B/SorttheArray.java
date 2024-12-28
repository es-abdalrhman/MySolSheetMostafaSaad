import java.util.Scanner;

public class SorttheArray {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        boolean isup = false;
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int l = 0,r = 0;
        // to determine the number of down curves 
        for (int i = 1; i < n; i++) {
            // up
            if(arr[i-1] < arr[i]){
                isup = true;
            }
            // down
            // check if the down is at first count it 
            if(arr[i-1] > arr[i] && (isup|| i == 1)){
                count++;
                isup = false;
            }
        }
        if(count > 1){
            System.out.println("no");
            return;
        }
        isup = true;
        for (int i = 1; i < n; i++) {
            // up
            if(arr[i-1] < arr[i] && isup){
                l = i;
            }
            // down
            if(arr[i-1] > arr[i] ){
                r = i;
                isup = false;
            }
        }
        if(r==0){
            System.out.println("yes");
            System.out.println( 1 +" "+ 1 );
            return;
        }
        if(r < n-1 &&arr[l] > arr[r+1]){
            System.out.println("no");
            return;
        }
        if(r<l){
            System.out.println("yes");
            System.out.println(l +" "+ l);
            return;
        }
        // check the end place of up before the start of down 
        if(l>0 && arr[l-1] > arr[r]){
            System.out.println("no");
            return;
        }
        System.out.println("yes");
        System.out.println(++l +" "+ ++r);
    }
}
