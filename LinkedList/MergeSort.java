import java.util.Scanner;

// write a function to sort a linked list using merge sort

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    int nodeCount;
    Node head;

    LinkedList() {
        head = null;
        nodeCount = 0;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
        nodeCount++;
    }

    public void display() {
        if (head == null)
            System.out.println("List is empty");
        else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.println();
    }

    public Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node middle = getMiddle(node);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        Node left = mergeSort(node);
        Node right = mergeSort(nextOfMiddle);
        return merge(left, right);
    }

    private Node merge(Node left, Node right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left.data < right.data) {
            left.next = merge(left.next, right);
            return left;
        } else {
            right.next = merge(left, right.next);
            return right;
        }
    }

    private Node getMiddle(Node node) {
        if (node == null) {
            return node;
        }
        Node slow = node;
        Node fast = node.next;
        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
}

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(2);
        list.insert(1);
        list.insert(3);
        list.insert(10);
        list.insert(9);
        list.insert(4);

        list.display();
        Node sorted = list.mergeSort(list.head);
        LinkedList sortedList = new LinkedList();
        sortedList.head = sorted;

        System.out.println("Sorted list:");
        sortedList.display();

    }
}