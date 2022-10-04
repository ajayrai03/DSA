package recursion.recursion_with_arraylist;
import java.util.*;
public class get_maze_paths {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String> ans=getMazePaths(1,1,n,m);
        System.out.println(ans);
        scn.close();
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr==dr && sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> hpaths=new ArrayList<>();
        ArrayList<String> vpaths=new ArrayList<>();
        ArrayList<String> myans=new ArrayList<>();
        if(sc<dc){
            hpaths=getMazePaths(sr, sc+1, dr, dc);
        }
        if(sr<dr){
            vpaths=getMazePaths(sr+1, sc, dr, dc);
        }
        for(String hpath:hpaths){
            myans.add("h"+hpath);
        }
        for(String vpath:vpaths){
            myans.add("v"+vpath);
        }
        return myans;
    }
}

/*
 * 
 * Sample Input
3
3
Sample Output
[hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
 */