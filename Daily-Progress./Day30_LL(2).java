// 5] Zig-Zag LL

public class ZigZag_LL {

    public static class Node {
        int data;
        ZigZag_LL.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ZigZag_LL.Node head;
    public static ZigZag_LL.Node tail;


    public void addLast(int data) {
        ZigZag_LL.Node newNode = new ZigZag_LL.Node(data);

        if (head == null) { // If the list is empty
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode; // Link the current tail to the new node
        tail = newNode; // Update the tail to the new node
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        ZigZag_LL.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Rearrange the linked list in a zig-zag manner
    public void zigzag() {
        // Step 1: Find the middle of the linked list
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow; // Middle node of the linked list

        // Step 2: Reverse the second half of the linked list
        Node curr = mid.next;
        mid.next = null; // Break the list into two halves
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr;      // Move prev to the current node
            curr = next;      // Move curr to the next node
        }

        // Step 3: Alternate merge the two halves (zig-zag merge)
        Node left = head;
        Node right = prev; // Start of the reversed second half
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next; // Store next node of left half
            left.next = right; // Link left node to right node

            nextR = right.next; // Store next node of right half
            right.next = nextL; // Link right node to next node of left half

            // Move to the next nodes in both halves
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String[] args) {
        ZigZag_LL ll = new ZigZag_LL();


        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        ll.zigzag();
        ll.print();

    }
}

//6] Doubly LL
public class DoublyLL {

    // Node class representing an element in the doubly linked list
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head; // Points to the first node of the doubly linked list
    public Node tail; // Points to the last node of the doubly linked list
    public int size; // Size of the doubly linked list

    // Add a node at the beginning of the doubly linked list
    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new node
        size++;

        if (head == null) { // If the list is empty
            head = tail = newNode;
            return;
        }

        newNode.next = head; // Link the new node to the current head
        head.prev = newNode; // Link the current head back to the new node
        head = newNode; // Update the head to the new node
    }

    // Print all elements of the doubly linked list
    public void print() {
        Node temp = head;
        while (temp != null) { // Traverse and print each node's data
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove the first node of the doubly linked list
    public int removeFirst() {
        if (head == null) { // If the list is empty
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }

        int val = head.data; // Store the data of the node to be removed

        if (size == 1) { // If there is only one node
            head = tail = null;
            size--;
            return val;
        }

        head = head.next; // Move the head to the next node
        head.prev = null; // Remove the link to the previous node
        size--;
        return val;
    }

    public void reverse(){

        Node curr=head;
        Node prev=null;
        Node next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    // Main method to test the DoublyLL class
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        // Add nodes to the doubly linked list
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        // Remove the first node
        dll.removeFirst();

        // Print the current state of the doubly linked list
        dll.print();

        //Print reverse LL
        dll.reverse();
        dll.print();

        // Print the size of the doubly linked list
        System.out.println("Size: " + dll.size);
    }
}
//7] JCF (java collection framework
import java.util.LinkedList;

public class JCF {
    public static void main(String[] args) {

        //Create

        LinkedList<Integer> ll=new LinkedList<>();

        //add
        ll.addLast(3);
        ll.addLast(4);
        ll.addFirst(2);
        ll.addFirst(1);

        System.out.println(ll);

        // remove
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }


}
