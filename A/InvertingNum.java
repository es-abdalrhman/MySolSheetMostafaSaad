import java.util.Scanner;

public class InvertingNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int sz = s.length();
        char[] str = new char[sz];
        for(int i = 0 ; i < sz ; i++){
            str[i] = s.charAt(i);
        }
        for(int i = 0 ; i < sz ;i++){
            if(str[i] > '4' /*&& ( str[i] < '9')*/){
                str[i] = (char)((char) ('9' - str[i]) + '0');
            }
        }
        // boolean isdig = false;
        if(str[0] == '0'){
            str[0] = '9';
        }
        // char[] result = new char[sz -st];
        // for(int i = 0 ;i < sz -st ;i++){
        //     result[i] = str[i+st];
        // }
       
        System.out.println(str);
    }
}
