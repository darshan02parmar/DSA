
//1]]Implementation Using Linked List

public class StackImplementation {

    // Node class representing each element in the stack
    static class Node {
        int data; // Data to store
        Node next; // Pointer to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Stack class implementing stack operations
    static class Stack {
        static Node head = null; // Head node representing the top of the stack

        // Check if the stack is empty
        public boolean isEmpty() {
            return head == null;
        }

        // Push operation to add an element to the stack
        public void push(int data) {
            Node newNode = new Node(data); // Create a new node
            if (isEmpty()) {
                head = newNode; // If the stack is empty, the new node becomes the head
            } else {
                newNode.next = head; // Link the new node to the current head
                head = newNode; // Update the head to the new node
            }
        }

        // Pop operation to remove and return the top element of the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow! Unable to pop from an empty stack.");
                return -1; // Return -1 to indicate an error
            }
            int top = head.data; // Store the data of the top element
            head = head.next; // Move the head to the next node
            return top; // Return the popped value
        }

        // Peek operation to view the top element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! No elements to peek.");
                return -1; // Return -1 to indicate an error
            }
            return head.data; // Return the data of the top element
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(); // Create a new stack

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Display and pop elements until the stack is empty
        System.out.println("Stack elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.peek()); // Print the top element
            stack.pop(); // Remove the top element
        }
    }
}


//2] JCF

import java.util.*;

public class JCF {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();

        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);

        // Display and pop elements until the stack is empty
        System.out.println("Stack elements:");
        while (!s.isEmpty()) {
            System.out.println(s.peek()); // Print the top element
            s.pop(); // Remove the top element
        }
    }
}

//3]bottum push
import java.util.*;
public class BottomPush {
    public static void pushAtbottom(Stack<Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtbottom(s,data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtbottom(s,4);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
//4] ReverseString
import java.util.*;
public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while (idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while (!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str="darsh";
        String result=reverseString(str);
        System.out.println(result);
    }
}

