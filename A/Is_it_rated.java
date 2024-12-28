import java.util.Scanner;

public class Is_it_rated {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();sc.nextLine();
        int[] before = new int[n];
        int[] after = new int[n];
        int prev = 0;
        for (int i = 0 ; i< n;i++){
            before[i] = sc.nextInt();
            after[i] = sc.nextInt();
            sc.nextLine();
        }
        for(int i = 0 ; i< n;i++){
            if(before[i] != after[i]){
                System.out.println("rated");
                return;
            }
        }
        for (int i = 0 ; i < n;i++){
            if(prev != 0 && prev < before[i]){
                System.out.println("unrated");
                return ;
            }
            prev = before[i];
        }
        System.out.println("maybe");
    }
}
