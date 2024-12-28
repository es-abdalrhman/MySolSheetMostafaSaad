import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ;i ++ )
        {
            arr[i] = sc.nextInt();
        }
        int crimes = 0 ;
        int officiers = 0;
        for (int i = 0 ; i < n ;i++)
        {
            if (arr[i] < 0)
            {
                if (officiers == 0)
                    crimes++;
                else 
                    officiers --;
            }else 
                officiers += arr[i];
        }
        System.out.println(crimes);
    }    
}
