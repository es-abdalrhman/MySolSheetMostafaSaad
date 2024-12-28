import java.util.Scanner;

public class PouringRain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = in.nextInt();
        int h = in.nextInt();
        int v = in.nextInt();
        int e = in.nextInt();
        in.nextLine();
        double dh = (double)v/(Math.PI*0.25* (double)d*d);
        if(dh > e){
            System.out.println("YES");
            double n = (double)h/(dh-e);
            System.out.printf("%.12f\n",n);
        }else{
            System.out.println("NO");
        }
    }
}
