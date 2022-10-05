package recursion.recursion_on_the_way_up;

import java.util.Scanner;

public class print_kpc {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        printKPC(str,"");
        scn.close();
    }
    static String[] codes={".;","abc","def","ghi","jkl","mnop","pqrs","tu","vwx","yz"};
    public static void printKPC(String que,String ans)
    {   if(que.length()==0){
        System.out.println(ans);
        return;
    }
        char ch=que.charAt(0);
        String ros=que.substring(1);
        String code=codes[ch-'0'];
        for(int i=0;i<code.length();i++){
            char codech=code.charAt(i);
            printKPC(ros, ans+codech);
        }
    }
}
/*
 * 
 * Sample Input
78
Sample Output
tv
tw
tx
uv
uw
ux
 */