import java.util.Scanner;
public class SLinkedList{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public Node head=null;
    public Node tail=null;

    public void addNode(int data){
        Node newNode =new Node(data);
        if(head==null)
            head =newNode;
        else
            tail.next=newNode;
        tail=newNode;
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

    public void removeNode(int data){
        Node temp=head,prev =null;
        if(temp!=null&& temp.data== data){
            head=temp.next;
            return;
        }
        while(temp!=null&& temp.data!=data){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
            return;    
        if(temp==tail){
            tail=prev;
            tail.next=null;
            return;
        }
        prev.next=temp.next;
    }
    public static void main(String args[]){
        SLinkedList list =new SLinkedList();
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
