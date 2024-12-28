import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        String[] s =new String[3];
         s[0] = in.nextLine(); 
         s[1] = in.nextLine();
         s[2] = in.nextLine();
        // char [] c_arr = new char[5];
        int [] c_pos = new int[3];
        for (int i = 0; i < 3; i++) {
            if(s[i].charAt(1) == '>'){
                c_pos[s[i].charAt(2) - 'A'] --;
                c_pos[s[i].charAt(0) - 'A'] ++;
            }else{
                c_pos[s[i].charAt(0) - 'A'] --;
                c_pos[s[i].charAt(2) - 'A'] ++;
            }
        }
        for (int i = 0; i < 3; i++) {
            if(s[i].charAt(1) == '>'){
                if(!(c_pos[s[i].charAt(2) - 'A'] < c_pos[s[i].charAt(0) - 'A'])) {System.out.println("Impossible");return ;}
                
            }else{
                if(!( c_pos[s[i].charAt(0) - 'A'] < c_pos[s[i].charAt(2) - 'A'] )) {System.out.println("Impossible");return;}
            }
        } 

        for (int i = 0; i < c_pos.length; i++) {
            int min = 100;  
            int min_index = 0;
            for (int j = 0; j < c_pos.length; j++) {
                if(c_pos[j] < min ){
                    min = c_pos[j];
                    min_index = j;
                }
            }
           
            System.out.print((char) ('A'+min_index));
            c_pos[min_index] = 100;
        }
    }
}