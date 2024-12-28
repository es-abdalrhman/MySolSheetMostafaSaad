import java.util.Scanner;

// this solution is very long
// this code is bad designed it should have function that check if consecutive or not
// then do the same operation which countd++; and countc += c[i] - c[i-1]
// then we can make a check and instead of all these checking we can check for the day first if the current day is 1 then I may check for the month
// if the current month is 1 then check for year if the current year is greater than the previous by one ok no 
public class Electricity {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            while(true){
                int N = sc.nextInt();
                if (N == 0)return;
                int[] y = new int[N];
                int[] m = new int[N];
                int[] d = new int[N];
                int[] c = new int[N];
                int countd = 0;
                int countc = 0;
                for (int i = 0 ; i < N ; i++){
                    d[i] = sc.nextInt();
                    m[i] = sc.nextInt();
                    y[i] = sc.nextInt();
                    c[i] = sc.nextInt();
                    if (i == 0)continue;
                    if (y[i] - y[i-1] == 0){
                        if (m[i] - m[i-1] == 0 ){
                            if(d[i] - d[i-1] == 1){
                                countd ++;
                                countc += c[i] - c[i-1];
                            }
                        }else if (m[i] - m[i-1] == 1 ){
                            // that must happen
                                    if(d[i] == 1 ){
                                        // the leap year check if m[i-1] == 2
                                        if (m[i-1] == 2 ){
                                            // leap year
                                            if ((y[i]%4 == 0 && y[i]%100 != 0 ) || y[i] %400 == 0 ){
                                                if (d[i-1] == 29 /*&& d[i] == 1 already checked*/ ){
                                                    countd ++;
                                                    countc += c[i] - c[i-1];
                                                    // continue;
                                                }
                                            }else{ // not leap year
                                                if (d[i-1] == 28){
                                                    countd ++;
                                                    countc += c[i] - c[i-1];
                                                }
                                            }
                                        } // the month not equal 2 and less than 8
                                        if (m[i-1] != 2 && m[i-1] < 8 && m[i-1] % 2 == 0 ){
                                            if (d[i-1] == 30){
                                                countd ++;
                                                countc += c[i] - c[i-1];
                                            }
                                        }else if (m[i-1] != 2 && m[i-1] < 8 && m[i-1] % 2 != 0 )// and the month previuos is == 8 or odd number
                                        {
                                            if (d[i-1] == 31){
                                                countd ++;
                                                countc += c[i] - c[i-1];
                                            }
                                        }
                                        else if (m[i-1] >= 8){
                                            if (  m[i-1] % 2 != 0 ){
                                                if (d[i-1] == 30){
                                                    countd ++;
                                                    countc += c[i] - c[i-1];
                                                }
                                            }else if (  m[i-1] % 2 == 0 )// and the month previuos is == 8 or odd number
                                            {
                                                if (d[i-1] == 31){
                                                    countd ++;
                                                    countc += c[i] - c[i-1];
                                                }
                                            }

                                        } 
                                    }else{/*nothing */}
                        }

                    }else if (y[i]- y[i-1] == 1){
                        if (m[i] == 1 && m[i-1] == 12 && d[i] == 1 &&d[i-1] == 31){
                            countd ++;
                            countc += c[i] - c[i-1];
                        }
                    }
                    
                }
                System.out.println(countd + " " + countc);
            }
        }
}
