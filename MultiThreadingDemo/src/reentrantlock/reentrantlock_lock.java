package reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class reentrantlock_lock {

	public static void main(String[] args) {
		
		ReentrantLock lock = new ReentrantLock();
		Runnable r = ()->{
			lock.lock();
			try {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(10000);
			}
			catch(Exception e)
			{
				
			}
			finally {
				lock.unlock();
			}
		};
		Thread t1= new Thread(r);
		Thread t2= new Thread(r);
		t1.start();
		t2.start();
		// t1 execute
		//t2 wait untill t1 release
	}
}
