package hashmap_and_heap;
import java.util.*;
public class sort_k_sorted_array {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        // hashmap using
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<=k;i++){
            pq.add(a[i]);
        }
        for(int i=k+1;i<a.length;i++){
            System.out.println(pq.remove());
            pq.add(a[i]);
        }
        while(pq.size()>0){
            System.out.println(pq.remove());
        }
        scn.close();
    
    }
}

/*
 * 
 * Sample Input
9
3
2
4
1
6
5
7
9
8
3
Sample Output
1
2
3
4
5
6
7
 */
