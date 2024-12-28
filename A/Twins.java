import java.util.Scanner;

public class Twins {
    public static void sort(int []arr){
        int sz = arr.length;
        for (int i = 0 ; i < sz ;i++){
            for(int j = 0 ; j < sz-i-1 ;j++){
                if (arr[j] < arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        double sum = 0 ;
        // if we don't sort the array that will lead to problem that we will still suming although we already take more than the half
        for (int i = 0 ; i < n ;i ++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sort(arr); // why we need to sort to make the bigger coins in the first so we can take the min number of coins
        double take =sum/2.0;
        // System.out.println(take);
        int count = 0;
        double sumtake = 0;
        for (int i = 0 ; i < n ; i++){
            
            if (sumtake <= take){
                sumtake += arr[i];
                count++;
            }else{

                break;
            }

        }
        System.out.println(count);

        // System.out.println(take);
    }
}
