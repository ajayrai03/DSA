import java.util.*;
public class Quic {
    public static void quickSort(int[] arr,int lo,int hi){
        // base case
        if(lo>hi){
            return;
        }
        
        int pivot=arr[hi];
        int pi=partition(arr,pivot,lo,hi);
        quickSort(arr, lo, pi-1);
        quickSort(arr, pi+1, hi);
    }
    public static int partition(int[] arr,int pivot,int lo,int hi){
        int i=lo;
        int j=lo;
        while(i<=hi){
            if(arr[i]>pivot){
                i++;
            }
            else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return (j-1);
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
        quickSort(arr,0,arr.length-1);
        print(arr);
        scn.close();
    }
}
