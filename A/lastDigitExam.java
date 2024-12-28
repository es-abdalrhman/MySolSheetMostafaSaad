import java.util.Scanner;

public class lastDigitExam {
    static int[] lastdigits ={6,8,4,2};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        if (n == 0){
            System.out.println(1);
            return ;
        }
        
        System.out.println(lastdigits[n%4 ]);
            
    }
}
