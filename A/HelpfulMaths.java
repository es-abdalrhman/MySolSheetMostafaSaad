import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // + is a special character that I should use \\ before it to tell the engine to work with it literally
        String[] arr = str.split("\\+");
        Arrays.sort(arr);
        int size = arr.length;
        for (int i = 0; i < size; i++)
           { 
            System.out.print(arr[i]);
            if (i != size-1)
            System.out.print("+");
            }
        System.out.println();
        
    }
}
