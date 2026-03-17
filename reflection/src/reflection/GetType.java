package reflection;

import java.lang.reflect.Field;

public class GetType {

	public static void main(String[] args) throws Exception {
		Class<?> cls= Class.forName("Model.User");
		Field[] field = cls.getDeclaredFields();
		for(Field f : field)
		{
			System.out.println(f.getType().isArray() +" "+ f.getName());
		}
		
	}
}
