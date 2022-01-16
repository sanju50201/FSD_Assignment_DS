package practicepackage;
class Node{
	public String data;
	public Node next;
	public void printData(){
		System.out.println(data);
	}
}
class SingleLinkedList{
	public Node head;
	public boolean isEmpty(){
//		Checking whether it is empty
		return(head==null);
	}
	public void insertFirst(String data) {
//		Creating a new Node
		Node exampleNode = new Node();
//		Storing the data to the new node
		exampleNode.data = data;
//		Assigning the next node to the head
		exampleNode.next= head; 
//		New node as the head
		head = exampleNode;
	}
	public void deleteFirst() {
//		Deleting the first node 
		head = head.next;
	}
	public void insertLast(String data) {
//		Inserting the element in last
		Node exampleNode = new Node();
		exampleNode.next = null;
		exampleNode.data = data;
//		Checking whether it is already null
		if(head == null) {
			head=exampleNode;
		}else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = exampleNode;
		}
	}
	public void printElements() {
//		To print the List 
		Node current = head;
		while(current != null) {
			current.printData();
			current = current.next;
		}	
	}	
}
public class Main {
	public static void main(String[] args) {
//		creating a singleLinkedList
		SingleLinkedList newList = new SingleLinkedList();
		newList.insertLast("Hello");
		newList.insertLast("World!");
		
		if(newList.isEmpty()) {
			System.out.println("List is Empty");
		}else {
			System.out.println("List is not empty");
		}
		System.out.println("And the List is Storing: ");
//		Calling the method
		newList.printElements();
	}

}
