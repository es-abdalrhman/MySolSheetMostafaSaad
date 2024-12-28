import java.util.Scanner;

public class TableAndStones {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String stones = sc.nextLine();
        // '' is invalid character
        char cur , prev = '#';
        int min = 0;
        for (int i = 0 ; i < n ; i++)
        {
            cur = stones.charAt(i);
            if (cur == prev)
            {
                min++;
            }
            prev = cur;
        }   
        System.out.println(min);
    }    
}
