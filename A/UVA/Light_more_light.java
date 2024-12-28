import java.util.Scanner;

 class Light_more_light {
    public static void main(String [] args){
        // the idea is if we even number of divisors then the bulb is off if the number of divisors is odd then the bulb is on 
        Scanner sc = new Scanner(System.in);
        
        
        while (true){
            Long n = sc.nextLong();
            if (n == 0L){
                return;
            }
            Double d =  Math.sqrt(n) ;
            Long sq = d.longValue();
            if (sq * sq == n){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
 //     
        
    //     while (true) {

    //         // this solution isn't true but I don't know the problem even more 
    //         Long n = sc.nextLong();
    //         boolean on = false;
    //         if (n == 0L){
    //             return;
    //         }
    //         // this solution is o(n)
    //         // THAT 'S A PROBLEM
    //         for (Long i = 1L ; i<=n ; i++){
    //             if (n % i == 0L){
    //                 on = !on  ;
    //             }

    //         }   
    //         if (on){
    //             System.out.println("yes");
    //         }else{
    //             System.out.println("no");
    //         }
    //         
    //     }