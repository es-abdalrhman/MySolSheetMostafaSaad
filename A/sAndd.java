import java.util.*;
public class sAndd {
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Integer[] arr = new Integer[n] ;
        for (int i = 0 ; i < n ;i++)
        {
            arr[i] = sc.nextInt();
        }
        Integer [] players = {0 , 0};
        
        int start = 0 ,end = n-1; 
        for (int i = 0; i < n ;i++)
        {
            if (arr[start] > arr[end]){
                // if I would use this notation += I must be sure that I have initialized the variable before using it or I would be using null pointer
                players[i % 2] += arr[start];
                start ++;
            }
            else{
                players[i % 2] += arr[end];
                end --;
            }
        }
        System.out.print(players[0]+ " "+ players[1]);
    }
}
