package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AccessPrivateMethods {

 public static void main(String[] args) throws Exception {
	
	 Class<?> cls = Class.forName("Model.User");
	 
	 Constructor con=cls.getDeclaredConstructor();
	 Object obj=con.newInstance();
	 
	 Method m=cls.getDeclaredMethod("hidden",String.class);
	 m.setAccessible(true);
	 m.invoke(obj, "good Morning");
}
	
	
	

}
