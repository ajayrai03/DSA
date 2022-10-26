import java.util.*;
public class infix_evaluation{


    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        Stack<Integer> operand=new Stack<>();
        Stack<Character> operator=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                operator.push(ch);
            }
            else if(Character.isDigit(ch)){
                operand.push(ch-'0');
            }
            else if(ch==')'){
                while(operator.peek()!='('){
                    char oper=operator.pop();
                    int v2=operand.pop();
                    int v1=operand.pop();
                    int opv=operation(v1,v2,oper);
                    operand.push(opv);
                }
                operator.pop();
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                while(operator.size()>0&&operator.peek()!='('&&precedence(ch)<=precedence(operator.peek())){
                    char oper=operator.pop();
                    int v2=operand.pop();
                    int v1=operand.pop();
                    int opv=operation(v1,v2,oper);
                    operand.push(opv);
                }
                operator.push(ch);
            }
        }
        while(operator.size()!=0){
            char oper=operator.pop();
            int v2=operand.pop();
            int v1=operand.pop();
            int opv=operation(v1,v2,oper);
            operand.push(opv);
        }
        System.out.println(operand.peek());
        scn.close();
        
    }
    public static int precedence(char ops){
        if(ops=='+'){
            return 1;
        }
        else if(ops=='-'){
            return 1;
        }
        else if(ops=='*'){
            return 2;
        }
        else {
            return 2;
        }
    }
    public static int operation(int v1,int v2, char oper){
        if(oper=='+'){
            return v1+v2;
        }
        else if(oper=='-'){
            return v1-v2;
        }
        else if(oper=='*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }

    }
}

/*
Sample Input
2 + 6 * 4 / 8 - 3
Sample Output
2
 */