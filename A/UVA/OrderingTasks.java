import java.util.ArrayList;
import java.util.Scanner;

class Main {
    static ArrayList<Integer> result =new ArrayList<>() ;
    public static void toposort(ArrayList<ArrayList<Integer>> graph,boolean []visited,int parent){
        visited[parent] = true;
        int sz = graph.get(parent).size();
        for(int i = 0;i<sz;i++){
            int child = graph.get(parent).get(i);
            if (!visited[child]){
                toposort(graph, visited, child);
            }
        }
        result.add(parent);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(),m=sc.nextInt();
        sc.nextLine();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(n+1);
        boolean []visited = new boolean[n+1];
        for(int i = 0 ;i <= n;i++){
            graph.add(new ArrayList<Integer>());
        } 
        int pre = sc.nextInt(), out = sc.nextInt();
        while(true){
            sc.nextLine();
            if(pre == 0 ) break;
            graph.get(pre).add(out);
            pre = sc.nextInt(); out = sc.nextInt();
        }
        for(int i = 1;i <=n ; i++){
            if(!visited[i]){
                toposort(graph,visited,i);
            }
        } 
        for(int i = n-1;i >= 0 ;i--)
        {
            System.out.print(result.get(i));
            if(i != 0 ){
                System.out.print(" ");
            }
        }
    }
}
