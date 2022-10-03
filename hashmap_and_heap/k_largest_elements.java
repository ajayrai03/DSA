package hashmap_and_heap;
import java.util.*;
public class k_largest_elements{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        // heap using
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<a.length;i++){
            if(i<k){
                pq.add(a[i]);
            }
            else{
                if(a[i]>pq.peek()){
                    pq.remove();
                    pq.add(a[i]);
                }
            }
        } 
        while(pq.size()>0){
            System.out.println(pq.remove());
        }
        scn.close();
    }
}


/*Sample Input
13
12
62
22
15
37
99
11
37
98
67
31
84
99
4 */
/*Sample Output
84
98
99
99 */