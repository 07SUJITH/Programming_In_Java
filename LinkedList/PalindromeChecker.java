// write a function to check if a linked list is palindrome

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
    public boolean isPalindrome() {
        // Find the middle node of the linked list
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        // Reverse the second half of the linked list
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        // Compare the first and second halves of the linked list
        Node p1 = head;
        Node p2 = prev;
        while (p2 != null) {
            if (p1.data != p2.data) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
   


}


public class PalindromeChecker {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        
        list.display(); // prints "1 2 3 2 1 "
        
        boolean isPalindrome = list.isPalindrome();
        System.out.println(isPalindrome); // prints true
    }
}

