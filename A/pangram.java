import java.util.Scanner;

public class pangram {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.nextLine(); // the buffer result in bad character'\n' :(
        boolean[] freq = new boolean[26];
        String str = sc.nextLine();
        if (n < 26) {
            System.out.println("NO");
            return;
        }else{
            str = str.toLowerCase();
            int sz = str.length();
            for (int i = 0 ; i <sz ;i++){
                freq[str.charAt(i) - 'a'] = true;
            }
        }
        for (int i = 0 ; i < 26 ; i++){
            if (freq[i] == false){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
