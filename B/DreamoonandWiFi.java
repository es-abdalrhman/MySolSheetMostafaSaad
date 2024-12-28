import java.util.ArrayList;
import java.util.Scanner;

/**
 * DreamoonandWiFi
 */
public class DreamoonandWiFi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        int target = 0;
        // calculate the + and - in the first string
        for (int i = 0; i < s1.length() ; i++) {
            switch (s1.charAt(i)) {
                case '+':
                    target++;
                    break;
                case '-':
                    target--;
                break;
                default:
                    break;
            }
        }
        int num_q = 0;
        int result = 0;
        int numberOfeqv = 0;
        ArrayList<Integer> results = new ArrayList<>();
        for (int i = 0; i < s2.length() ; i++) {
            switch (s2.charAt(i)) {
                case '+':
                    result++;
                    break;
                case '-':
                    result--;
                break;
                case '?':
                    num_q ++;
                    break;
                default:
                    break;
            }
        }
        int answer = target - result;
        int[] cases = new int[(int)Math.pow(2,num_q)];
        boolean conversation = true;
        for (int i = 0; i < num_q; i++) {
            int each = (int)Math.pow(2,i);
            int reach = 0;
            for (int j = 0; j < cases.length; j++) {

                if(each == reach)
                   { 
                    reach = 0;
                    conversation = !conversation;
                   }
                if(conversation )
                    cases[j] +=1;
                else 
                    cases[j] -=1; 
                    
                reach++;
            }
        }
        int out = 0;
        for (int i = 0; i < cases.length; i++) {
            if(cases[i] == answer){
                out++;
            }
        }
        System.out.printf("%.12f",(double)((double)out/(double)cases.length));
    }
}