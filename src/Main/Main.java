package Main;

public class Main {
	public static void main (String args[]) throws InterruptedException{
		Thread t1 = new Thread(new Custom("A"));
		Thread t2 = new Thread(new Custom("B"));
		Thread t3 = new Thread(new Custom("C"));
		
		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
		
	}
}
