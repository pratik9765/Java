import java.util.*;

public class implementationStack {

    public static class stack{
        public static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static void pop(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return;
            }
            list.remove(list.size()-1);
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty!");
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        s.peek();
        s.pop();

        while(!s.empty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }

        // s.peek();
        // s.pop();
    }  
}
