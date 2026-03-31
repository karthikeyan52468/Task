package multiThreading;

public class App {

	public static void main(String[] args) {
		
		UsingThread t1= new UsingThread();
		UsingThread t2= new UsingThread();
	
		t1.start();
		t2.start();
	}

}
