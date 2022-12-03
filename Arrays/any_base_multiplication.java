package Arrays;
import java.util.*;
public class any_base_multiplication{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int b=scn.nextInt();
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int dn=getProduct(b,n1,n2);
        System.out.println(dn);
        scn.close();
    }
    public static int getProduct(int b,int n1,int n2){

        int rv=0,p=1;
        while(n2>0){
            int d2=n2%10;
            n2=n2/10;
            int sprd=s_prd(b,n1,d2);
            rv=sum(b,rv,sprd*p);
            p=p*10;
        }
        return rv;
    }
    public static int s_prd(int b,int n1,int d2){
        int rv=0,c=0,p=1;
        while(n1>0||c>0){
            int d1=n1%10;
            n1=n1/10;
            int d=d1*d2+c;
            c=d/b;
            d=d%b;
            rv+=d*p;
            p=p*10;
        }
        return rv;
    }
    public static int sum(int b,int n1,int n2){
        int rv=0,c=0,p=1;
        while(n1>0||n2>0||c>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=d1+d2+c;
            c=d/b;
            d=d%b;
            rv+=d*p;
            p=p*10;
        }
        return rv;
    }
}