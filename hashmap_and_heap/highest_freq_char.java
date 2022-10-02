package hashmap_and_heap;
import java.util.*;
public class highest_freq_char{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        HashMap<Character,Integer> map=new HashMap<>();
        int maxfre=0;
        char maxfreCha='a';
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)==true){
                int fre=map.get(ch);
                fre+=1;
                map.put(ch,fre);
            }
            else{
                map.put(ch,1);
            }
            if(map.get(ch)>maxfre){
                maxfre=map.get(ch);
                maxfreCha=ch;
            }
        }
        System.out.println(maxfreCha);
        scn.close();
    }
}