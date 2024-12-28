import java.util.*;
public class upperandlower{
     public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // System.out.print("Input: ");
            String input = sc.nextLine();
            int len = input.length();
            int lw = 0,up = 0; 
            for (int i = 0 ; i < len ;i++)
            {
                if (Character.isLowerCase(input.charAt(i)))
                {
                    lw ++;
                }else if (Character.isUpperCase(input.charAt(i)))
                {
                    up ++;
                }
            }
            if (lw < up )
            {
                input = input.toUpperCase();
                System.out.println(input);
            }
            else
            {
                input = input.toLowerCase();
                System.out.println(input);
            }
        }

}
}
