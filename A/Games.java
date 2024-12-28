import java.util.Scanner;
// this is brute force solution
// import javafx.util.Pair;
public class Games {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // to consume the new line character
        int[][] arr = new int[n][2];
        for (int i = 0 ; i < n ; i++)
        {
            for (int j = 0 ; j < 2 ;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0 ;
        for (int i = 0 ; i < n ;i++)
        {
            for (int j = 0 ; j < n ; j++)
            {
                if (arr[i][0] == arr[j][1])
                {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }    
}
