import java.util.ArrayList;
import java.util.Scanner;
// this problem has some issue 
// this problem I used three pointers to determine the pairs
// the solution above is much more better than the other one we can use array of Arraylists or ArrayLists of ArrayLists
// the learnt from this solution is how to make array of ArrayLists and how to make ArrayList of ArrayLists
// ArrayList<ArrayList<Integer>> array = new ArrayList<>(3); this is the initial size
// ArrayList<Integer>[] arr = new ArrayList[3]; 
public class TeamOlympiad {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer>[] arr= new ArrayList[3];
        for (int i = 0 ; i < 3 ; i++){
            arr[i] = new ArrayList<>();
        }
        // the input
        for (int i = 1 ; i <= n ;i++){
            int temp = sc.nextInt();
            arr[temp-1].add(i);
        }
        int w = 0;
        int sz1 = arr[0].size(),sz2 = arr[1].size(),sz3 = arr[2].size();
        w = Math.min(sz1 , sz2 );
        w = Math.min(w , sz3);
        System.out.println(w);
        for (int i = 0 ;i < w;i++){
            System.out.print(arr[0].get(i) + " " +arr[1].get(i) + " " + arr[2].get(i) + "\n"   );
        }

       
        



























        // Scanner sc = new Scanner(System.in);
        // // the three pointers
        // int one = 0,two = 0,three = 0;
        // // counter for each number of the three numbers
        // int cone = 0,ctwo = 0,cthree = 0;
        // // the size of the array
        // int n = sc.nextInt();
        // int[] array = new int[n];
        // // used to save the position of the triples
        // ArrayList <Integer> arr = new ArrayList();
        // // flag to determine whether we arrive to that number or not 
        // boolean o = true,tw = true,th = true;
        // // number of groups  
        // int w = 0;
        // for(int i = 0 ; i < n ;i++){
        //     array[i] = sc.nextInt();
        // }
        // while(true){
        //     // if the current pointer point to one and we don't enter here in this triple
        //     if (array[one] == 1 && o){
        //         arr.add(one);
        //         o = false;
        //         cone++;
        //         // if we entered in the previous if and we wait for other elements don't increment the pointer
        //     }else if(o){
        //         one++;
        //     }

        //     if (array[two] == 2 && tw){
        //         arr.add(two);
        //         tw = false;
        //         ctwo++;
        //     }else if(tw){
        //         two++;
        //     }
        //     if (array[three] == 3 && th){
        //         arr.add(three);
        //         th = false;
        //         cthree++;
        //     }else if(th){
        //         three++;
        //     }
        //     // when the counter of the three numbers is equal and not equal to the number of triples
        //     if (cone == ctwo && cone == cthree && cone > 0 && cone != w){
        //         o = true;tw = true;th = true; 
        //         w++;
        //         two++;one++;three++;
        //     }
        //     // stop when arrive to size of the array
        //     if (one >= n || two >= n ||three >= n){
        //         break;
        //     }
        // }
        // System.out.println(w);
        // if (w != 0)
        // for(int i = 1 ;i <= arr.size() ; i++)
        // {
        //     System.out.print(arr.get(i-1)+1);
        //     System.out.print(" ");
        //     if ((i % 3 )== 0){
        //         System.out.println();
        //         // stop from printing if the remaining is less than 3 
        //         if ((arr.size() - i)/3 == 0){
        //         break;
        //         }
        //     }
            
        // }
    }
}
