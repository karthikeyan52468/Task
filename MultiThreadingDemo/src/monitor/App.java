package monitor;

public class App {
	public static void main(String[] args) {
		
		Operation obj = new Operation();
		Runnable r1=()->{
			obj.read();
		};
		
	
		
		Runnable w1=()->{
			obj.write();
		};
		
		Thread t1= new Thread(r1);
		Thread t2= new Thread(r1);
		Thread t3= new Thread(w1);
		t1.start();
		t2.start();
		t3.start();
	}
}
