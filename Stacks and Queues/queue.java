import java.util.*;
public class queue{
public static void main(String[] args){
    Queue<Integer> que=new ArrayDeque<>();
    que.add(20);
    System.out.println(que);
    que.add(30);
    System.out.println(que);
    que.remove();
    System.out.println(que);
    que.add(40);
    System.out.println(que.peek());
    System.out.println(que);
    System.out.println(que.size());
}
}