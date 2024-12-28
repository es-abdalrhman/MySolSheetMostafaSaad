import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        // the coming two commnets wrong understanding of the problem need to go linear as we need to check the two checks inside while
        // this problem could be solved in linear time but I thing it is better to be solved as binary search for n (number of times the price changes) can be solve in O(1) as equation
        // 150 + 50 * n >= 1000 - 100 * n => 150*n >= 850 
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(),b = in.nextInt() , c = in.nextInt() , d = in.nextInt();
        // int n = ( int )Math.ceil ((double) (c - a) / (double)(b+d));
        // System.out.println(a+b*n);
        if(a>=c){System.out.println(a);
        return;}
        while (a < c){
            if(a+b >= c ){
                System.out.println(c);
                break;
            }
            a += b;
            if(c-d <= a){
                System.out.println(a);
                break;
            } 
            c -= d;
        }
        
    }
}
