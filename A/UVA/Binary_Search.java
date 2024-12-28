import java.util.Scanner;

public class Binary_Search {
    static class Point {
        int x , y;
        Point(int x , int y){
            this.x = x;
            this.y = y;
        }
    }
    static boolean isGreater(int[] arr,int target,int mid){
        return arr[mid] > target;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] arr =new int[n];
        for(int i = 0 ;i < n;i++ ){
            arr[i] = in.nextInt();
        }
        int q = in.nextInt();
        in.nextLine();
        int[] targets = new int[q];
        for (int i = 0; i < q; i++) {
            targets[i] = in.nextInt();
        }
        Point[] list = new Point[q];
        // the last one smaller than target so I want to move the start and keep end
        for (int i = 0; i < q; i++) {
            int st = 0,end =n-1;
            int mid = 0;int ans = -1;
            // smaller than me and tallest one(upper bound) the first one greater than me 
            while(st <= end){
                mid = st+(end-st)/2; // in the case st = mid we make mid move more than st by one to avoid the infinite loop
                
                if(arr[mid] >= targets[i]){
                    end = mid-1;
                }else if(arr[mid] < targets[i]){ // so this is else 
                    st = mid+1  ;
                    ans = arr[mid];
                }
            }
            list[i] = new Point(ans, -1);
        }
        for (int i = 0; i < q; i++) {
            int st = 0,end =n-1;
            int mid = 0;int ans = -1;
            // in this part I want to get the first one great than me so I want the end to move rather than first
            while(st <= end){
                mid = st+(end-st)/2;
                
                if(arr[mid] > targets[i]){ // I want to keep the end and move the st 
                    end = mid-1;
                    ans = arr[mid];
                }else if(arr[mid] <= targets[i]){
                    st = mid+1 ;
                }
            }
        
            list[i] = new Point(list[i].x ,ans);
        }
        for (int i = 0; i < q; i++) {
            // int isx = -1 , isy = -1;
            if(list[i].x == -1 ){
                System.out.print("X");
            }else{
                System.out.print(list[i].x);
            }
            System.out.print(" ");
            if(list[i].y == -1 ){
                System.out.print("X");
            }else{
                System.out.print(list[i].y);
            }
            System.out.println();
        }
    }
}
