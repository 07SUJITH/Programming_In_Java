import java.util.Scanner;

//write a function to find the nth node from the end of a linked list

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
    // function to find the nth node from the end of a linked list
    public void nthNodeFromLast(int n){
        if(n>nodeCount)
            System.out.println("invalid position");
        else{
            int nFromFront = nodeCount - n + 1;
            Node current = head;
            int move = 1;
            while(move < nFromFront){
                current = current.next;
                move++;
            }
                
            System.out.println(  n+"th node from last :" +current.data);
        }

    }


}

public class NthNodeFromLast{
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

        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        list.nthNodeFromLast(n);
    }
}