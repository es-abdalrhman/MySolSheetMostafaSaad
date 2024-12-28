import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        char[] decoded = new char[n];
        int x = 1;
        for (int i = n-1,j=0,y = n-1; i >= 0; i--) {
            if(x == 1){
                decoded[y] = str.charAt(i);
                y--;
                x = 0;
            }else{
                decoded[j] = str.charAt(i);
                x = 1;
                j++;
            }
        }
        String ans = new String(decoded);
        System.out.println(ans);
    }
}
