piblic class LinkedList{

	class Node{
		int data;
		Node prev;
		Node next;
		public Node(int data){
			this.data=data;
		}
	}
	Node head,tail=null;
	
	public void insert(int data){
		Node newNode = new Node(data);
	 	if(head==null){
	 	head=tail=newNode;
	 	head.prev=null;
	 	tail.next=null;
	 	}
	 	else{
	 	tail.next=newNode;
	 	newNode.prev=tail;
	 	tail=newNode;
	 	tail.next=null;
	 	}
	}	
	public void display(){
	Node current=head;
	if(head==null){
		System.out.println("List is Empty");
		return;
	}
	System.out.print("list content :");
	while(current!=null){
		System.out.print(current.data+" ");
		current =current.next;
	}
	}
	public void delete(int data){
		if(head==null){
		System.out.println("List empty deletion failed! ");
		return;
		}
		Node current = head;
		while(current.next!=null && current.data!=data)
			current =current.next;
		if(current.data==data){
			current.prev.next=current.next;
			current.next.prev=current.prev;
		}
		else{
		System.out.println("data not found.\ndeletion failed");
		}
	
        }
}
class  TestdoublyLinkedList{
	public static void main(String[] args){
	LinkedList dlist = new LinkedList();
	Scanner sc =new Scanner(System.in);
	int choice;
	while(choice!=3){
	System.out.println("1. insert at end \n2. delete given data\n3. exit");
	System.out.print("Enter the data :");
	 chioce = sc.nextInt();
	 switch(choice){
	 case 1 : System.out.print("Enter the number to insert :");
	 	int data= sc.nextInt();
	 	list.insert(data);
	 	System.out.println("Data inserted successfully");
	 	list.display();
	 	break;
	 case 2 :System.out.print("Enter data to delete :");
	 	data=sc.nextInt();
	 	list.delete(data);
	 	list.display();
	 	break;
	 default : System.out.println("invalid input");
	 }
	}
	
	}
}
