
// write a function to find the middle node of a linked list

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public Node findMiddle() {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    /*
     * The slow pointer moves one node at a time, while the fast pointer moves two
     * nodes at a time. When the fast pointer reaches the end of the list, the slow
     * pointer will be pointing to the middle node of the list.
     */
}

public class MiddleNode {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(7);

        linkedList.display();
        Node middleNode = linkedList.findMiddle();
        if (middleNode == null) {
            System.out.println("List is empty!");
        } else {
            System.out.println("Middle node: " + middleNode.data);
        }
    }
}
