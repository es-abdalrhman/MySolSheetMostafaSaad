import java.util.ArrayList;
import java.util.Scanner;

public class LaunchofCollider {
    static class Point {
        int x0 , x1 ;
        Point(int x0 , int x1 ){
            this.x0 = x0;
            this.x1 = x1;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = in.nextLine();
        // int sz = s.length();
        char[] str =new char[n];
        for(int i = 0 ; i < n ;i++ ){
            str[i] = s.charAt(i);
        }
        int []xs = new int[n];
        for(int i = 0 ; i < n;i++){
            xs[i] = in.nextInt();
        }
        boolean isr = false;
        ArrayList<Point> list = new ArrayList<>();
        // O(n) if find R go until find L the nearst one then put them in one point
        for(int i = 0 ; i < n ; i++){
            if(str[i] == 'R'){
                // isr = true;
                int st = xs[i];
                for(;i<n;i++){
                    // case RRRL take the last one
                    if(str[i] == 'R'){st = xs[i];}

                    if(str[i] == 'L'){
                        int end = xs[i];
                        list.add(new Point(st, end));
                    }
                }
            }
        }
        // System.out.println(list);
        if(list.size() == 0){
            System.out.println(-1);
            return;
        }
        int min = 1000000000 ;
        int sz = list.size();

        for(int i =0 ; i < sz ;i++ ){
            int st = list.get(i).x0;
            int end = list.get(i).x1;
            int temp = end - (st+end)/2;
            if(min > temp){
                min = temp;
            }
        }
        System.out.println(min);
    }
}
