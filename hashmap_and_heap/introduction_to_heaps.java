package hashmap_and_heap;
// import java.io.*;
import java.util.*;

public class introduction_to_heaps {
    public static void main(String[] args){
        // Collections.reverseOrder() => gives priority to bigger value, amd without it. it gives priority to smaller value. so smaller value is printed first
        
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int[] ranks={22,99,3,11,88,4,1};
        for(int val:ranks){
            pq.add(val);   //nlogn
        }
        while(pq.size()>0){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
} 
