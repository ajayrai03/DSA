package recursion.recursion_on_the_way_up;
import java.util.Scanner;

public class print_subsequence {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printSS(str,"");
        scn.close();
    }
    public static void printSS(String que,String ans){
        if(que.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=que.charAt(0);
        String ros=que.substring(1);
        printSS(ros, ans+ch);
        printSS(ros, ans+"");
    }
}

/*
 * 
 * Sample Input
yvTA

Sample Output
yvTA
yvT
yvA
yv
yTA
yT
yA
y
vTA
vT
vA
v
TA
T
A


 */
