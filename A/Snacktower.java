import java.util.HashMap;
import java.util.Scanner;
// the idea is to create hash table and target if the input occured or come then let it become true if the input == target print it and target --; 
// and so on
// we are waiting for target to start printing and want to know if other elements come or not so use frequency array to know if other elements come or not
// if they come still print till you find a new target that hasn't come yet   
public class Snacktower {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = n;
        boolean[] come = new boolean[n+1];
        for (int i = 0 ; i< n+1 ;i++){
            come[i] = false;
        }
        
        for (Integer i = 0; i < n ;i++ ){
            int a = sc.nextInt();
            come[a] =true;
            if(a == target){
                while(come[a]){
                    System.out.print(a + " ");
                    target--;
                    a--;
                }
                System.out.println();
            }else{
                System.out.println();
            }
        }

    }
}