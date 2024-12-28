import java.util.Scanner;

public class  CaisaandPylons{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = in.nextInt();
        }
        int energy = 0 , paid = 0;
        for (int i = 0; i < n; i++) {
            if(i+1 < n  ){
                int diff = heights[i] - heights[i+1];
                if(diff+energy > 0)
                    energy += diff;
                else{
                    paid += -1 * diff - energy;
                    energy = 0;
                }
            }
        }
        paid += heights[0];
        System.out.println(paid);
    }
}