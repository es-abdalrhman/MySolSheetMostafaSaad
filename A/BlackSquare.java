import java.util.Scanner;

public class BlackSquare {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] a = new int [4];
        for (int i = 0; i < 4 ;i++)
        {
            a[i] = sc.nextInt();
        }
        sc.nextLine();
        String s = sc.nextLine();
        int i = 0 ;
        int cal = 0; 
        int len = s.length();
        while (i < len)
        {
            cal += a[s.charAt(i)-'1']; 
            i++;
        }
        System.out.println(cal);
    }    
}
