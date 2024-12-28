import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// BFS needs
// what learnt not to make Scanner inside infinite loop and should be closed after finishing inputing
// need to separate any two loops inside the levelsize to finish the nodes inside the level first then increase the count as I need to separate the increasing count from being inside 
// same idea repeated of separating the loop of taking some thing from other value make the loop to make this separation to finish the work of that loop either taking some lines of input or to traverse inside some level loop over the size of the queue that size is determined 
/**
 * TOE2
 */
public class TOE2 {
    public static boolean isvalid(String child){
        return (child.charAt(0)>='a' && child.charAt(0)<='h'&&child.charAt(1)>='1'&&child.charAt(1)<='8');
    }
    public static void bfs(String[] ft){
        // char[] ch = {'a','b','c','d','e','f','g','h'};
        // char[] nums = {'1','2','3','4','5','6','7','8'};
        int[][] next = {{-1,-2},{1,-2},{-1,2},{1,2},{-2,-1},{-2,1},{2,-1},{2,1}};
        
        if(ft[0].equals(ft[1])){
            System.out.println("To get from "+ ft[0] + " to "+ft[1]+" takes "+ 0 +" knight moves.");return;
        }
        Queue<String> q = new LinkedList <String>() ;
        boolean[][] isvisited = new boolean[8][8];
        q.add(ft[0]);
        int count = 0;
        // int countchild = 0;
        while(!q.isEmpty()){
            int levelSize = q.size(); 
            for (int l = 0; l < levelSize; l++) {
                // take the node inside this level and go out of loop after the level size finishes and notice that the next level nodes are added and they are accumlated 
                String cur= q.poll();

                for (int i = 0; i < 8; i++) {
                    String child =  Character.toString((char) (cur.charAt(0) + next[i][0])) +
                    Character.toString((char) (cur.charAt(1) + next[i][1])); ;
                    if(isvalid(child)){
                        if(child.equals(ft[1])){
                            System.out.println("To get from "+ ft[0] + " to "+ft[1]+" takes "+ (count+1) +" knight moves.");
                            return;
                        }
                        if(!isvisited[child.charAt(0)-'a'][child.charAt(1)-'1']){
                            q.add(child);
                            // countchild++;
                            isvisited[child.charAt(0)-'a'][child.charAt(1)-'1'] = true;
                        }
                    }
                }
            }
            // the count increases after all nodes in the same level finishes 
            count++;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (in.hasNextLine()){
            String ft = in.nextLine();
            bfs(ft.split(" "));
        }
        in.close();
    }
    
}