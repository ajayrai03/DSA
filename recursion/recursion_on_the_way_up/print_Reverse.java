package recursion.recursion_on_the_way_up;
import java.util.*;
public class print_Reverse {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str="hello world";
        System.out.println(str);
        printReverse(str);
        scn.close();
    }
public static void printReverse(String str){
    
   for(String part:str.split(" "))
   {
    System.out.print(new StringBuilder(part).reverse().toString());
    System.out.print(" ");

   }
}
}
