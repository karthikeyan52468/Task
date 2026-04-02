package monitor;

public class Operation {

	int c=0;
	public synchronized void read()
	{
		while(true)
		{
		System.out.println("read " +Thread.currentThread().getName());
		if(c%5==0)
		{
			try {
			
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		c++;
		}
		
	}
	public synchronized void write()
	{
	
		
			System.out.println("write");
			c++;
			notifyAll();
		
	}
	
	}
