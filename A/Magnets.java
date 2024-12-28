import java.util.*;
public class Magnets {
    public static void main (String[] args)
    {
        String current = "" ,previous = "";
        int groups = 0;
        Scanner sc = new Scanner(System.in);
        // the problem of usage of nextInt method that it doesn't consume the character '\n' so it is important to consume that character using sc.nextLine() 
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ; i < n ;i++)
        {
            current = sc.nextLine();
            if (current.equals(previous))
            {}
            else {
                groups ++;
            }
            previous = current;
        }
        System.out.println(groups);
    }
}