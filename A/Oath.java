import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Oath {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        // Long[] freq = new Long[ 1000000001 ]; 
        if (n <= 0){
            System.out.println(0);
            return;
        }
        // there is another abroach no need for using hashmap just know the O(n)by iterating through the array and if the number is min<number<max increase the counter 
        HashMap <Integer,Integer>freq  = new HashMap<>();
        
        // HashSet<Integer> s = new HashSet<>();
        int min = 1000000000 , max = 0 ; 
        for (int i = 0 ; i < n ; i++){
            // s.add(sc.nextInt());
            Integer x = sc.nextInt();
            if (x > max)
                max = x;
            if (x < min)
                min = x;
            if (freq.get(x) == null){
                freq.put(x , 1);
            }else
                {freq.put(x , freq.get(x)+1 );}
        }
        // corner case
        if (n == 1){
            System.out.println(0);
            return;
        }
        // sout(n-(freq.get(min))-(freq.get(max))) this cause problem if all elements are repeated to handle or corner cases 
        int ans = n-(freq.get(min))-(freq.get(max)); 
        if (ans < 0)
           System.out.println(0);
        else 
            System.out.println(ans);
        // the problem in this code is that I don't take in my consideration the repeatance in the middle
        // int sz = s.size();
        // if (sz > 2)
        //     System.out.println(sz-2);
        // else
        //     System.out.println(0);
    }
}
