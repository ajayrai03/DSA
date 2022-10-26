/*
 * 1. You are given an infix expression.
2. You are required to convert it to postfix and print it.
3. You are required to convert it to prefix and print it.
 */

import java.util.*;
public class infix_conversion {
   
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        Stack<String> postfix=new Stack<>();
        Stack<String> prefix=new Stack<>();
        Stack<Character> ops=new Stack<>(); // operator stack-(,),+
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                ops.push(ch);
            }
            else if((ch>='0' &&ch<='9')||(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                postfix.push(ch+"");
                prefix.push(ch+"");

            }
            else if(ch==')'){
                while(ops.peek()!='('){
                    char oper=ops.pop();
                    String postv2=postfix.pop();
                    String postv1=postfix.pop();
                    String postv=postv1+postv2+oper;
                    postfix.push(postv);
                    String prev2=prefix.pop();
                    String prev1=prefix.pop();
                    String prev=oper+prev1+prev2;
                    prefix.push(prev);
                }
                ops.pop();
            }
            else if(ch=='+' || ch=='-' ||ch=='*' ||ch=='/'){
                while(ops.size()>0&&ops.peek()!='('&&precedence(ch)<=precedence(ops.peek())){
                    char oper=ops.pop();
                    String postv2=postfix.pop();
                    String postv1=postfix.pop();
                    String postv=postv1+postv2+oper;
                    postfix.push(postv);
                    String prev2=prefix.pop();
                    String prev1=prefix.pop();
                    String prev=oper+prev1+prev2;
                    prefix.push(prev);
                }
                ops.push(ch);
            }
        }
        while(ops.size()!=0){
            char oper=ops.pop();
            String postv2=postfix.pop();
            String postv1=postfix.pop();
            String postv=postv1+postv2+oper;
            postfix.push(postv);
            String prev2=prefix.pop();
            String prev1=prefix.pop();
            String prev=oper+prev1+prev2;
            prefix.push(prev);
        }
        System.out.println(postfix.pop());
        System.out.println(prefix.pop());
        scn.close();
    }
    public static int precedence(char operator){
        if(operator=='+'|| operator=='-'){
            return 1;
        }
        else if(operator=='*' || operator=='/'){
            return 2;
        }
        else{
            return 0;
        }
    }
}

/*
 * Sample Input
a*(b-c+d)/e
Sample Output
abc-d+*e/
/*a+-bcde
 */