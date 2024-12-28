import java.util.Scanner;
// this problem isn't good the language isn't easy at all
public class Buy_a_Shovel {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        for (int i = 1 ; i <= 10 ; i++ ){
            int temp = k * i;
            if (temp % 10 == 0 ||temp % 10 == r ){
                System.out.println(i);
                return;
            }
        }
    }
}
