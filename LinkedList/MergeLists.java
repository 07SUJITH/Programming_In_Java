// write a function to merge two sorted linked list
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

    public static Node mergeLists(Node head1, Node head2) {
        Node mergedHead = new Node(0); // Create a dummy head node
        Node tail = mergedHead;

        // Merge the two lists by comparing their nodes
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }

        // Add any remaining nodes from the first list
        while (head1 != null) {
            tail.next = head1;
            head1 = head1.next;
            tail = tail.next;
        }

        // Add any remaining nodes from the second list
        while (head2 != null) {
            tail.next = head2;
            head2 = head2.next;
            tail = tail.next;
        }

        return mergedHead.next; // Return the merged list (excluding the dummy head node)
    }
}

public class MergeLists {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.insert(1);
        list1.insert(5);
        list1.insert(10);

        LinkedList list2 = new LinkedList();
        list2.insert(2);
        list2.insert(6);
        list2.insert(11);

        System.out.println("List 1:");
        list1.display();

        System.out.println("List 2:");
        list2.display();

        Node mergedList = LinkedList.mergeLists(list1.head, list2.head);

        System.out.println("Merged list:");
        LinkedList mergedLinkedList = new LinkedList();
        mergedLinkedList.head = mergedList;
        mergedLinkedList.display();
    }
}
