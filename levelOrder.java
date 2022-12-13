import java.util.*;
public class levelOrder {
   
    public static class Node{
        int data;
        ArrayList<Node> children;
        Node(int data){
            this.data=data;
            children=new ArrayList<>();
        }
    }
    public static Node construct(int[] arr){
        Node root=new Node(arr[0]);
        Stack<Node> st=new Stack<>();
        st.push(root);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==-1){
                st.pop();
            }
            else{
                Node nn=new Node(arr[i]);
                st.peek().children.add(nn);
                st.push(nn);
            }
        }
        return root;
    }
    public static void levelorder(Node node){
        Queue<Node> que=new ArrayDeque<>();
        que.add(node);
        while(que.size()>0){
            Node nn=que.remove();
            System.out.print(nn.data+" ");
            for(Node child:nn.children){
                que.add(child);
            }
        }
        System.out.println(".");
    }
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
           arr[i]=scn.nextInt(); 
        }
        Node root=construct(arr);
        levelorder(root);
        scn.close();
    }
}
