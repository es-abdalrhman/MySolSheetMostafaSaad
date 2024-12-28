import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String();
        str = in.nextLine();
        int count = 0;
        while (str.length() > 1){
            int sum = 0 ;
            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }
            str = Integer.toString(sum);
            count ++;
        }
        System.out.println(count);
    }
}
