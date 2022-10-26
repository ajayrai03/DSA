import java.util.*;
public class postfix_evaluation_and_conversions {
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        Stack<Integer> vs=new Stack<>();
        Stack<String> ifs=new Stack<>();
        Stack<String> pfs=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        if(ch=='+'|| ch=='-'||ch=='*' ||ch=='/'){
            int v2=vs.pop();
            int v1=vs.pop();
            int val=operation(v1,v2,ch);
            vs.push(val);
            String ifsv2=ifs.pop();
            String ifsv1=ifs.pop();
            String ifsv="("+ifsv1+ch+ifsv2+")";
            ifs.push(ifsv);
            String pfsv2=pfs.pop();
            String psfv1=pfs.pop();
            String pfsv=ch+psfv1+pfsv2;
            pfs.push(pfsv);
        }
        else{
            vs.push(ch-'0');
            ifs.push(ch+"");
            pfs.push(ch+"");
        }
        }
        System.out.println(vs.pop());
        System.out.println(ifs.pop());
        System.out.println(pfs.pop());
        scn.close();
    }
    public static int operation(int v1,int v2,char operator){
        if(operator=='+'){
            return v1+v2;
        }
        else if(operator=='-'){
            return v1-v2;
        }
        else if(operator=='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }
}
/*
Sample Input
264*8/+3-
Sample Output
2
((2+((6*4)/8))-3)
-+2/*6483
 */
