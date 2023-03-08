// write a function to remove duplicates from a linked list

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

    public void removeDuplicates() {
        if (head == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList.insert(4);
        linkedList.insert(4);
        linkedList.insert(2);
        linkedList.insert(1);

        System.out.println("Original linked list:");
        linkedList.display();

        linkedList.removeDuplicates();

        System.out.println("Linked list after removing duplicates:");
        linkedList.display();
    }
}
