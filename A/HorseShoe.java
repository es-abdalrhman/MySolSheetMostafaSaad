import java.util.HashSet;
import java.util.Scanner;
// HashMap and HashSet 
public class HorseShoe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet set = new HashSet<>();
        for (int i = 0 ; i < 4 ; i++){
            set.add(sc.nextInt());
        }
        System.out.println(4 - set.size());
    }
}
