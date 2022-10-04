package recursion.recursion_with_arraylist;
import java.util.*;
public class get_maze_path_with_jumps {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int m=scn.nextInt();
    ArrayList<String> ans=getMazePaths(1,1,n,m);
    System.out.println(ans);
        scn.close();
}
public static ArrayList<String> getMazePaths(int sr,int sc, int dr,int dc){
    if(sr==dr && sc==dc){
        ArrayList<String> base=new ArrayList<>();
        base.add("");
        return base;
    }
    ArrayList<String> myans=new ArrayList<>();
    // hpath,ms=move size
    for(int ms=1;ms<=dc-sc;ms++){
        ArrayList<String> hpaths=getMazePaths(sr, sc+ms, dr, dc);
        for(String hpath:hpaths){
            myans.add("h"+ms+hpath);
        }
    }
    // vpath
    for(int ms=1;ms<=dr-sr;ms++){
        ArrayList<String> vpaths=getMazePaths(sr+ms, sc, dr, dc);
        for(String vpath:vpaths){
            myans.add("v"+ms+vpath);
        }
    }
    // diagonal
    for(int ms=1;ms<=dr-sr&&ms<=dc-sc;ms++){
        ArrayList<String> dpaths=getMazePaths(sr+ms, sc+ms, dr, dc);
        for(String dpath:dpaths){
            myans.add("d"+ms+dpath);
        }
    }
    return myans;
}
}

/*
 * 
 * Sample Input
2
2
Sample Output
[h1v1, v1h1, d1]
 */