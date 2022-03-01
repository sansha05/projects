
class Table {
	
	synchronized void printTable(int val) {
		System.out.println("table of " + val);
		for (int i=1; i<=10; i++) {
			System.out.println(val*i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MyThread implements Runnable {
	Table table;
	public MyThread(Table t) {
		this.table = t;
	}
	@Override
	public void run() {
		table.printTable(2);
	}
}

class MyThread1 implements Runnable {
	Table table;
	public MyThread1(Table t) {
		this.table = t;
	}
	@Override
	public void run() {
		table.printTable(5);
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		Table t = new Table();
		Thread th = new Thread(new MyThread(t));
		Thread th2 = new Thread(new MyThread1(t));
		
		th.start();
		th2.start();
		
		

	}

}