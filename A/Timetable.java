import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
// 4^0 == 2^0 ,4^1 == 2^2 ,4^2 == 2^4 ,4^3 == 2^6 and if we have values so we increase the last digit and we don't need to check 1 in the middle

public class Timetable {
    // this function is used to transfer from string binary to integer not used in this problem
    static BigInteger toInt(String str){
        BigInteger dec = new BigInteger("0");
        int sz = str.length();
        for (int i = sz-1; i >= 0; i--) {
            if(str.charAt(i) == '1'){
                String t = Integer.toString((int)Math.pow(2,sz-i-1));
                BigInteger temp = new BigInteger(t);
                dec = dec.add(temp);
            }
        }
        return dec;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int lastdigit = str.length()-1;
        if(str.length() <= 1 ){System.out.println(0);return;}
        int result = 0;
        boolean ismore = false;
        if(lastdigit % 2 == 1 )
            {result = (lastdigit+1) / 2;ismore = false;}
        else
            {result = lastdigit/2;ismore = true;}
        int sz = str.length();
        if(ismore){
            for(int i = sz-1;i > 0 ;i--){
                if(str.charAt(i) == '1'){
                    result++;
                    break;
                }
            }
        }   
        
        System.out.println(result);
        

    }
}
