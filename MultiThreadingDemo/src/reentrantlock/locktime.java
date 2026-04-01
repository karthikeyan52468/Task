package reentrantlock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class locktime {

	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();
		Runnable r =()->{
			try {
				if(lock.tryLock(12, TimeUnit.SECONDS)) {
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(10000);
				}
				else {
					System.out.println("locked");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				lock.unlock();
			}
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}
