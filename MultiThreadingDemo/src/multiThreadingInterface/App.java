package multiThreadingInterface;

public class App {

	public static void main(String[] args) {
		Process p1= new Process();
		Thread t1= new Thread(p1);
		Thread t2= new Thread(p1);
		t1.start();
		t2.start();

	}

}
