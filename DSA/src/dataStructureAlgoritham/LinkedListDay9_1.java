package dataStructureAlgoritham;

public class LinkedListDay9_1 {

	Node head;
	static class Node{
		int data;
		Node next;//next means link
		
		Node (int d){
			data =d;
			next = null;
		}
	}
	
	
	public static void main(String[] args) {
		
		 LinkedListDay9_1 L1 = new  LinkedListDay9_1();
		 L1.head=new Node(5);
		 Node second = new Node(7);
		 Node third = new Node(8);
		 
		 L1.head.next=second;
		 second.next=third; 

	}

}
