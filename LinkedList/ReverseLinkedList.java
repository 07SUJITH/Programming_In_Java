import java.util.Scanner;

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

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode != null && currentNode.data != data) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Node not found!");
        } else {
            prevNode.next = currentNode.next;
        }
    }

    public void reverse() {
        Node prevNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        head = prevNode;
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
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Reverse");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter node data: ");
                    int data = scanner.nextInt();
                    linkedList.insert(data);
                    linkedList.display();
                    break;
                case 2:
                    System.out.print("Enter node data: ");
                    data = scanner.nextInt();
                    linkedList.delete(data);
                    linkedList.display();
                    break;
                case 3:
                    linkedList.reverse();
                    linkedList.display();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

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