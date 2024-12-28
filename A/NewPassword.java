import java.util.ArrayList;
import java.util.Scanner;
// in this problem I create a good solution with bad dataStructure as I should use String rather than using ArrayList
public class NewPassword {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , k = sc.nextInt();
        // ArrayList <Character> pw = new ArrayList<>(10);
        String pw = "";
        k = Math.min(k , 26);
        char x = 'a';
        for (int i = 0 ; i < n; i++){
            int temp = (x+i%k);
            Character tempc = (char) temp;
            // pw.add(tempc);
            
            // using strings here is more better than using ArrayList and you can use + concatenate the strings 
            pw = pw + tempc;
        }
        // for(int i = 0 ; i < n ;i++)
        // System.out.print(pw.get(i));
        System.out.println(pw);
        
    }
}
