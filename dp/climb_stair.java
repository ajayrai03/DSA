package dp;

import java.util.Scanner;

public class climb_stair {
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] dp=new int[n+1];
        int cs=climb_s(n,dp);
        System.out.println(cs);
        scn.close();
    }
    public static int climb_s(int n,int[] dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(dp[n]>0){
            return dp[n];
        }
        int ans=climb_s(n-1, dp)+climb_s(n-2, dp)+climb_s(n-3, dp);
        return dp[n]=ans;
    }
}
