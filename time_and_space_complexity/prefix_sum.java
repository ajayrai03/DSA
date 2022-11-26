package time_and_space_complexity;

public class prefix_sum {
    
    public static void main(String[] ars){
        int[] arr={7,-2,4,1,3};
        int[] preSum=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            preSum[i]=arr[i];
        }
        for(int i=1;i<arr.length;i++){
            preSum[i]=preSum[i]+preSum[i-1];
        }
        // print
        for(int i=0;i<preSum.length;i++){
            System.out.print(preSum[i]+" ");
        }
    } 
}
