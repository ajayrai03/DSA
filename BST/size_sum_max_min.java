package BST;
import java.util.*;
public class size_sum_max_min {
  public static class Node{
    int data;
    Node left;
    Node right;
    Node(int data,Node left,Node right){
        this.data=data;
        this.left=left;
        this.right=right;
    }
  }   
  public static Node construct(int[] arr,int lo,int hi){
    if(lo>hi){
        return null;
    }
    int mid=(lo+hi)/2;
    int data=arr[mid];
    Node lc=construct(arr,lo,mid-1);
    Node rc=construct(arr,mid+1,hi);
    Node node=new Node(data,lc,rc);
    return node;
  }
  public static int sum(Node node){
    if(node==null){
        return 0;
    }
    int leftsum=sum(node.left);
    int rightsum=sum(node.right);
    int myans=leftsum+rightsum+node.data;
    return myans;
  }
  public static int size(Node node){
    if(node==null){
        return 0;
    }
    int leftsize=size(node.left);
    int rightsize=size(node.right);
    int myans=leftsize+rightsize+1;
    return myans;
  }
  public static int max(Node node){
 // max will be on the right side in bst
    if(node.right!=null){
        return max(node.right);
    }
    else{
        return node.data;
    }
  }
  public static int min(Node node){

    if(node.left!=null){
        return min(node.left);
    }
    else{
        return node.data;
    }
  }
  public static boolean find(Node node, int data){
// base case
    if(node==null){
        return false;
    }
    if(data>node.data){
        return find(node.right,data);
    }
    else if(data<node.data){
        return find(node.left,data);
    }
    else{
        return true;
    }
  }
  
public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=scn.nextInt();
    }
    Node root=construct(arr,0,arr.length-1);
    System.out.println(sum(root));
    System.out.println(size(root));
    System.out.println(max(root));
    System.out.println(min(root));
    System.out.println(find(root,75));
    scn.close();
}
}
