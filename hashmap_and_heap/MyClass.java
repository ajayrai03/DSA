package hashmap_and_heap;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
     HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",120);
        hm.put("USA",20);
        hm.put("UK",30);
        System.out.println(hm);
        hm.put("USA",15);
        hm.put("NEPAL",40);
        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Nagaland"));
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Bulgaria"));
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for(String key:hm.keySet()){
            int val=hm.get(key);
            System.out.println(key+" "+val);
        }
      
    }
}