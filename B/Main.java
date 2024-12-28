import java.util.Scanner;
// got wrong answer without knowing the issue
// THE PROBLEM is that there is some cases not covered like that X if wins should be more than O by one or it won't work as if it wins the turn is for O and it can't play
// this problem can be solved as BFS 
// learn to take the testcase all lines at once not to go throw all lines as n doen't give you easy way always separate the n for test cases and each test case input logic
public class Main {
    public static int countDiff(String[] grid){
        int countx = 0;
        int counto = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i].charAt(j)=='X') {
                    countx++;
                }else if (grid[i].charAt(j)=='O'){
                    counto++;
                }
            }
        }
        return countx-counto ;

        
    }
    public static boolean correctWin(String[] grid){
        char[] players = {'X','O'} ;
        boolean xwin = false, owin = false;
        for (int p = 0; p < players.length; p++) {
        int mdiag = 0 , rdiag = 0;
            for (int i = 0; i < 3; i++) {
                int row = 0,column = 0;
                for (int j = 0; j < 3; j++) {
                    if (grid[i].charAt(j) == players[p]) {
                        row ++;
                        if(row == 3){
                            if(p == 0 ){
                                xwin = true;
                            }else{
                                owin = true ;
                            }
                        }
                    }
                    if (grid[j].charAt(i) == players[p]) {
                        column ++;
                        if(column == 3){
                            if(p == 0 ){
                                xwin = true;
                               
                            }else{
                                owin = true ;
                            }
                        }
                    }
                }
                if (grid[i].charAt(i) == players[p]) {
                    mdiag ++;
                    if(mdiag == 3){
                        if(p == 0 ){
                            xwin = true;
                            
                        }else{
                            owin = true ;
                        }
                    }
                }
                if (grid[2-i].charAt(i) == players[p]) {
                    rdiag ++;
                    if(rdiag == 3){
                        if(p == 0 ){
                            xwin = true;
                            
                        }else{
                            owin = true ;
                        }
                    }
                }
            }
        }
        int diff = countDiff(grid);
        if(diff != 0 && diff != 1) return false;
        if(xwin&&owin )return false;
        if(xwin && diff !=1) return false;
        if(owin && diff !=0)return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Number of test cases
        in.nextLine(); // Consume remaining line

        // Loop through each test case
        for (int test = 0; test < n; test++) {
            String[] grid = new String[3];

            // Read the 3x3 grid
            for (int i = 0; i < 3; i++) {
                grid[i] = in.nextLine();
            }

            // Skip the blank line separating test cases
            if (test < n - 1) {
                in.nextLine();
            }

            // Check if the current test case is valid
            if (correctWin(grid)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        in.close();
        }
    }

