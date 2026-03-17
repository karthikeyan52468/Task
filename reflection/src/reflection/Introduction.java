package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Introduction {

	public static void main(String[] args) throws Exception {
	
		Class<?> cls=	Class.forName("Model.User");
		
		Constructor[] con=cls.getConstructors();
		Constructor[] decCon=cls.getDeclaredConstructors();
		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println("get Constructors "+Arrays.toString(con));
		System.out.println("get declared Constructors "+Arrays.toString(decCon));
		
	Field[] field=	cls.getFields();
	
	System.out.println("get field "+Arrays.toString(field));
	
	System.out.println("get Declared field "+Arrays.toString(cls.getDeclaredFields()));
	
	System.out.println("get Methods "+Arrays.toString(cls.getMethods()));
	System.out.println("get Methods "+Arrays.toString(cls.getDeclaredMethods()));
	System.out.println("get Simple Methods "+cls.getDeclaredMethods().getClass().getName());
	

	}

}
