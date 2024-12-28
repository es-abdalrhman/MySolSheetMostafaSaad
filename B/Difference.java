import java.util.*;

public class Difference {
    // this method is to set visited 
    public static void traverse (HashMap <Integer,ArrayList<Integer>> revdependency,int query,int v,int []costs,boolean[] revvisited){
        ArrayList<Integer> revList = new ArrayList<>();
        if(revdependency.containsKey(query)){
            revList = revdependency.get(query);
        }
        for (int i = 0; i < revList.size() ; i++) {
            if(!revvisited[revList.get(i)]){
                revvisited[revList.get(i)] = true;
                traverse ( revdependency,revList.get(i), v,costs,revvisited);
            }
        }
    }
    public static int topologicalSort(HashMap <Integer,ArrayList<Integer>> dependency,int query,int v,int []costs,boolean[] visited){
        
        // base case
        if(!dependency.containsKey(query)){
            return costs[query];  
        }
        int cost = 0;
        ArrayList list = dependency.get(query);
        // print(list.toString());
        for (int i = 0; i < dependency.get(query).size(); i++) {
            if (!visited[(Integer)list.get(i)]){
                visited[(Integer)list.get(i)] = true;
                cost = cost+topologicalSort(dependency,(Integer)list.get(i),v, costs,visited);
            }
        }
        return cost+costs[query];
    }

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = 0;
        while(true){
        int v = in.nextInt();int e = in.nextInt();
        if(v==0&&e==0) break;
        cases++;
        int[] costs = new int[v+1];
        for (int i = 1; i <= v; i++) {
            costs[i] = in.nextInt();
        }
        HashMap <Integer,ArrayList<Integer>> dependency = new HashMap<>();
        HashMap <Integer,ArrayList<Integer>> revdependency = new HashMap<>();

        for (int i = 1; i <= e; i++) {
            int x = in.nextInt() , y = in.nextInt();
            if(dependency.containsKey(x)){
                dependency.get(x).add(y);
            }else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(y);
                dependency.put(x, list); 
            }
            if(revdependency.containsKey(y)){
                revdependency.get(y).add(x);
            }else{
                ArrayList<Integer> revlist = new ArrayList<>();
                revlist.add(x);
                revdependency.put(y, revlist); 

            }
        }
        
        int q = in.nextInt();
        int[] query = new int[q]; 
        int[] results = new int[q];
        for (int i = 0; i < q; i++) {
            query[i] = in.nextInt();
            boolean[] visited = new boolean[v+1];
            visited[query[i]] = true;
            int min = topologicalSort(dependency, query[i],v, costs,visited);
            // System.out.println(min);
            // int max = t
            boolean[] revvisited = new boolean[v+1];
            int max = 0;
            // revvisited[]
            traverse(revdependency, query[i], v, costs, revvisited);
            for (int j = 1; j < revvisited.length; j++) {
                if(!revvisited[j]){
                    max += costs[j];
                }
            }
            // max += costs[query[i]];
            // System.out.println(max);
            results[i] = max - min;
        }
        in.nextLine();
        System.out.printf("Case #%d:\n",cases);
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }
        System.out.println();
    }
        // System.out.println(dependency.toString());
    }
}
