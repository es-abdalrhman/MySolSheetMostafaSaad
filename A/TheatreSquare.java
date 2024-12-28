import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        // this is problem
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), m =sc.nextLong(),a = sc.nextLong();
        sc.nextLine();
        long x = n/a;
        long y = m/a;
        
        if(n%a>0L){
            x++;
        }
        if(m%a>0L){
            y++;
        }
        if (x*y ==0L) {System.out.println(1);return;}
        System.out.println((x*y));

    }
}
