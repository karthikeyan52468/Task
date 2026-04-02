package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class InterruptLock1 {

	public static void main(String[] args) {
		ReentrantLock lock = new  ReentrantLock();
		Runnable r =()->{
			try {
				lock.lockInterruptibly();
				System.out.println("thread execute");
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				lock.unlock();
			}

	};
	
	Thread t1= new Thread(r);
	Thread t2= new Thread(r);
	t1.start();
	t2.start();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	t2.interrupt();
		
	}
}

