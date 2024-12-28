import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * StudentsandShoelaces
 */
public class StudentsandShoelaces {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt(), m = in.nextInt();
        HashMap<Integer,ArrayList<Integer>> h = new HashMap<>(n);
        for (int i = 0; i < m; i++) {
            int x = in.nextInt() , y = in.nextInt();
            if (h.containsKey(x)){
                 h.get(x).add(y);
            }else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(y);
                h.put(x, arr);
            }
            if (h.containsKey(y)){
                 h.get(y).add(x);
            }else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(x);
                h.put(y, arr);
            }
        }
        boolean isreducing = false ;
        int count = 0;
        do{
            ArrayList<Pair> bad = new ArrayList<>();
            isreducing = false;
            for (int i = 1; i <= n; i++) {
                if(h.containsKey(i)){
                    if(h.get(i).size() == 1){
                        isreducing = true;
                        bad.add(new Pair(i, h.get(i).get(0)));
                    }
                }
            }
            for (int i = 0; i < bad.size() ; i++) {
                if(h.containsKey(bad.get(i).x))
                    h.remove(bad.get(i).x);
                if(h.containsKey(bad.get(i).y))
                    h.get(bad.get(i).y).remove((Integer)bad.get(i).x);
            }
            if(isreducing) count++;
        }while(isreducing);
        System.out.println(count );
    }
}

/**
 * Pair
 */
 class Pair {
    int x,y;
    Pair(int x , int y){
        this.x = x;
        this.y = y;
    }
    
}