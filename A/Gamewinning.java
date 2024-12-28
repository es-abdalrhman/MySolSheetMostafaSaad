import java.util.Scanner;

public class Gamewinning {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] freq = new int[n+1]; 
        int p = sc.nextInt();
        for(int i = 0 ; i < p ; i++){
            int x = sc.nextInt();
            freq[x] = 1;
        }
        int q = sc.nextInt();
        for(int i = 0 ; i < q ; i++){
            int y = sc.nextInt();
            freq[y] = 1;
        }

        for(int i = 1 ; i <= n ;i++){
            if (freq[i] != 1){
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println( "I become the guy.");
    }
}
