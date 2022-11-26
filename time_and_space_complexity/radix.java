package time_and_space_complexity;
import java.util.*;
public class radix{

    public static void radixSort(int[] arr){
        // maximum kha tak rukega uska condition
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
            }
        }
        int exp=1;
        while(exp<=max){
            countSort(arr,exp);
            exp=exp*10;
        }
    }
    public static void countSort(int[] arr,int exp){
        // digit of 10 lies between 0 to 9 
        int[] farr=new int[10];
        for(int i=0;i<arr.length;i++)
        {
            farr[arr[i]/exp%10]++;
        }
        // 2 step
        for(int i=1;i<farr.length;i++){
            farr[i]=farr[i]+farr[i-1];
        }
        // 3 step
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int pos=farr[arr[i]/exp%10];
            ans[pos-1]=arr[i];
            farr[arr[i]/exp%10]--;
        }
        // 4. step
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i];
        }
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        radixSort(arr);
        print(arr);
        scn.close();
    }
}