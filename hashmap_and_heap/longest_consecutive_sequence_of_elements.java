package hashmap_and_heap;

import java.util.*;

public class longest_consecutive_sequence_of_elements {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int[] a = new int[n];
      for (int i = 0; i < a.length; i++) {
         a[i] = scn.nextInt();
      }
      HashMap<Integer, Boolean> map = new HashMap<>();
      // 1 loop
      for (int val : a) {
         map.put(val, true);
      }
      // 2 loop
      for (int val : a) {
         if (map.containsKey(val - 1) == true) {
            map.put(val, false);
         }
      }
      // 3 loop , tl=temporary length, ml=maximum,msp=starting point
      int ml = 0;
      int msp = 0;
      for (int val : a) {
         if (map.containsKey(val) == true) {
            int tl = 1;
            int tsp = val;
            while (map.containsKey(tsp + tl)) {
               tl++;
            }
            if (tl > ml) {
               ml = tl;
               msp = tsp;
            }
         }
      }
      System.out.println("ajay done");
      for (int i = 0; i < ml; i++) {

         System.out.println(msp + i);
      }
      scn.close();
   }
}