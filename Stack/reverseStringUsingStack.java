import java.util.*;
public class reverseStringUsingStack {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int index = 0;

        while(index < str.length()){
            s.push(str.charAt(index));
            index++;
        }

        StringBuilder ans = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            ans.append(curr);
        }

        return ans.toString();
    }


    public static void main(String args[]){
        String str = "HellowWorld";
        System.out.println(reverseString(str)); 
    }
}
