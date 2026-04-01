package reentrantlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class retry {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Runnable r = ()->{
			while(true)
			{
				if(lock.tryLock())
				{
					try {
					
						System.out.println(Thread.currentThread().getName());
						
						Thread.sleep(5000);
						break;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					finally {
						lock.unlock();
						System.out.println(Thread.currentThread().getName()+" is unlocked");
					}
				}
				else {
					System.out.println("locked retrying "+Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						
					}
				}
			}
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}
}
