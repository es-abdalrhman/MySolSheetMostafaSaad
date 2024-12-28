import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] colors = {'O','Y','G','B','I','V','R'};
        int n = in.nextInt();
        StringBuilder str = new StringBuilder();
        int reminder = n%7;
        for (int i = 0; i < n - reminder; i++) {
            str.append(colors[i % 7]);
        }
        for (int i = 0; i < reminder; i++) {
            str.append(colors[3+i%4]);
        }
        System.out.println(str);
    }
}
