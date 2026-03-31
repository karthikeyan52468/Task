package concurrency.methodLevel;

public class MethodLevel {

	
		static synchronized void print1()
		{
			System.out.println("print1");
		
		}
		
		static synchronized void print2()
		{
			System.out.println("print2");
		
		}
}
