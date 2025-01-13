// 1] check LL is palidrome or not

public class LL_Palindrome {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Method to add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) { // If the list is empty
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode; // Link the current tail to the new node
        tail = newNode; // Update the tail to the new node
    }

    // Method to print the linked list
    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to find the middle of the linked list using the slow-fast pointer approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by one step
            fast = fast.next.next; // Move fast by two steps
        }
        return slow; // Slow will point to the middle node
    }

    // Method to check if the linked list is a palindrome
    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true; // An empty list or single-node list is a palindrome
        }

        // Step 1: Find the middle of the linked list
        Node mid = findMid(head);

        // Step 2: Reverse the second half of the linked list
        Node prev = null;
        Node curr = mid;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: Compare the first half and the reversed second half
        Node left = head;
        Node right = prev; // The head of the reversed second half
        while (right != null) {
            if (left.data != right.data) {
                return false; // Mismatch found
            }
            left = left.next;
            right = right.next;
        }

        // Step 4: (Optional) Restore the original list structure if needed
        // Reverse the second half back to its original order

        return true; // If no mismatch found, the list is a palindrome
    }

    public static void main(String[] args) {
        LL_Palindrome ll = new LL_Palindrome();

        ll.print(); // Print empty list

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);

        ll.print(); // Print the list after adding elements

        if (ll.checkPalindrome()) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }

        ll.print(); // Print the list again (structure is intact)
    }
}

// 2] Find and remove from end 

public class FindAndRemoveFromEnd {
    public static class Node {
        int data;
        FindAndRemoveFromEnd.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static FindAndRemoveFromEnd.Node head;
    public static FindAndRemoveFromEnd.Node tail;

    public void addFirst(int data){

        //step 1 create new node
        FindAndRemoveFromEnd.Node newNode=new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }

        //step 2 --newNode next=head
        newNode.next=head;

        //step 3 - new node=head
        head=newNode;
    }

    public void print(){
        if (head==null){
            System.out.println("LL is empty");
            return;
        }
        FindAndRemoveFromEnd.Node temp=head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthfromEnd(int n){
        int sz=0;
        Node temp=head;

        while (temp != null){
            temp=temp.next;
            sz++;
        }
        if (n==sz){
            head=head.next;
            return;
        }
        //sz-n
        int i=1;
        int iToFind=sz-n;
        Node prev=head;

        while (i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public static void main(String[] args) {
        FindAndRemoveFromEnd ll=new FindAndRemoveFromEnd();


        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

        ll.deleteNthfromEnd(3);
        ll.print();

    }
}

//3] Detect Cycle in LL

public class Detect_Cycle {

    // Node class representing an element in the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // Points to the head of the linked list

    // Method to detect a cycle in the linked list using Floyd's Cycle Detection Algorithm
    public static boolean isCycle() {
        Node slow = head; // Slow pointer moves one step at a time
        Node fast = head; // Fast pointer moves two steps at a time

        // Traverse the list
        while (fast != null && fast.next != null) {
            slow = slow.next;        // Move slow pointer one step
            fast = fast.next.next;  // Move fast pointer two steps

            if (slow == fast) { // If slow and fast meet, a cycle exists
                return true;
            }
        }
        return false; // No cycle found
    }

    public static void main(String[] args) {
        // Create a linked list with a cycle for testing
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head; // Creating a cycle by connecting the last node to the head

        // Check for a cycle in the linked list
        System.out.println(isCycle()); // Output: true (since there is a cycle)
    }
}

//4] Remove  Cycle in LL

import java.rmi.NoSuchObjectException;

public class RemoveCycle {

    public static class Node {
        int data;
        RemoveCycle.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //only use for chech  cycle
    public static boolean isCycle(){
        RemoveCycle.Node slow=head;
        RemoveCycle.Node fast=head;

        while (fast != null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }

    // Remove cycle  part--------->
    public static RemoveCycle.Node head;
    public static void rmvCycle(){

        //step-1 detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow){
                cycle=true;
                break;
            }
        }
        if (cycle=false){
            return;
        }
        //step-2 finding meeting point
        slow=head;
        Node prev=null;
        while (slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        // step-3 remove last node
        prev.next=null;
    }

    public static void main(String[] args) {
        head =new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(isCycle());
        rmvCycle();
        System.out.println(isCycle());
    }
}

