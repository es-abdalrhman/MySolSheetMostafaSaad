import java.io.File;
import java.util.Scanner;
// this problem is one of the first apps of DFS algorithm allhamd llah 
class The_Seasonal_War {
static int []r_m = {0,-1,1};
static int []c_m = {0,-1,1};
    static void dfs(int graph[][],int row,int col,int n){
        
// get the child 
// check if it is visited or not 
// if not visited or should be go through it dfs on it 
         
        for(int i = 0 ; i < 3 ;i++){
            for(int j = 0 ; j < 3; j++ ){
                int cur_row = row + r_m[i];
                int cur_col = col + c_m[j];
                if (cur_row < 0 || cur_row >= n || cur_col < 0 || cur_col >= n  ){
                    continue;
                }
                if (graph[cur_row][cur_col] == 1){
                    graph[cur_row][cur_col] = -1; // visited
                    dfs(graph , cur_row,cur_col,n);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int img_num = 1;
        // need to read from file 
        while(sc.hasNextLine()){
            int n = sc.nextInt();
            sc.nextLine();
            String[] g = new String[n];
            for (int i = 0 ; i < n ; i++){
                g[i] = sc.nextLine();
            }
            int[][] graph = new int[n][n];
            
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < n ;j++){
                graph[i][j] = g[i].charAt(j) - '0' ;
            }
        }
        // create counter for img and increment with each new img

        int count_war_eagles = 0;
        for (int i = 0 ; i < n; i++){
            for (int j = 0 ; j < n; j++){
                if (graph[i][j] == 1){
                    dfs(graph,i,j,n);
                    count_war_eagles++;
                }
            }
        }
    
        // write inside file in the format the img count and #war_eagles
        System.out.println("Image number " + img_num + " contains " + count_war_eagles + " war eagles.");
        img_num++;
    }
    }
}
