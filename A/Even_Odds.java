// import java.util.ArrayList;
// import java.util.Scanner;

// *****************************************************************************
// // not that the indecies of array and arraylist aswell are integers not long
// *****************************************************************************

// public class Even_Odds {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         long n = sc.nextLong();
//         long k = sc.nextLong();
//         sc.nextLine();
//         // this solution is o(n) 

//         // long[] arr = new long[n];
//         ArrayList<Long> arr = new ArrayList<>(n);
//         int  j = 0 ;
//         for(long i = 1 ;i <= n ; i+=2){
//             arr.add(j++, i);
//         } 
//         for(long i = 2 ;i <= n ; i+=2){
//            arr.add(j++, i);
//         }
//         System.out.println(arr.get(k-1)); 
//     }
// }

import java.util.Scanner;

public class Even_Odds {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // this solution is O(1)
        long n = sc.nextLong();
        long k = sc.nextLong();
        sc.nextLine();
        long n_odds = n/2;
        if(n%2 == 1)
        {
            n_odds++;
        }
        if (k <= n_odds){
            System.out.println(1+(2*(k-1)));
        }else{
            k -=n_odds;
            System.out.println(2*k);
        }
    }
}

