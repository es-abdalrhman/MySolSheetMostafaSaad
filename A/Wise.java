import java.util.Scanner;

public class Wise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] puz = new int[6];
        for(int i = 0; i < 6 ;i++){
            if(i !=0 && i % 2==0 ){
                in.nextLine();
            }
            puz[i] = in.nextInt();
        }
        int[] answer = new int[4];
        // I need to make equations but no need for this as the value of x is in range of 9
        for(int i = 1 ; i <= 9 ; i++){
            int[] freq = new int[9];
            int x = puz[2]-i+ puz[4]-i;
            if(x == puz[1]){
                answer[0] = i;
                answer[1] = puz[0] - i;
                answer[2] = puz[2] - i;
                answer[3] = puz[4] - i;
                boolean isol = true;
                // to conditions to make sure that this answer is true no -ve  and no repeatation
                for(int j = 0 ; j<4 ; j++){
                    if(answer[j] <= 0 || answer[j] > 9 ){
                        isol = false;
                        break;
                    }
                    freq[answer[j]-1] = 1;
                }
                int count = 0;
                if(isol){
                    for(int j =0; j < 9;j++){
                        if(freq[j] == 1){
                            count++;
                        }
                    }
                    if(count == 4){
                        System.out.println(answer[0]+" "+answer[1]+"\n"+answer[2]+" "+answer[3]);
                        return ;
                    }
                }
            } 
        }
        System.out.println(-1);
    }
}
