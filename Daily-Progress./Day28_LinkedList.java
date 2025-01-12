public class LinkedList {

    // Node class representing an element in the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // Points to the first node of the linked list
    public static Node tail; // Points to the last node of the linked list
    public static int size;  // Tracks the size of the linked list

    // Add a node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data); // Step 1: Create a new node
        size++;
        if (head == null) { // If the list is empty, set head and tail to the new node
            head = tail = newNode;
            return;
        }
        newNode.next = head; // Step 2: Link newNode to the current head
        head = newNode;      // Step 3: Update head to the newNode
    }

    // Add a node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data); // Step 1: Create a new node
        size++;
        if (tail == null) { // If the list is empty, set head and tail to the new node
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // Step 2: Link the last node to the new node
        tail = newNode;      // Step 3: Update tail to the new node
    }

    // Print all elements of the linked list
    public void print() {
        if (head == null) { // If the list is empty
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) { // Traverse and print each node's data
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add a node at a specific index
    public void addMid(int idx, int data) {
        if (idx == 0) { // Adding at the beginning
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) { // Traverse to the (idx-1)th node
            temp = temp.next;
        }
        newNode.next = temp.next; // Link newNode to the next node
        temp.next = newNode;      // Link the (idx-1)th node to the newNode
    }

    // Remove the first node and return its value
    public int removeFirst() {
        if (size == 0) { // If the list is empty
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // If the list has only one node
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data; // Store the value to be returned
        head = head.next;    // Update head to the next node
        size--;
        return val;
    }

    // Remove the last node and return its value
    public int removeLast() {
        if (size == 0) { // If the list is empty
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) { // If the list has only one node
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) { // Traverse to the second last node
            prev = prev.next;
        }
        int val = prev.next.data; // Store the value to be returned
        prev.next = null;         // Remove the last node
        tail = prev;              // Update tail to the second last node
        size--;
        return val;
    }

    // Search for a value iteratively and return its index
    public int itrSearch(int key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) { // If the key is found
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; // Key not found
    }

    // Helper method for recursive search
    public int helper(Node head, int key) {
        if (head == null) { // Base case: End of list
            return -1;
        }
        if (head.data == key) { // If the key is found
            return 0;
        }
        int idx = helper(head.next, key); // Recursive call
        return (idx == -1) ? -1 : idx + 1; // Update index if key is found
    }

    // Search for a value recursively and return its index
    public int recSearch(int key) {
        return helper(head, key);
    }

    // Reverse the linked list
    public void reverseLL() {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr;      // Move prev to the current node
            curr = next;      // Move curr to the next node
        }
        head = prev; // Update head to the new starting node
    }

    // Main method to test the LinkedList class
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

        ll.addMid(2, 9);
        ll.print();

        ll.reverseLL();
        System.out.println("Reversed Linked List: ");
        ll.print();

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println("Index found at (Iterative): " + ll.itrSearch(3));
        System.out.println("Index found at (Recursive): " + ll.recSearch(3));

        System.out.println("Size of the linked list: " + ll.size);
    }
}
