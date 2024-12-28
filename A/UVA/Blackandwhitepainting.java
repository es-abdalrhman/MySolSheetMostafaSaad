import java.util.Scanner;

public class Blackandwhitepainting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m,c;
        while(sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            c = sc.nextInt();
            Long count = 0L;
            if (n == 0 && m == 0){
                return;
            }
            // to determine the number of valid start points all are valid but not the last 7 rows and 7 cols 
            // so we remove those 7 from rows and cols then remaining multiply the valid rows and cols 
            // but there is a trick that available start is white not black so the answer divided by 2
            // if the answer was odd number when dividing the result will be one of two if c = 0 then take the floor otherwise take the ceil 
            int validStartRow = n - 7;
            int validStartCol = m - 7;
            int num = (validStartCol*validStartRow)/2;
            if (validStartCol%2 == 1 && validStartRow%2 == 1 )
                num = num + c  ;
            
            System.out.println(num);
            
        //     boolean isEndRow = false;
        //     // this solution has some problem and I don't know what is it especially when trying 40000 39999 0 the answer is near but not true
        //     for (int i = 0 ; i< n ;i++){
        //         for (int j = 0 ; j < m ;j++){
        //             if (n-j >=8 ){
        //                 if (n-i >= 8){
        //                     if ((i+j)%2 != c){
        //                         count++;
        //                     }
        //                 }
        //                 else{
        //                     break;
        //                 }
        //         }
        //     }
        // }
        //     System.out.println(count);
        }
        

    }
}
