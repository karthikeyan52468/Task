package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class AccessPrivateField {

	public static void main(String[] args) throws Exception {
		Class<?> cls= Class.forName("Model.User");
		
		Constructor con = cls.getDeclaredConstructor();
		Object obj=con.newInstance();
		Field f=cls.getDeclaredField("pi");
		f.setAccessible(true);
		System.out.println(f.get(obj));
	}
}
