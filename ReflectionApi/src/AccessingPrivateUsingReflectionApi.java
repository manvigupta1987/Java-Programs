import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessingPrivateUsingReflectionApi {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		Class c = Class.forName("ReflectionDemo");
		ReflectionDemo reflectionDemo = (ReflectionDemo)c.newInstance();
		Method method = c.getDeclaredMethod("show", null);
		method.setAccessible(true);
		method.invoke(reflectionDemo, null);
	}
}
