//1] Queue_Revesal 
import java.util.*;
public class Queue_Revesal {
    public static void reverse(Queue<Integer> q){

        Stack<Integer> s=new Stack<>();

        while (!q.isEmpty()){
            s.add(q.remove());
        }
        while (!s.isEmpty()){
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse(q);
        while (!q.isEmpty()){
            System.out.println(q.remove());

        }
        System.out.println();
    }
}

//2] Deque in JCF
import java.util.*;
public class Deque_JCF {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.print(deque+" ");
        System.out.println("first element: "+deque.getFirst());
        System.out.println("last element: "+deque.getLast());
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

    }

}

// IMplement Stack using Deque 
import java.util.*;
public class Stack_using_Deque {
    static class Stack{
        Deque<Integer> deque=new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.peekLast();
        }
    }

    public static void main(String[] args) {
        Stack s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek:"+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
//3]Queue_using_Deque

import java.util.*;

public class Queue_using_Deque {
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.peekFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek:" + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
