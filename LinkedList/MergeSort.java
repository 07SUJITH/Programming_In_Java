import java.util.Scanner;

// write a function to sort a linked list using merge sort


class Node{
    int data;
    Node next;
    Node(int data){
        this.data =data;
        next =null;
    }
}

class LinkedList{
    int nodeCount;
    Node head;
    LinkedList(){
        head = null;
        nodeCount =0;
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null)
            head = newNode;
        else{
            Node current = head;
            while(current.next !=null)
                current = current.next;
            current.next = newNode;
        }
        nodeCount++;
    }

    public void display(){
        if(head==null)
            System.out.println("List is empty");
        else{
            Node current = head;
            while(current!=null){
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
        System.out.println();
    }
    
    public void mergesort(){



        // code
    }


}

public class MergeSort  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);

        list.display();
        list.mergesort();
        list.display();
        
    }
}