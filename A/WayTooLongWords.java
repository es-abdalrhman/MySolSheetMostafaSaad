import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < n ; i++){
        String str = sc.nextLine();
        if (str.length() > 10){
            System.out.print((char)str.charAt(0));System.out.print(str.length()-2);System.out.print((char)str.charAt(str.length()-1));
            System.out.println();
        }else{
            System.out.println(str);
        }
    }
    }
}
