package validator;

public class App {

	public static void main(String[] args) {
		if(Validator.numberOnly("94564545"))
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(Validator.textOnly("abc"))
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(Validator.username("abc_10"))
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if(Validator.email("abc10@email.in"))
		{
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
