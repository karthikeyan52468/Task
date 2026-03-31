package concurrency.classLevel;

public class App {

	public static void main(String[] args) {
		
		ParallelExecuation obj= new ParallelExecuation();
		Thread t1= new Thread(()->obj.m1());
		Thread t2= new Thread(()->obj.m2());

		t1.start();
		t2.start();
		
		//t1 and t2 parallel execution
	}

}
