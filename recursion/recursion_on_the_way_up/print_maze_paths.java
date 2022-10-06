package recursion.recursion_on_the_way_up;
import java.util.*;
public class print_maze_paths {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        printMazePaths(1,1,n,m,"");
        scn.close();
    }
    // psf-path so far, sr-source row,sc-source column,dc-destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf){

        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        // horizontal
        printMazePaths(sr, sc+1, dr, dc, psf+"h");
        printMazePaths(sr+1, sc, dr, dc, psf+"v");
    }
}

/*
 * 
 * 
 * Sample Input
2
2
Sample Output
hv
vh
 */