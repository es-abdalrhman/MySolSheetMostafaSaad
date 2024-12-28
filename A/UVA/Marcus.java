import java.util.ArrayList;
import java.util.Scanner;
// alhamd llah this is the second problem using dfs works good
class Pair{
    int x , y;
    Pair(int x , int y){
        this.x = x ;
        this.y = y ;
    }
}

class Main {
    
    static char[] word = {'@','I','E','H','O','V','A','#'};

    //
    static int[] r_m = {-1 , 0 };  // note that we have 3  directions up right and left 
    static int[] c_m = {0 , -1 , 1}; // there is problem int this iterating as we will check not valid nodes how to avoid?
    // I think there is better solution to make enum for these directions 
    //                      up                  left                right
    static Pair[] moves = {new Pair(-1, 0),new Pair(0, -1),new Pair(0, 1)};
    static String[] direction =  {"forth","left","right"};
    
    
    static ArrayList <String> directions = new ArrayList<>(7);
    public static void dfs(String[] graph ,int row ,int col,int rows,int cols,int target ){
        // we can say that cycle can't happen as every time we have new target so no need to mark any thing as visited
        // 1 mark current node as visited 
        // 2 find the child 

        // for (int i = 0 ;i < 2 ;i ++){
        //     for (int j = 0 ; j < 3; j++){
            for (int i = 0 ; i < 3 ;i++){
                int cur_row = row + moves[i].x;
                int cur_col = col + moves[i].y;
                if (cur_row < 0 || cur_col < 0 || cur_row >= rows || cur_col>= cols) continue ;

                // base case
                 
                if (graph[cur_row].charAt(cur_col) == '#'){directions.add( direction[i]);return;}
                if (graph[cur_row].charAt(cur_col) == word[target]){
                    /*the direction we take to get this target  */
                    directions.add( direction[i]);
                    target++;
                    dfs(graph,cur_row,cur_col,rows,cols,target);
                }
            //     }
            // }
        }
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int rows = sc.nextInt(),cols = sc.nextInt();
            sc.nextLine();
            String[] graph = new String[rows];
            for (int i = 0 ; i < rows ; i++){
                graph[i] = sc.nextLine();
            }
            // the start point is the last line of the graph and the destination is in first line of it
            int target = 0;
            // we already know that the start at the last line
            for (int i = 0 ; i < cols; i++ ){
                if (graph[rows-1].charAt(i) == word[target]){
                    target++;
                    dfs(graph,rows-1 , i,rows,cols,target);
                    break;
                }
            }
            int sz = directions.size();
            for (int i = 0 ;i < sz;i++ ){
                String x = directions.get(i);
                if (x != null)
                    {
                        System.out.print(x );
                        if (i != sz-1){
                            System.out.print(" ");
                        }
                    }
                directions.set(i,null);
            }
            System.out.println();
            t--;
        }
    }    
}
