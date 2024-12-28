// the learnt from this is the ceiling function n/k --> ((n+(k -1))/k) 

import java.util.Scanner;
// the problem in this question is that I thought that the time he builds the second oven ,he will be not able to make cakes
public class CarrotCakes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ,t =sc.nextInt() , k = sc.nextInt() , d = sc.nextInt() ;
        int t1 = ((n+(k -1))/k) * t ;
        // number of cakes baked while building
        int nCB = d/t * k;
        // updating the total number needed for cakes
        n -= nCB;
        // the rate of baking cakes
        k *= 2 ;
        int t2 = d + ((n+(k -1))/k)*t ;
        if (t2 < t1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
