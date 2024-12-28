import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt(); 
        sc.nextLine();
        String[] teams = new String[2];
        int[] freq = new int[2];
        while(n-- > 0){
            String s = sc.nextLine();

            for(int i = 0 ; i < 2 ; i++){  
                
                if(teams[i] == null){
                    teams[i] = s;
                }
                if(teams[i].equals(s)){
                    freq[i] += 1;
                    break;
                }
            }
        }
        if (freq[0] > freq[1]){
            System.out.println(teams[0]);
        }else{
            System.out.println(teams[1]);
        }
    }
}
