package ReentrantReadWriteLock;

public class App {

	public static void main(String[] args) {
		WriteAndReadLock obj= new WriteAndReadLock();
		Runnable r =()->{
			obj.read();
		};
		
		Runnable w=()->{
			obj.write();
		};
		
		Thread r1 = new Thread(r);
		Thread r2 = new Thread(r);
		Thread w1 = new Thread(w);
		
		w1.start();
		r1.start();
		r2.start();
		
	}
}
