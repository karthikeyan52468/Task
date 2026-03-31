package concurrency.methodLevel;

public class App {

	public static void main(String[] args) {


		
		Thread t1= new Thread(()->MethodLevel.print1());
		Thread t2= new Thread(()->MethodLevel.print2());

		t1.start();
		t2.start();
		
		//t1 execute 
		//t2 wait
		//t1 completed
		//t2 execute
	}

}
