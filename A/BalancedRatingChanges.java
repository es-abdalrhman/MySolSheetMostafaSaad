import java.util.Scanner;

public class BalancedRatingChanges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        boolean isfloor = true;
        int [] result = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            int c = in.nextInt();
            in.nextLine();
            // System.out.println(c%2);
            // strange notice -ve numbers result in -ve remainders !
            if(c%2 == 1 || c%2 == -1){
                if(isfloor){
                    result[i] = (c-1)/2;
                    System.out.println((c-1)/2);
                    isfloor = !isfloor;
                }else{
                    
                    // if(c > 0)
                    //     System.out.println((c+1)/2);
                    // else 
                    //     System.out.println((c-1)/2);
                    result[i] = (c+1)/2 ;
                    System.out.println(result[i]);
                    isfloor = !isfloor;
                }
            }else{
                result[i] = c/2 ;
                System.out.println(c/2);
            }

        }
        // int sum = 0;
        // for (int i = 0; i < n; i++) {
        //     sum += result[i];
        // }

        // System.out.println("the sum = " + sum);
    }
}
