
import java.util.Scanner;

public class GoodNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k = in.nextInt();
        in.nextLine();
        long[] a = new long[n];
        int[] freq = new int[k+1];
        int count = 0;
        for(int i = 0 ; i < n; i++ ){
            a[i] = in.nextLong();
            in.nextLine();
            while(a[i] != 0){
                long d = a[i]%10;
                if(d < k+1)
                    freq[(int)d]++;
                a[i] /=10;
            }
            boolean isnotgood = false;
            for(int j = 0;j < k+1 ;j++ ){
                if(freq[j] == 0){
                    isnotgood = true;
                    break;
                }
            }
            if(!isnotgood){
                count++;
            }
            for(int j = 0;j < k+1 ;j++ ){
                freq[j] = 0;
            }
        }
        System.out.println(count);

    }
}
