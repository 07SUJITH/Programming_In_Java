class Node {
    int val;
    Node next;
    Node(int x) { val = x; }
}

 class LinkedList {
    Node head;
    
    public void insert(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }
    
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    public Node findNthFromEnd(int n) {
        Node fast = head;
        Node slow = head;

        // Move fast pointer n nodes ahead of slow pointer
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null; // n is greater than the length of the linked list
            }
            fast = fast.next;
        }

        // Move both pointers until fast pointer reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
public class FindNthFromEnd{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        
        list.display(); // prints "1 2 3 4 5 "
        
        Node node = list.findNthFromEnd(2);
        System.out.println(node.val); // prints 4
    }
}
   

