package recursion;
import java.util.*;
public class all_indices_of_an_array {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=scn.nextInt();
        }
        int x=scn.nextInt();
        int[] ia=allIndices(a,x,0,0);
        if(ia.length==0){
            System.out.println();
            // return;
            
        }
        for(int i=0;i<ia.length;i++){
            System.out.println(ia[i]);
        }
        scn.close();
    } 
    public static int[] allIndices(int[] a, int x, int idx, int fsf){
         if(idx==a.length){
            return new int[fsf];
         }
        if(a[idx]==x){
            int[] b=allIndices(a,x,idx+1,fsf+1);
            b[fsf]=idx;
            return b;
        }
        else{
            int[] b=allIndices(a,x,idx+1,fsf);
            return b;
        }
    }
}
