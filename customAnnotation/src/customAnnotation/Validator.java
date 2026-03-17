package customAnnotation;

import java.lang.reflect.Field;

public class Validator {

	static void validate(Object obj) throws Exception {
		
		Class cls = obj.getClass();
		
		Field[] fields = cls.getDeclaredFields();
		
		for(Field field : fields) {
			
			if(field.getType() == String.class && field.isAnnotationPresent(MinLength.class))
			{
				int minvalue=field.getAnnotation(MinLength.class).value();
				String s = (String) field.get(obj);
				
				if(s.length()<minvalue)
				{
					throw new Exception("Length is too short...");
					
				}
				
			}
		}
		
		
	}
}
