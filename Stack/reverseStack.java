import java.util.Stack;

public class reverseStack {

    public static void pushElementAtBottom(Stack<Integer>s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushElementAtBottom(s, data);
        s.push(top);
    }

    public static void reverseStack1(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }

        int top = s.pop();
        reverseStack1(s);
        pushElementAtBottom(s, top);
    }

    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        reverseStack1(s);
        System.out.println(s);
        printStack(s);

    }
}
