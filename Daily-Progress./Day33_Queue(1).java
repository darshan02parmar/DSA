//1]Creat_using_arrays
public class Creat_using_arrays {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        // add
        public static void add(int data){
            if (rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }

        //remove
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }

        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}

//2] Circular_using_array
public class Circular_using_array {

    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;


        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }

        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }

        // add
        public static void add(int data){
            if (isFull()){
                System.out.println("Queue is full");
                return;
            }
            //adding first element
            if (front==-1){
                front=0;
            }

            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result=arr[front];
            if (rear==front){
                rear=front=-1;
            }else {
                front=(front+1)%size;
            }
            return result;
        }

        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Creat_using_arrays.Queue q=new Creat_using_arrays.Queue(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
//3]Queue_LL
public class Queue_LL {
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }

        //add
        public static void add(int data){
            Node newNode=new Node(data);
            if (head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        //remove
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front= head.data;
            if (tail==head){
                tail=head=null;
            }else {
                head=head.next;
            }
            return front;
        }
        //peek
        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
//4]Queue_2Stacks 
import java.util.*;
public class Queue_2Stacks {
    static class Queue{
        static Stack<Integer> s1=new Stack<>();
        static Stack<Integer> s2=new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add--O(n)
        public static void add(int data){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        // remove--0(1)
        public static int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        //peek--o(1)

        public static int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
//5]InterleaveTwoHalves
import java.util.*;

public class InterleaveTwoHalves {
    public static void interleave(Queue<Integer> q) {
        int size = q.size();

        // If the queue size is odd, interleaving won't work properly
        if (size % 2 != 0) {
            System.out.println("Queue size must be even to interleave properly.");
            return;
        }

        Queue<Integer> firstHalf = new LinkedList<>();

        // Move first half of the elements into firstHalf queue
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }

        // Interleave elements from firstHalf and the remaining elements in q
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // Add from first half
            q.add(q.remove()); // Add from second half (original queue)
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adding 10 elements (even count)
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        interleave(q);

        // Print the interleaved queue
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
