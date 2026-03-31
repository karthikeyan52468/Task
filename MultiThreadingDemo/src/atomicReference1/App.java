package atomicReference1;

import java.util.concurrent.atomic.AtomicReference;

public class App {

	public static void main(String[] args) {
	
		AtomicReference<Integer> i = new AtomicReference<Integer>(0);
		
		Runnable r = ()->{
			while(true)
			{
				int old=i.get();
				if(i.get()>=10)
				{
					break;
				}
				int new_value=old+1;
				if(i.compareAndSet(old, new_value))
				{
					System.out.println(Thread.currentThread().getName()+" "+i.get());
				}
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		
		t1.start();
		t2.start();
	}
}
