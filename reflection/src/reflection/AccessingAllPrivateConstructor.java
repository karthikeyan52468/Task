package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class AccessingAllPrivateConstructor {

	public static void main(String[] args) throws Exception{
		Class<?> cls = Class.forName("Model.User");
		Constructor[] con =cls.getDeclaredConstructors();
		
		for(Constructor c :con)
		{
			if(Modifier.toString(c.getModifiers()).equals("private"))
			{
				c.setAccessible(true);
				c.newInstance(10);
			}
		}
	}
}
