import java.util.Scanner;
// the story is we each day can add one new bactria
// we don't need to add new one if the remaining bactria is even as in the next day if I have this half number I should wait for the next day only to reach this number
// but if the remaining is odd number we can't get this number at the next day of the half of it so when we see odd number we add new bactria 

public class RaisingBacteria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // int bac = 1;
        int x = 1;
        // when odd factor appears that mean in the future multiplying by 2 won't work so when we face odd we add new bactria to make sure that at the end if still there bactria we add one bactrium in the last day
        while(n > 1){
            if(n % 2 == 1){
                x++;
            }
            n /= 2;
        }
        System.out.println(x);
    }
}
