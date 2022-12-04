import java.util.*;
public class pal {

    public static boolean isPalindrome(String str, int low, int high){
        while(low<high){
            if(str.charAt(low)!=str.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static int makePalindrome(String str){

        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)==str.charAt(right)){
                left++;
                right--;
            }
            else{
                if(isPalindrome(str,left+1,right))
                return left;

                if(isPalindrome(str,left,right-1))
                return right;

            return -1;
            }
        }
        return -2;
    }
    
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int idx=makePalindrome(str);
        if(idx==-1){
            System.out.println("not possible by removing one character to make palindrome");
        }
        else if(idx==-2){
            System.out.println("possible without removing any character");
        }
        else{
            System.out.println("possible by removing character at "+idx);
        }
        scn.close();
    }
}
