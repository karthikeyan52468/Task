package concurrency.objectMonitor;

public class App {

	public static void main(String[] args) {
		Monitor m = new Monitor();
		Thread t1= new Thread(()->m.display());
		Thread t2= new Thread(()->m.display());
		t1.start();
		t2.start();
	}
}
