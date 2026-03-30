package validator;

public class Validator {

	public static boolean numberOnly(String s)
	{
		if(s.matches("^[0-9]+$"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean textOnly(String s)
	{
		if(s.matches("^[a-zA-Z]+$"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean username(String s)
	{
		if(s.matches("^[a-zA-Z][a-zA-Z0-9_]+$"))
		{
			return true;
		}
		return false;
	}
	
	public static boolean email(String s)
	{
		if(s.matches("^[a-zA-Z]+[a-zA-Z0-9_.]+@[a-zA-Z0-9]+\\.[a-z]{2,}$"))
		{
			return true;
		}
		return false;
	}
}
