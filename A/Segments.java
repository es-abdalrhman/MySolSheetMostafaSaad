import java.util.Scanner;

public class Segments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),k = in.nextInt();
        int x = 0;
        for(int i = 0 ; i < n ; i++){
            int l = in.nextInt(),r = in.nextInt();
            x += r-l+1;
        }
        if(x%k == 0){System.out.println(0);return;}
        System.out.println(k-x%k);
    }
}
