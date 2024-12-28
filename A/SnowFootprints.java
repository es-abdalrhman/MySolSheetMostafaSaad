import java.util.Scanner;

public class  SnowFootprints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String str = in.nextLine();
        int s = 0 ,e = 0 ;
        boolean isSfound = false;
        boolean isefound = false ;
        // those cases can't happen RLR or LRL or LLLRRR only this can happen RL so we can say that the start can always be at the first R and the last position is in the last R
        for(int i = 0 ; i < n ; i++){
            if(str.charAt(i) == 'R' && !isSfound){
                s = i+1;
                isSfound = true;
            }
            if(str.charAt(i) == 'R' && str.charAt(i) == 'L'){
                e = i+1;
                break;
            }else if(str.charAt(i) == 'R'){
                // this if only R 
                e = i+2;
            }
        }
        if(s == 0){
            // this if only L 
            for(int i = 0 ; i < n ; i++){
            if(str.charAt(i) == 'L' && !isefound){
                e = i;
                isefound = true;
            }
            if(str.charAt(i) == 'L'){
                s = i+1;
            }
        }
        }
        System.out.println(s+" "+e);

    }
}
