import java.util.Scanner;

public class OverlappingRectangles {
    public static class Rect{
        int xll,yll,xur,yur;
        Rect(int xll ,int yll,int xur,int yur){
            this.xll = xll;
            this.yll=yll;
            this.xur = xur;
            this.yur = yur;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t>0){
            Rect r1 = new Rect(in.nextInt(), in.nextInt(),in.nextInt(), in.nextInt());
            in.nextLine();
            Rect r2 = new Rect(in.nextInt(), in.nextInt(),in.nextInt(), in.nextInt());
            in.nextLine();
            Rect result = new Rect(Math.max(r1.xll, r2.xll)
                ,Math.max(r1.yll, r2.yll) , Math.min(r1.xur, r2.xur), Math.min(r1.yur, r2.yur));

            if (result.xll >= Math.min(r1.xur, r2.xur) || result.yll >= Math.min(r1.yur, r2.yur) || result.xur <= Math.max(r1.xll, r2.xll) || result.yur <= Math.max(r1.yll, r2.yll) ){
                System.out.println("No Overlap");
            }else{
                System.out.println(result.xll+" "+result.yll+" "+result.xur+" "+result.yur);
            }
            if (t != 1 )
                System.out.println();
            t--;
        }
    }
}
