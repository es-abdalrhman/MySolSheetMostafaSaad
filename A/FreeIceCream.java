import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long kids = 0L ,ice = 0L;
        int n = sc.nextInt();
        ice = sc.nextLong();
        sc.nextLine();
        for (int i = 0 ; i < n ; i++){
            String s = sc.nextLine();
            
            String []str = s.split(" ");
            Character op = str[0].charAt(0);
            Long d =  Long.parseLong(str[1]);
            if (op == '+'){
                ice += d ;
            }
            if (op == '-'){
                if (ice >= d){
                    ice -= d;
                }else{
                    kids ++;
                }
            }
        }
        System.out.println(ice + " " + kids );
    }
}
