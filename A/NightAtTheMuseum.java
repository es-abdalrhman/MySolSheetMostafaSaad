import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char cur , prev = 'a';
        int len = s.length();
        int steps = 0;
        for (int i = 0 ;i < len; i++ )
        {
            cur = s.charAt(i);
            // 13 for the half cycle 
            if (Math.abs(cur - prev) > 13)
            // if it is more than 13 so I should remove the value of increasing from 13 
                steps += 13 - Math.abs(cur - prev)% 13;
            else 
                steps += Math.abs(cur - prev);
            prev = cur ;
        }
        System.out.println(steps);
    }    
}
