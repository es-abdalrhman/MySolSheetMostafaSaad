import java.util.Scanner;
// I think I noticed some thing that the solution in M_S pdf the number where primes
class divisors {
    // this is the solution provided in the papers of m_s but not working correctly;
    // static int inc_exec(int idx , int d , int sign,int n,int[]arr){
    //     if (idx == arr.length){
    //         if (d == 1 ){
    //             return 0; // nothing selected
    //         }
    //         return sign*n/d;
    //     }
    //     int x = inc_exec(idx+1, d, sign,n,arr);
    //     int y = inc_exec(idx+1, d*arr[idx], sign*-1,n,arr);
    //     return x+y;
    // }

    static int gcd(int a ,int b){
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    static int lcm (int a, int b){
        return (a*b)/gcd(a, b);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            Long n = sc.nextLong();
            Long m = sc.nextLong();
            int a = sc.nextInt();
            int d = sc.nextInt();
            Long countn = 0L;
            Long countm = 0L;
            int[] arr = new int[5];
            for (int i = 0 ; i < 5;i++){
                arr[i] = a + i * d;
            }

            for (int i0 = 0 ; i0 < 2 ; i0++){
                for (int i1 = 0 ; i1 < 2 ; i1++){
                    for (int i2 = 0 ; i2 < 2 ; i2++){
                        for (int i3 = 0 ; i3 < 2 ; i3++){
                            for (int i4 = 0 ; i4 < 2 ; i4++){
                                int div = 1 ;int elem_counts = 0;

                                if (i0>0) {div *= arr[0];elem_counts++;}
                                if (i1>0) {div=lcm(div,arr[1]);elem_counts++;}
                                if (i2>0) {div=lcm(div,arr[2]);elem_counts++;}
                                if (i3>0) {div=lcm(div,arr[3]);elem_counts++;}
                                if (i4>0) {div=lcm(div,arr[4]);elem_counts++;}

                                if (elem_counts == 0){
                                    continue ; // nothing is chosen
                                }
                                int sign = elem_counts%2 == 1 ? 1 :-1;

                                countn += sign * n/div;
                                countm += sign * m/div;
                                
                            }
                        }
                    }
                }
            }
            System.out.println((m-n+1) -(countm-countn));
            // System.out.println((m-n+1)-(inc_exec(0,1,-1,m,arr)-inc_exec(0,1,-1,n,arr)));
            
            // this solution give time limit O(n-m)
            // for (int i = n ; i <= m ; i++)
            // {
            //     boolean isdivisable = false;
            //     for (int j = 0 ; j < 5 ;j ++){
            //         if(i%arr[j] == 0){
            //             isdivisable = true;
            //             break;
            //         }
            //     }
            //     if (!isdivisable){
            //         count++;
            //     }
            // }
            // System.out.println(count);
            t--;
        }

    }
}


// Bing solution 
// import java.util.Scanner;

// class divisors {
//     static long inc_exec(int idx, long d, int sign, long n, int[] arr) {
//         if (idx == arr.length) {
//             if (d == 1) {
//                 return 0; // nothing selected
//             }
//             return sign * n / d;
//         }
//         long x = inc_exec(idx + 1, d, sign, n, arr);
//         long y = inc_exec(idx + 1, lcm(d, arr[idx]), sign * -1, n, arr);
//         return x + y;
//     }

//     static long gcd(long a, long b) {
//         if (b == 0) {
//             return a;
//         }
//         return gcd(b, a % b);
//     }

//     static long lcm(long a, long b) {
//         return a * b / gcd(a, b);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t = sc.nextInt();
//         while (t > 0) {
//             long n = sc.nextLong();
//             long m = sc.nextLong();
//             int a = sc.nextInt();
//             int d = sc.nextInt();
//             int[] arr = new int[5];
//             for (int i = 0; i < arr.length; i++) {
//                 arr[i] = a + i * d;
//             }
//             System.out.println((m - n + 1) - (inc_exec(0, 1, -1, m+1 , arr) - inc_exec(0, 1, -1, n, arr)));
//             t--;
//         }
//     }
// }

