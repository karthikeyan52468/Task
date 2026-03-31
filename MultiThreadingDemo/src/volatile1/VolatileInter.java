package volatile1;

public class VolatileInter implements Runnable{

	public volatile boolean flag=true;
	
	
	public void run()
	{
		while(flag)
		{
		
			
		}
		System.out.println("executed");
	}
}
