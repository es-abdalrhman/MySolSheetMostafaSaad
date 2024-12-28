import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Teams {
    public static int []colors = {0,1};
    public static int i = 0; 
    public static void dfs(ArrayList<Pair> graph,int node,int color ,mutableint count, int[] visited){

        // get the child and check the visited
        if(visited[node] == 0){visited[node] = 1;}
        else {return ;}
        if (graph.get(node).color == -1){
            graph.get(node).color = 0/*colors[ i%2 ]*/;
            i++;
        }
        int size = graph.get(node).list.size();
        for (int i = 0 ;i < size ; i++){
            int child = graph.get(node).list.get(i);
            
            if(graph.get(child).color == graph.get(node).color && graph.get(node).color != -1){
                count.value ++;
                graph.get(child).color = 3; // to tell that we have already visited and remove conflict
            }else if (graph.get(child).color == -1){
                graph.get(child).color = color == 1? 0:1;
                // send the graph then child and the color of the child and count and the visited array
                dfs(graph,child,graph.get(child).color,count,visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nodes            ,edges
        int n = sc.nextInt(),m = sc.nextInt();
        sc.nextLine();
        int[] visited = new int[n+1];
        for(int i = 0 ; i < n+1 ;i++){
            visited[i] = 0;
        }
        ArrayList<Pair> graph = new ArrayList<>(n+3); 
        // System.out.println(graph);
        // skip the first 0 node in the arraylist
        for (int i = 1 ; i <=n+1 ;i++ ){
            graph.add(new Pair( -1 , new ArrayList<>()));
        }
        // System.out.println(graph);

        // puting the graph as pair (list and color): the index is the node
        // colors : -1 no color 0 red , 1 blue
        // to make undirected graph
        for (int i = 1 ;i <=m ; i++){
            int st =sc.nextInt() ,end =sc.nextInt();
            sc.nextLine();
            ArrayList <Integer> temps = graph.get(st).list;
            temps.add(end);
            Pair tempairs = new Pair( -1, temps);
            graph.set(st,tempairs);
            ArrayList <Integer> tempe = graph.get(end).list;
            tempe.add(st);
            Pair tempaire = new Pair( -1, tempe);
            graph.set(end,tempaire);
        }
        // boolean isame = false;
        // Integer count = 0;
        mutableint count = new mutableint(0);
        for (int i = 1 ; i <= n;i++){
                dfs(graph,i,graph.get(i).color,count,visited);
        }

        // to show the graph 
        // for (int i = 0 ; i <= n;i++)
        //     System.out.println(graph.get(i).list);
        if ((n-count.value)%2 == 1)count.value++;
        System.out.println(count.value);
    }
}
class mutableint{
    public int value;
    mutableint(int value){
        this.value = value;
    }
}

class Pair{
    int  color ;
    ArrayList<Integer> list ;
    Pair( int color ,ArrayList<Integer> list){
        this.color = color;
        this.list = list;
    }
    
}