package concurrency.objectMonitor;

public class Monitor {

	public void display()
	{
		System.out.println("welcome");
		synchronized(this)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println("completed");
		}
		
	}
}
