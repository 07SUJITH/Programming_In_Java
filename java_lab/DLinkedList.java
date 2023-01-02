import java.util.Scanner;
public class DLinkedList{
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
    public Node head;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null)
            head=newNode;
        else{
            Node temp =head;
            while(temp.next!=null) 
                temp=temp.next;
 
            temp.next=newNode;
            newNode.prev=temp;
        }
    }
    public void removeNode(int data){
        if(head==null){
            System.out.println("List empty");
            return;
        }
        if(head.data==data){
            if(head.next!=null)
                head.next.prev=null;
            head=head.next;
            return;
        }
        Node temp =head;
        while(temp!=null){
            if(temp.data==data)
                break;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("data not found");
            return;
        }
        if(temp.next!=null)
            temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
    }

    public void display(){
        if(head==null){
            System.out.println("Empty List ");
            return;
        }
        Node temp=head;
        System.out.print("List :");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        DLinkedList list =new DLinkedList();
        while(true){
            System.out.println("\nEnter \n1. add Node\n2 remove Node\n3 exit");
            Scanner sc =new Scanner(System.in);
            char ch= sc.nextLine().charAt(0);
            switch(ch){
                case '1': System.out.print("enter the data :");
                          list.addNode(sc.nextInt());
                          list.display();
                          break;
                case '2':System.out.print("enter the data to be delete:");
                        list.removeNode(sc.nextInt());
                        list.display();
                        break;
                case'3': return;
            }
        }
    }
}
 
/* 
1.  The DLinkedList class has a nested Node class 
    that represents a node in the linked list. 
    Each node has three fields: data, prev, and next.
2.  The DLinkedList class has three fields: head, which is a reference to
    the first node in the list, and addNode() and removeNode() methods
3.  The addNode() method creates a new node with the given data and 
    adds it to the end of the list.
    If the list is empty, the new node becomes the head of the list. 
    Otherwise, the new node is added after the last node in the list.
4.  4.1 The method checks if the list is empty. If it is, it prints a message and returns.
    4.2 If the head of the list has the given data . then updates the prev reference of the 
        next node (if it exists) to be null,and sets the head of the list to be the next node.
    4.3 else the method starts a loop that iterates over the nodes. It uses a temporary Node 
        variable temp to store a reference to the current node.
    4.4 The loop continues until temp becomes null.
        On each iteration, it checks if the current node has the given data then the loop breaks. else sets temp to be the next node in the list.
    4.5 If the loop completes without finding a node with the given data value, it prints a message and returns.
    4.6 If the loop finds a node with the given data value, it updates the prev reference of
    the next node (if it exists) to be the prev reference of the current node, 
    and updates the next reference of the previous node to be the next reference of the current node. 
5.  The display() method prints out the data values of all the nodes in the list.
    
*/
