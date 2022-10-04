package recursion.recursion_with_arraylist;
import java.util.*;
public class get_stair_path {
    public static void main(String[] args){
        Scanner scn=new  Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> ans=getStairPaths(n);
        System.out.println(ans);
        scn.close();
    }
    public static ArrayList<String> getStairPaths(int n){
        if(n==0){
            ArrayList<String> base1=new ArrayList<>();
            base1.add("");
            return base1;
        }
        // n<0
        if(n<0){
            ArrayList<String> base2=new ArrayList<>();
            return base2;
        }
        ArrayList<String> path1=getStairPaths(n-1);
        ArrayList<String> path2=getStairPaths(n-2);
        ArrayList<String> path3=getStairPaths(n-3);
        ArrayList<String> myans=new ArrayList<>();
        for(String path:path1){
            myans.add(1+path);
        }
        for(String path:path2){
            myans.add(2+path);

        }
        for(String path:path3){
            myans.add(3+path);
        }
        return myans;
    }
}
