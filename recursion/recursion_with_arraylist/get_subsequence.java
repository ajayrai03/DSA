package recursion.recursion_with_arraylist;
import java.util.*;
public class get_subsequence{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> ans=gss(str);
        System.out.println(ans);
        scn.close();
    }
    public static ArrayList<String> gss(String str){
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String rem=str.substring(1);
        ArrayList<String> ros=gss(rem);
        ArrayList<String> myans=new ArrayList<>();
        for(String rstr:ros){
            myans.add(""+rstr);
        }
        for(String rstr:ros){
            myans.add(ch+rstr);
        }
        return myans;
    }
}