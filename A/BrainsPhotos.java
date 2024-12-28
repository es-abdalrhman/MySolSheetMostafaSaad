import java.util.Scanner;

public class BrainsPhotos {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x =sc.nextInt();int y = sc.nextInt();
        sc.nextLine();
        String [][] photo = new String[x][y];
        String[] colors = {"C","M", "Y"};
        boolean iscolorful = false ;
        for(int i = 0 ; i < x ; i++){
            String input = sc.nextLine();
            String[] arr;
            arr = input.split(" ");
            // System.out.println(arr[0] + "\n" + arr[1]);
            for(int j = 0 ; j< y ; j++){
                photo[i][j] = arr[j];
                if(!iscolorful)
                for(int c = 0 ; c < 3 ; c++){
                    if(arr[j].equals(colors[c]) ){
                        iscolorful = true;
                    }
                }
            }
        }
        if(iscolorful){
            System.out.println("#Color");
        }else{
            System.out.println("#Black&White");
        }
    }
}
