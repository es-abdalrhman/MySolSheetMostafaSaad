import java.util.Scanner;

public class Longest_UncommonSubsequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        // if (a.subSequence(0, a.length()))
        if (a.equals(b)){
            System.out.println(-1);
        }else{
            int max = Math.max(a.length(), b.length());
            System.out.println(max);
        }
    
    }    
}
