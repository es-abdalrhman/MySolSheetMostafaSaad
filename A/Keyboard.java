import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char dir = sc.nextLine().charAt(0);
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String input = sc.nextLine();
        int m = dir == 'R'? -1 : 1;
        int sz = input.length();
        String result = "";
        for (int i = 0 ; i < sz; i++){
            for (int j = 0 ; j < 30 ; j++){
                if (input.charAt(i) == keyboard.charAt(j))
            { /*input.charAt(i) = keyboard.charAt(j+m);*/ // this part is wrong as charAt method return character not used to assign values to assign it may use str.toCharArray :
                /*
                String input = "hello";
                int i = 1;
                char[] chars = input.toCharArray();
                chars[i] = 'x';
                input = new String(chars);
                */ 
                result += keyboard.charAt(j+m);
            }
            }
        }
        System.out.println(result);
    }
}
