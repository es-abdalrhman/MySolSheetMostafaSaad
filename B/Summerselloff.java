import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * I saw the solution of this problem implementation and greedy noticed with greedy algorithms we use priority queue 
 */
public class Summerselloff {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), l = in.nextInt();
        int[] arrProducts = new int[n];
        int[] arrCustomers = new int[n];
        int[] arr = new int[n];
        long res = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            arrProducts[i] = in.nextInt();
            arrCustomers[i] = in.nextInt();
            int cur = Math.min(arrProducts[i], arrCustomers[i]); 
            res += cur;
            pq.add( Math.min(2*arrProducts[i],arrCustomers[i]) - cur);
        } 
        for (int i = 0; i < l; i++) {
            res += pq.poll();
        }
        System.out.println(res);
    }
}

// import java.util.Scanner;
// tttttttttttttttttttttthis problem the provided code led to wrong error
// public class Summerselloff {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt() , f = in.nextInt();
//         int[] arrProducts = new int[n];
//         int[] arrCustomers = new int[n];
//         int[] arr = new int[n];
//         int candouble = 0;
//         for (int i = 0; i < n; i++) {
//             arrProducts[i] = in.nextInt();
//             arrCustomers[i] = in.nextInt();
//             if(arrProducts[i] == 0)
//                 arr[i] = 0;
//             else
//                 arr[i] = arrProducts[i] - arrCustomers[i]; 
//             if(arrProducts[i] < arrCustomers[i]){
//                 candouble++;
//             }
//         } 

//         if(f != 0 && candouble != 0)
//         {
//         int[] arrmax = new int[n];
//         int[] arrmaxindex = new int[n]; 
//         int max = -100000000;
//         int max_index = -1;
//         int count = 0;
//         for (int i = 0; i < n && count < f; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(arrProducts[j] > max && arrProducts[j] != 0){
//                     max = arrProducts[j];
//                     max_index = j;
//                 }
//             }
//             if(max_index != -1 && arrCustomers[max_index] >= 2*arrProducts[max_index])
//             {
//                 arrmax[count]= arrProducts[max_index] *2;
//                 arrProducts[max_index] = 0;
//                 arrmaxindex[count] = max_index ;
//                 count++;
//             }
//             max_index = -1;
//             max = -100000000;
//         }
//         for (int i = 0; i < count; i++) {
//             arrProducts[arrmaxindex[i]] = arrmax[i];
//         }
//         int min = 1000000000;
//         int min_index = -1;
//         for (int i = 0; i < f-count; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(arr[j]<min && arr[j] != 0){
//                     min = arr[j];
//                     min_index = j;
//                 }
//             }
//             if(min_index != -1)
//             {
//                 arrProducts[min_index] *=2;
//                 arr[min_index] = 1000000000;
//             }
//             min_index = -1;
//             min = 1000000000;
//         }
//         }
//         long res= 0;
//         for (int i = 0; i < n; i++) {
//             if(arrProducts[i]<=arrCustomers[i]){
//                 res += arrProducts[i];
//             }else{
//                 res += arrCustomers[i];
//             }
//         }
//         System.out.println(res);
//     }
// }
