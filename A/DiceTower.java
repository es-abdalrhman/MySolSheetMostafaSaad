import java.util.Scanner;

public class DiceTower {
    // class Dice{
    //     int up ,down,rr,ll,rl,lr;
    //     Dice(int up,int down,int rr,int ll,int rl,int lr){
    //         this.up 
    //     }
    // }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int x = in.nextInt();
        // int[] ud = new int[2];
        int[] sides = new int[4];
        in.nextLine();
        boolean candecide = true;
        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < 2 ;j++){
                sides[j] = in.nextInt();
            }
            int l = 0;
            for(int j = 2 ; j < 4 ;j++){
                sides[j] = 7-sides[l];
                l++;
            }
              for(int j = 0 ; j < 4 ;j++){
                if(x == sides[j]){
                    candecide = false;
                }
            }   
            in.nextLine();
        }
        if(candecide){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
