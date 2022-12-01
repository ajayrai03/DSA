package recursion.recursion_on_the_way_up;
import java.util.*;
public class print_stair_path {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    printStairPaths(n,"");  
    scn.close();    
    }
    public static void printStairPaths(int n, String path){
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(path);
            return;
        }
        printStairPaths(n-1, path+"1");
        printStairPaths(n-2, path+"2");
        printStairPaths(n-3, path+"3");
    }
}
/*
 * 
 * Sample Input
3
Sample Output
111
12
21
3
 */
