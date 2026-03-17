package customAnnotation;

public class App {

	 int a;
	 @MinLength
	 String name;
	public static void main(String[] args)  {
		App obj = new App();
	
		 obj.a=10;
		 obj.name="hello";
		
		try {
			Validator.validate(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj.name);
	}
}
