import java.util.Scanner;

public class PresidentsOffice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() , m = in.nextInt();
        char c = in.next().charAt(0);
        char [][] map = new char[n][m];
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String str = in.nextLine();
            for (int j = 0; j < m; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        int[] chars = new int [200];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(map[i][j] == c ){
                    // check the upper
                    if(i>0 && map[i-1][j] != '.' && map[i-1][j] != c){
                        chars[map[i-1][j]]++; 
                        map[i-1][j] = '.';
                    }
                    // check the lower
                    if(i<n-1 && map[i+1][j] != '.' &&  map[i+1][j] != c){
                        chars[map[i+1][j]]++; 
                        map[i+1][j] = '.';
                    }
                    // check the left
                    if(j>0 && map[i][j-1] != '.' && map[i][j-1] != c){
                        chars[map[i][j-1]]++; 
                        map[i][j-1] = '.';
                    }
                    // check the right
                    if(j<m-1 && map[i][j+1] != '.' && map[i][j+1] != c){
                        chars[map[i][j+1]]++; 
                        map[i][j+1] = '.';
                    }
                }
            }
        }
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] > 0) 
                count++; 
        }
        
        System.out.println(count);
    }
}
