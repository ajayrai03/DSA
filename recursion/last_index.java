package recursion;
import java.util.*;
public class last_index {
 public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[] a=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=scn.nextInt();
    }
    int x=scn.nextInt();
    int li=lastIndex(a,0,x);
    System.out.println(li);
    scn.close();
}   
public static int lastIndex(int[] a, int idx, int x){

    // base case
    if(idx==a.length){
        return -1;
    }
    int li=lastIndex(a,idx+1,x);
    if(li==-1){
        if(a[idx]==x){
            return idx;
        }
        else{
            return -1;
        }
    }
    else{
        return li;
    }
}
}
