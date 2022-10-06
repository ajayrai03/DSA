package recursion.recursion_on_the_way_up;
import java.util.*;
public class print_maze_path_with_jumps {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        printMazePaths(1,1,n,m,"");
        scn.close();
    }
    // psf=path so far
    public static void printMazePaths(int sr,int sc, int dr, int dc, String psf){
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        // horizontal
        for(int ms=1;ms<=dc-sc;ms++){
            printMazePaths(sr, sc+ms, dr, dc, psf+"h"+ms);
        }
        // vertical
        for(int ms=1;ms<=dr-sr;ms++){
            printMazePaths(sr+ms, sc, dr, dc, psf+"v"+ms);
        }
        // diagonal
        for(int ms=1;ms<=dr-sr&&ms<=dc-sc;ms++){
            printMazePaths(sr+ms, sc+ms, dr, dc, psf+"d"+ms);
        }
    }
}
