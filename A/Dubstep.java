import java.util.Scanner;

public class Dubstep {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr ;
        arr = str.split("WUB");
        int sz = arr.length;
        for(int i = 0 ; i < sz ;i++){
            if(arr[i] != "")
                System.out.print(arr[i]+ " ");
        }
    }
}
