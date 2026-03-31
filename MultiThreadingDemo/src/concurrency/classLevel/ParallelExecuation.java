package concurrency.classLevel;

public class ParallelExecuation {

	synchronized void m1()
	{
		System.out.println("m1");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized void m2()
	{
		System.out.println("m2");
		
	}
}
