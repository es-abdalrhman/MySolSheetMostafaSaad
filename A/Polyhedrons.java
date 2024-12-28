import java.util.HashMap;
import java.util.Scanner;

public class Polyhedrons {
    static HashMap<String,Integer> shapes = new HashMap<>(5); 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        shapes.put("Tetrahedron",4);
        shapes.put("Cube",6);
        shapes.put("Octahedron",8);
        shapes.put("Dodecahedron",12);
        shapes.put("Icosahedron",20);
        int sum = 0;
        int n =in.nextInt();
        in.nextLine();
        for(int i = 0 ; i < n ;i++){
            String s= in.nextLine();
            sum += shapes.get(s).intValue();
        }
        System.out.println(sum);
    }
}
