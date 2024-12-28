import java.util.Scanner;

// I still don't understand how in the question they say that ship its max size = 1 x n/2 and they consider 
/*
  1  
  4
  xxxx
  xxxx
  xxxx
  xxxx
  those are considered 1 ship 
  I thought that they 8 ships as the max size 1 x 2 so I consider this question isn't understandable
 */

class Battleships{
    // 4 directions 
    static int[] r_m = {0,0,-1,1};
    static int[] c_m = {-1,1,0,0};
    public static void dfs(char[][] grid , int row ,int col, int n){
        // assigning current node as visited 
        grid[row][col] = '.';

        for (int i = 0 ; i < 4 ; i++ ){
            int cur_row = row + r_m[i];
            int cur_col = col + c_m[i];
            if (cur_row < 0 || cur_col < 0 || cur_row >= n || cur_col >= n ) continue;
            if (grid[cur_row][cur_col] != '.'){
                dfs(grid,cur_row,cur_col,n);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        int n_t = 0 ;
        while(t>0){
            int n = sc.nextInt();
            sc.nextLine();
            char[][] grid = new char[n][n];
            int n_ships = 0;
            for (int i = 0 ; i < n ; i++){
                String s = sc.nextLine();
                for (int j = 0 ; j < n; j++){
                    grid[i][j] = s.charAt(j);
                }
            }
            for (int i = 0 ; i < n ; i++){
                for (int j = 0 ; j < n ; j++){
                    if (grid[i][j] == 'x'){
                        dfs(grid,i,j,n);
                        n_ships++;
                    }
                }
            }
            n_t++;
            System.out.println("Case "+n_t +": "+ n_ships);
            t--;
        }
    }
}