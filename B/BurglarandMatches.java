import java.util.Scanner;
import java.util.TreeMap;

public class  BurglarandMatches{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        // there is a problem in the implementation of maps that the duplicated keys will be overwritten
        TreeMap<Integer,Integer> boxes_values = new TreeMap <>();
        // the problem solved using this approach of we don't need to separate them put we can add them together
        int sum_boxes = 0 ;
        int sum_max_matches = 0;
        // in the next part key represent the number of boxes and value is the number of matches
        for (int i = 0; i < m; i++) {
            int key = in.nextInt();
            int value = in.nextInt();
            if(boxes_values.containsKey(value)){
                boxes_values.put(value,key+boxes_values.get(value));
            }else 
                boxes_values.put(value,key);
            sum_boxes += key;
            sum_max_matches += key *value;
        }
        if(sum_boxes <= n){
            System.out.println(sum_max_matches);
            return;
        }
        int count = 0;
        // if not go greedy take the max value
        while(n > 0){
            int max_matches = boxes_values.lastKey();
            int num_boxes = boxes_values.get(max_matches);
            if(num_boxes >= n){
                count += max_matches * n ;
                n = 0;
            }else {
                count += max_matches * num_boxes;
                n -= num_boxes;
                boxes_values.remove(max_matches);
            }
        }
        System.out.println(count);
    }
}