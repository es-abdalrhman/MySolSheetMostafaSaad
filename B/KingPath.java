import java.util.*;
/**
 * InnerKingPath
 */
 class Pair {
    int x; int y;
    Pair(int x , int y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return x == pair.x && y == pair.y;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
public class KingPath {
    // this check takes alot of time  =======> to solve this problem I can use the hashMap instead of the array the key is the number of row == child_x and go throw the linked list in the table to see if the child_y is allowed or not
    public static boolean check(HashMap <Integer,LinkedList<Pair>> isAllowedMap, int child_x, int child_y) {
        boolean isallowed = false;
        // for (int i = 0; i < allowed.length; i++) {
        //     if (child_x == allowed[i][0] && child_y >= allowed[i][1] && child_y <= allowed[i][2]) {
        //         isallowed = true;
        //         break;
        //     }

        // }
        if(isAllowedMap.containsKey(child_x)){
            for (Pair p : isAllowedMap.get(child_x)) {
                if(child_y >= p.x && child_y <= p.y){
                    isallowed = true;
                    break ;
                }
            }
        }
        return child_x >= 1 && child_x <= 1000000000 && child_y >= 1 && child_y <= 1000000000 && isallowed;
    }

    // find the length of the shortest path count number of levels
    public static int bfs(int x0, int y0, int x1, int y1, HashMap <Integer,LinkedList<Pair>> isAllowedMap) {
        HashSet <Pair> p_bool = new HashSet<>();
        Pair p = new Pair(x0, y0);
        p_bool.add(p );
        // not very good idea as it take of n*(b-a) =======> to solve this problem why not to make the existence inside the table is a sign for visiting
        // for (int i = 0; i < allowed.length; i++) {
        //     for (int j = allowed[i][1]; j <= allowed[i][2] ; j++) {
        //         Pair p1 = new Pair(allowed[i][0] , j);
        //         p_bool.put(p1 , false);
        //     }
        // }
        Queue <Pair> q = new LinkedList<>();
        int[] x = {-1,-1,-1,0,0,1,1,1};
        int[] y = {0,-1,1,-1,1,0,-1,1};
        q.add(p);
        int count = 0;
        while(!q.isEmpty()){
            int levelSize = q.size();
            for (int l = 0; l < levelSize; l++) {
                Pair cur = q.poll();
                for (int i = 0; i < 8; i++) {
                    Pair child = new Pair(cur.x+x[i],cur.y+y[i]); 
                    if(check(isAllowedMap, child.x, child.y)){
                        if(child.x == x1 && child.y == y1){
                            return  count+1;
                        }
                        if(!p_bool.contains(child)){
                            q.add(child);
                            p_bool.add(child);
                        }
                    }
                }
            }
            count++;
        }
        return -1;
        
        // boolean[][] isvisited = new boolean[][];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x0 = in.nextInt(), y0 = in.nextInt(), x1 = in.nextInt(), y1 = in.nextInt();
        int n = in.nextInt();
        HashMap <Integer,LinkedList<Pair>> isAllowedMap = new HashMap<>(); 
        // input
        int[][] allowed = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                allowed[i][j] = in.nextInt();
            }
            if(isAllowedMap.containsKey(allowed[i][0])){
                isAllowedMap.get(allowed[i][0]).add(new Pair(allowed[i][1], allowed[i][2]));
            } else{
                LinkedList x = new LinkedList<>(); 
                x.add(new Pair(allowed[i][1], allowed[i][2]));
                isAllowedMap.put(allowed[i][0],x);
            }
        }
        System.out.println(bfs(x0, y0, x1, y1, isAllowedMap));
    }
}
