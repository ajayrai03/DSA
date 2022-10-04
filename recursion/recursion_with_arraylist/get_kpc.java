package recursion.recursion_with_arraylist;
import java.util.*;
public class get_kpc {
    public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    String str=scn.next();
    ArrayList<String> ans=getKPC(str);
    System.out.println(ans);
    scn.close();
}
static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
public static ArrayList<String> getKPC(String str) {
        
    if(str.length()==0){
        ArrayList<String> base=new ArrayList<>();
        base.add("");
        return base;
    }
    char ch=str.charAt(0);
    String ros=str.substring(1);
    ArrayList<String> rem=getKPC(ros);
    ArrayList<String> myans=new ArrayList<>();
    String code=codes[ch-'0'];
    for(int i=0;i<code.length();i++){
        char c=code.charAt(i);
        for(String rr:rem){
            myans.add(c+rr);
        }
    }
    return myans;
    
}
}