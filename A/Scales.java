import java.util.Scanner;

public class Scales {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int i = 0;
        int l = 0, r = 0;
        int sz = s.length();
        while(s.charAt(i)!='|'){
            l++;
            i++;
        }
        i++;
        while(i < sz ){
            r++;
            i++;
        }
        String adds = in.nextLine();
        int add = adds.length();
        double mid =(double) (l+r+add)/2.0;
        int intmid = (int) mid;
        if(mid > intmid ){
            System.out.println("Impossible");
            return ;
        }
        if(intmid < r || intmid < l){
            System.out.println("Impossible");
            return ;
        }
        int x = 0;
        while(l != r || add > 0){
            if(l>=r){
                s = s + adds.charAt(x) ;
                r++;
            }else if(l<=r){
                s = adds.charAt(x) + s;
                l++;
            }
            x++;
            add--;
        }
        System.out.println(s);
    }
}
