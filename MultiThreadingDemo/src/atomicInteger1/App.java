package atomicInteger1;

import java.util.concurrent.atomic.AtomicInteger;

public class App {

	public static void main(String[] args) {
		AtomicInteger a = new AtomicInteger(0);
		Runnable r =()->{
			while(true)
			{
				
				int value=a.addAndGet(5);
				if(value>=50)
					break;
				System.out.println(value+" "+Thread.currentThread().getName());
			
			}
		};

		Thread t1 = new Thread(r,"th1");
		Thread t2 = new Thread(r,"th2");
		t1.start();
		t2.start();

	}

}
