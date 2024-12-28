import java.util.ArrayList;
import java.util.Scanner;

// topological sort 
public class Hierarchy {
    // to see the global values you need to add the name of the variable in the watches window using +
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(100100);
    public static ArrayList<Integer> result = new ArrayList<Integer>(100100);
    static int[] visited = new int[100100];
    public static void topologicalSort(int parent){
        visited[parent] = 1;
        int sz =graph.get(parent).size();
        for(int i = 0; i < sz;i++){
            int child = graph.get(parent).get(i);
            if(visited[child] == 0){
                topologicalSort(child);
            }
        }
        result.add(parent);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ;i <= n ;i ++){
            graph.add(new ArrayList<Integer>());
        }
        
        // creating the graph
        // O(k*w)
        for(int i = 1 ; i <= k;i++){
            int w = sc.nextInt();
            for (int j = 1 ; j <= w ; j++){
                int child = sc.nextInt();
                graph.get(i).add(child);
            }
            sc.nextLine();
        }
        // O(n+e)
        for(int i = 1 ; i <= n ;i++){
            if(visited[i] == 0){
                topologicalSort(i);
            }
        }
        int[] parent = new int[n+1];
        int cur_parent = 0;
        for (int i = n-1; i >= 0;i-- ){
            int temp = result.get(i);
            parent[temp] = cur_parent;
            cur_parent = temp;
        }
        for(int i = 1 ; i <=n ; i++){
            System.out.println(parent[i]);
        }
    }
}

// I really don't know what is the problem in this code in some times there is infinite call of recursion method 

/*
public class Hierarchy {
    public static int count = 0;
    public static void dfs(int[] tree ,int child,int parent,int n){
        // count++;
        // if(count == n)return;
        // special case if the parent is same as child
        if(child == tree[child]){
            tree[child] = 0;
            return;
        } // repeatance for infinity
        if(child == parent){
            tree[child] = 0;
            return;
        }
        
        if (tree[child] == -1){
            tree[child] = parent;
            return;
        }
        // repeat going to take the point inside the tree array to become my child and so on to reach node has no parent
        child = tree[child];
        dfs(tree ,child,parent,n );

    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt(); int k = sc.nextInt();
        sc.nextLine();
        int[] tree = new int[n+1];
        for(int i = 0; i<=n;i++){
            tree[i] = -1;
        }
        for(int i = 1 ; i <= k;i++){
            int w = sc.nextInt();
            for (int j = 1 ; j <= w ; j++){
                int child = sc.nextInt();
                // if(child == i){tree[child] = 0;continue;}
                if (tree[child] == -1){
                    tree[child] = i;
                }else{
                    dfs(tree,child,i,n);
                }
            }
            sc.nextLine();
        }
        int mainboss = 0;
        for(int i = 1 ; i <= n ;i++){
            if (tree[i] == 0){
                mainboss = i;
            }
        }
        // for the nodes which have no boss till now
        for(int i = 1 ; i <= n ;i++){
            if (tree[i] == -1 ){
                tree[i] = mainboss ;
                mainboss = i;
            }
            System.out.println(tree[i]);
        }
        
    }
}
 */