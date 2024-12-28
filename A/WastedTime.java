import java.util.Scanner;
import java.lang.Math;
// new information to get the displacement I should calculate 
// calculate the displacement between two nodes then add these lengths together


class WastedTime {
    public static class Point{
    int x,y;
    Point(){};
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt(),k = in.nextInt();
        in.nextLine();
        Point start = new Point(in.nextInt(), in.nextInt());
        in.nextLine();
        Point end = new Point();
        // Point[] arr = new Point[n];
        int x_dis = 0 ,y_dis = 0;
        double dis =0;
        for(int i = 0 ; i < n-1 ; i++){
            end.x = in.nextInt();
            end.y = in.nextInt();
            in.nextLine();
            x_dis = Math.abs(end.x - start.x);
            y_dis = Math.abs(end.y - start.y);
            dis += Math.sqrt(x_dis*x_dis + y_dis*y_dis);
            start.x = end.x;
            start.y = end.y;
        }
         
        double time = ((dis*k)/ 50) ;
        System.out.printf("%.9f",time);


    }
}

