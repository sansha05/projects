public class LL {
	private Node head;
	
	// Node 
		class Node {
			int data;
			Node next;
			
			Node(int data) {
				this.data = data;
				this.next = null;
			}
		}
	
	// adding to the list 
	public void insert(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return;
		} else {
			
			Node curNode = head;
			while(curNode.next != null) {
				curNode = curNode.next;
			}
			
			curNode.next = newNode;
			return;
		}		
		
	}
	
	// printing list
	public void printList() {
		Node temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(temp.data + "->");
		
		System.out.println("end");
	}
	
	public void delete(int key) {
		Node temp = head;
		if(temp.next != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		Node prev = null;
		while(temp.next != null && temp.data != key) {
			prev=temp;
			temp = temp.next;
		}
		
		if(temp.next != null && temp.data == key) {
			prev.next = temp.next;
			temp.next = null;
			return;
		}
		
		if (temp.next == null && temp.data == key) {
			prev.next = null;
			return;
		}
		
		
	}
	

}