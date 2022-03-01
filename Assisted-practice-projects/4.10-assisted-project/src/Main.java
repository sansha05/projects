public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list = new LL();
		
		list.insert(3);
		list.insert(2);
		list.insert(25);
		list.insert(56);
		list.insert(34);
		list.insert(22);
		
		list.delete(25);
		list.delete(22);
		
		
		list.printList();
		

	}

}
