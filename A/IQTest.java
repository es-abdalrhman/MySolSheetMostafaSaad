import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = new String[4];
        char[][] graph = new char[4][4];
        for(int i = 0 ; i < 4 ; i++){
            str[i] = in.nextLine();
            for(int j = 0 ; j < 4 ;j++){
                graph[i][j] = str[i].charAt(j);
            }
        }

        for(int i = 0; i< 4 ;i++){
            for(int j = 0 ;j <4 ;j++){
                if(i+1 != 4 && j+1 !=4){
                    // 
                    if(graph[i][j] == graph[i+1][j] && (graph[i][j] == graph[i][j+1] || graph[i][j] == graph[i+1][j+1]) ){
                        System.out.println("YES");
                        return ;
                    }
                    // 
                    if(graph[i][j] == graph[i][j+1] && (graph[i][j] == graph[i+1][j] || graph[i][j] == graph[i+1][j+1]) ){
                        System.out.println("YES");
                        return ;
                    }
                }
                // the case of
                // .#
                // ##
                if( j == 3 && i != 3){
                    if(graph[i][j] == graph[i+1][j] && ( graph[i][j] == graph[i+1][j-1]) ){
                        System.out.println("YES");
                        return ;
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
