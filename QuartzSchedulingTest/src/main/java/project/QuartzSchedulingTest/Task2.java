package project.QuartzSchedulingTest;

public class Task2 {

	static Task2 obj=null;
	public static Task2 getInstance()
	{
		if(obj==null)
			obj= new Task2();
		return obj;
	}
	public void execute()
	{
		System.out.println("drink water");
	}
}
