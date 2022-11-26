package time_and_space_complexity;

import java.util.*;
public class merge_sort{
    public static int[] mergeSort(int[] a1,int lo,int hi){
        if(lo==hi){
            int[] newArray=new int[1];
            newArray[0]=a1[lo];
            return newArray;
        }
        int mid=(lo+hi)/2;
        int[] fsh=mergeSort(a1,lo,mid);
        int[] ssh=mergeSort(a1,mid+1,hi);
        int[] fsa=mergeTwoSortedArray(fsh,ssh);
        return fsa;
    }
    public static int[] mergeTwoSortedArray(int[] fsh,int[] ssh){
        int i=0;
        int j=0;
        int k=0;
        int[] res=new int[fsh.length+ssh.length];
        while(i<fsh.length&&j<ssh.length){
            if(fsh[i]<=ssh[j]){
                res[k]=fsh[i];
                i++;
                k++;
            }
            else{
                res[k]=ssh[j];
                j++;
                k++;
            }
        }
        while(i<fsh.length){
            res[k]=fsh[i];
            i++;
            k++;
        }
        while(j<ssh.length){
            res[k]=ssh[j];
            j++;
            k++;
        }
        return res;
    }
  public static void print(int[] merge){
    for(int i=0;i<merge.length;i++){
        System.out.print(merge[i]+" ");
    }
    System.out.println();
  }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] a1=new int[n];
        for(int i=0;i<a1.length;i++){
            a1[i]=scn.nextInt();
        }
        
        int[] merge=mergeSort(a1,0,a1.length-1);
        print(merge);
        scn.close();

    }
}