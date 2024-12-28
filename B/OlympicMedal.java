import java.util.Scanner;

/**
 * OlympicMedal
 */
public class OlympicMedal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        int m = in.nextInt();
        int [] y = new int[m];
        for (int i = 0; i < m; i++) {
            y[i] = in.nextInt();
        }
        int k = in.nextInt();
        int [] z = new int[k];
        for (int i = 0; i < k; i++) {
            z[i] = in.nextInt();
        }
        int a = in.nextInt() , b = in.nextInt();
        float ratio = (float)a/(float)b;
        float outer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int j2 = 0; j2 < k; j2++) {
                    float temp =( ratio * y[j] * (float )Math.pow(x[i], 3.0)) / (float )z[j2];
                    if(temp > outer){
                        outer = temp;
                    }
                }
            }
            
        }
        System.out.println(Math.cbrt(outer));
        
    }
}