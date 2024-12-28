import java.util.ArrayList;
import java.util.Scanner;


public class PointsInFigures {
    public static class Rect{
        double st_x,st_y,end_x,end_y;
        Rect(double st_x ,double st_y,double end_x,double end_y){
            this.st_x = st_x;
            this.st_y=st_y;
            this.end_x = end_x;
            this.end_y = end_y;
        }
    }
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Rect> list = new ArrayList<>();
        while(true){
            String line = in.nextLine();
            String[] values = line.split(" ");
            if (values[0].equals("*"))break;
            list.add(new Rect(Double.parseDouble(values[1]),Double.parseDouble(values[2]),Double.parseDouble(values[3]),Double.parseDouble(values[4])));
            
        }
        int sz = list.size();
        int point_no = 0;
        while(true){
            double x,y;
            x = in.nextDouble();
            y = in.nextDouble();
            point_no++;
            if(x == 9999.9 && y == 9999.9) break;
            boolean isfound = false;
            for(int i = 0 ; i <sz; i++){
                // = I don't know why don't use =
                if(x > list.get(i).st_x && x < list.get(i).end_x && y < list.get(i).st_y && y > list.get(i).end_y){
                    System.out.printf("Point %d is contained in figure %d\n",point_no,i+1);
                    isfound =true;
                }
            }
            if(!isfound){
                System.out.printf("Point %d is not contained in any figure\n",point_no);
            }
        }

    }
}
