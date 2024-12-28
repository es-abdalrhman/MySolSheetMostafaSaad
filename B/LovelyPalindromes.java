import java.util.Scanner;

public class LovelyPalindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder str =new StringBuilder(input);
        StringBuilder rev = new StringBuilder(input);
        StringBuilder ans = str.append(rev.reverse()) ;
        String out = ans.toString();
        System.out.print(out);
    }
}
