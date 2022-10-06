package recursion.recursion_on_the_way_up;

import java.util.Scanner;

public class print_permutation {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    String str=scn.next();
    printPermutation(str,"");
    scn.close();
    }
    public static void printPermutation(String str,String asf){
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String leftPart=str.substring(0,i);
            String rightPart=str.substring(i+1);
            String ros=leftPart+rightPart;
            printPermutation(ros, asf+ch);
        }
    }
}
/*
 * 
 * input -abc
 * output-
abc
acb
bac
bca
cab
cba
 */