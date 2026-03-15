package project.QuartzSchedulingTest;

public class Task1 {

	static Task1 obj=null;
	
	public static Task1 getInstance()
	{
		if(obj==null)
			obj= new Task1();
		return obj;
	}
	public void execute()
	{
		System.out.println("Take Tablet");
	}
}
