import java.util.Scanner;

public class RegularPolygon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            double a = in.nextDouble();
            in.nextLine();
            double n = 360/(180-a);
            if(n != Math.floor(n)){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

        }
    }
}
