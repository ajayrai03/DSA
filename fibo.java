import java.util.Scanner;

public class fibo {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int fibn=fib(n);
        System.out.println(fibn);
        scn.close();
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);
        int fibon=f1+f2;
        return fibon;

    }
}
/*
 * 
 * n- 0 se start hone wala 0 and 1 se start hone wala 1
 */