/*
 Write a Java program for the following: **
1) Create a doubly linked list of elements.
2) Delete a given element from the above list.
3) Display the contents of the list after deletion. 
 */

import java.util.Scanner;

public class DoublyLinkedList {

    class Node {
        int data;

        Node(int data) {
            this.data = data;
        }

        Node next = null;
        Node prev = null;

    }

    Node head = null;
    Node tail = null;

    void insertNode(int data) {
        if (head == null) {
            head = new Node(data);
            tail = head;
        } else {
            Node newNode = new Node(data);
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void display() {
        if (head == null)
            System.out.println("list empty");
        else {
            Node temp = head;
            System.out.print("list :");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    void deleteNode(int key) {
        if (head == null)
            return;
        Node temp = head;
        if (head.data == key) {
            if (head.next == null)
                head = tail = null;
            else {
                head = head.next;
                head.prev = null;
            }
            return;
        } else if (tail.data == key) {
            tail = tail.prev;
            tail.next = null;
            return;
        }
        while (temp.data != key && temp.next != null) {
            temp = temp.next;
        }
        if (temp.next == null)
            System.out.println(key + " not found in the list ");
        else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1 for INSERT");
            System.out.println("2 for DELETE");
            System.out.println("3 FOR EXIT ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("enter the number :");
                    list.insertNode(sc.nextInt());
                    list.display();
                    break;
                case 2:
                    System.out.println("enter the data to be delete :");
                    list.deleteNode(sc.nextInt());
                    list.display();
                    break;
                case 3:
                    flag = false;
            }
        } while (flag);
    }

}
