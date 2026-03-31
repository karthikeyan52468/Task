package volatile1;

public class App {

	public static void main(String[] args) {

		VolatileInter v = new VolatileInter();
		Thread t1 = new Thread(v);
		t1.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		v.flag=false;
	}
	
}
