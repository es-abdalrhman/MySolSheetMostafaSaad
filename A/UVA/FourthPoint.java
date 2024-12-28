import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Exception;
public class FourthPoint {
    public static void main(String[] args) {
        // Exception();
        try {System.setIn(new FileInputStream("in.txt"));
        System.setOut(new PrintStream(new FileOutputStream("out.txt")));}
        catch(FileNotFoundException e ){

        }
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()){
            if (!in.hasNextDouble()) break;
            double x1 = in.nextDouble(),y1 = in.nextDouble();
            double x2 = in.nextDouble(),y2 = in.nextDouble();
            double x3 = in.nextDouble(),y3 = in.nextDouble();
            double x4 = in.nextDouble(),y4 = in.nextDouble();
            double x =0 , y = 0;
            // the repetation isn't useless as 
            if(x2 == x3 && y2 ==y3 )
                { x = x1-x2+x4;y = y1-y2+y4;}
            else if ( x1==x3 && y1 == y3)
                {x = x4-x1+x2 ; y = y4-y1+y2;}
            else if(x1 == x2 && y1 == y2)
                { x = x1-x3+x4;y = y1-y3+y4;}
            else if ((x1==x4 && y1 == y4)  )
                { x = x3-x1+x2;y = y3-y1+y2;}
            else {
                x = x1-x2+x3;y = y1-y2+y3;
            }
            // if(x1==x3 && y1==y3){
            //     x=x2+x4-x3;
            //     y=y2+y4-y3;
            // }else if(x1==x4 && y1==y4){
            //     x=x2+x3-x4;
            //     y=y2+y3-y4;
            // }else if(x2==x3 && y2==y3){
            //     x=x1+x4-x3;
            //     y=y1+y4-y3;
            // }else{
            //     x=x1+x3-x4;
            //     y=y1+y3-y4;
            // }
            
            System.out.printf("%.3f %.3f\n",x,y);
        }
    }
}
