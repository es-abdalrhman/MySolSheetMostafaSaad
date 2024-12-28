import java.util.Scanner;
// there is a better solution
public class DieRoll {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt() , w = sc.nextInt();
        String []probalities = {"1/6" , "1/3" , "1/2", "2/3", "5/6" , "1/1"};
        if (y < w ){
            y = w;
        }
        // switch(y){
        //     case 6 : System.out.println("1/6");break;
        //     case 5 : System.out.println("1/3");break;
        //     case 4 : System.out.println("1/2");break;
        //     case 3 : System.out.println("2/3");break;
        //     case 2 : System.out.println("5/6");break;
        //     case 1 : System.out.println("1/1");break;
        // }
        System.out.println(probalities[6-y]);
    }
}
