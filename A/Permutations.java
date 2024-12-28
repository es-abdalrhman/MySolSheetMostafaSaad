import java.util.LinkedList;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = in.nextInt();
        in.nextLine();
        int[] freq = new int[1001];
        int max = 0;
        // this solution O(1) :)
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            freq[x]++;
        }
        for (int i = 1; i <= 1000; i++) {
            if(max < freq[i]){
                max = freq[i];
            }
        }
        double mid = Math.ceil(n/2.0);
        if(max <= mid){
            System.out.println("YES");
            return ;
        }else{
            System.out.println("NO");
            return ;
        }
    }
}

        // this solution use linkedList
        // int num2 = 0,num1 = 0;
        // for (int i = 0; i < n; i++) {
        //     num1 = list.get(i);
        //     if(i+1 < n){
        //         num2  = list.get(i+1);
        //     }else{
        //         num2 = 0;
        //     }
        //     boolean ismoving = false;
        //     int temp2 = 0;
        //     if(num1 == num2){
        //         for (int j = 0; j < n; j++) {
        //             int temp = list.get(j);
        //             if(j != 0){temp2 =list.get(j-1);}
        //             ismoving = true;
                    
        //             if(num1 != temp &&(j == n-1 || num1 != temp2)){
        //                 list.add(j, num1);
        //                 ismoving =false;
        //                 if(i < j ){
        //                     list.remove(i);
        //                 }else{
        //                     list.remove(i+1);
        //                 }
        //                 break;
        //             }
        //         }
        //         if(ismoving){
        //             System.out.println("NO");
        //             System.out.println(list);
        //             return;
        //         }
        //         // list.remove(i);
        //     }
        // }
        // System.out.println("YES");
        // list.remove(0);
        // list.add(5);
        // System.out.println(list);