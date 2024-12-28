import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int i = 1;
        HashSet<Character> set = new HashSet<>();
        while(true){
            Character cur = str.charAt(i);
            if (cur == '}'){
                break;
            }
            if (Character.isLetter(cur)){
                set.add(cur);
            }
            i++;
        }
        System.out.println(set.size());
        
    }
}
