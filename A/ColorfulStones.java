import java.util.Scanner;

public class ColorfulStones {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next(),t = sc.next();
        int j = 0;
        int tLen = t.length();
        for (int i = 0 ; i < tLen ; i++ ){
            if (s.charAt(j) == t.charAt(i)){
                j++;
            }
        } 
        System.out.println(j+1);
    }
}
