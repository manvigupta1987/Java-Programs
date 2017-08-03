import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessingPrivateUsingReflectionApi {

	public static void main(String[] args) throws ClassNotFoundException, 
						InstantiationException, 
						IllegalAccessException, 
						NoSuchMethodException, 
						SecurityException, 
						IllegalArgumentException, 
						InvocationTargetException {
		// TODO Auto-generated method stub
		
		Class c = Class.forName("ReflectionDemo");
		ReflectionDemo reflectionDemo = (ReflectionDemo)c.newInstance();
		Method method = c.getDeclaredMethod("show", null);
		method.setAccessible(true);
		method.invoke(reflectionDemo, null);
		
		Integer i = new Integer(5);
		System.out.println(reflectionDemo.CheckInstance(i, "java.lang.Integer"));
	}
}



//ClassNotFoundException --> happens when given class is not found
//InstantiationException --> if passed class doesn't contain default constructor as new Instance method internally calls default constructor.
//IllegalAccessException --> if we don’t have access to the definition of specified class definition