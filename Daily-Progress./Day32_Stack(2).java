import java.util.*;
public class ReverseStack {
    public static void pushAtbottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbottom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtbottom(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverseStack(s);
        printStack(s);
    }
}
//2]
import java.util.*;

public class Valid_paretheses {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Opening brackets push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // If stack is empty, return false
                if (s.isEmpty()) {
                    return false;
                }

                char top = s.peek();

                // Check if the top of the stack matches the current closing bracket
                if ((top == '(' && ch == ')') ||
                        (top == '{' && ch == '}') ||
                        (top == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets were properly matched
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String str = "({}[]{)";
        System.out.println(isValid(str)); // Expected output: true
    }
}
