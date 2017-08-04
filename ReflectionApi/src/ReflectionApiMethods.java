import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionApiMethods {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		
		ReflectionDemo reflectionDemo = new ReflectionDemo();
		
		Class cls = reflectionDemo.getClass();
		System.out.println("The name of class is " +
                cls.getName());
		
		Constructor consturctor = cls.getConstructor();
		System.out.println("The name of constructor is " +
				consturctor.getName());
		
		Method[] method = cls.getMethods();
		for(Method m1: method) {
			System.out.println(m1.getName());
		}
		
		Method methodcall1 = cls.getDeclaredMethod("method2",
                int.class);
		
		methodcall1.invoke(reflectionDemo, 19);
		Field field = cls.getDeclaredField("s");
		 
        // allows the object to access the field irrespective
        // of the access specifier used with the field
        field.setAccessible(true);
 
        // takes object and the new value to be assigned
        // to the field as arguments
        field.set(reflectionDemo, "JAVA");
 
        // Creates object of desired method by providing the
        // method name as argument to the getDeclaredMethod
        Method methodcall2 = cls.getDeclaredMethod("method1");
 
        // invokes the method at runtime
        methodcall2.invoke(reflectionDemo);
 
        // Creates object of the desired method by providing
        // the name of method as argument to the 
        // getDeclaredMethod method
        Method methodcall3 = cls.getDeclaredMethod("method3");
 
        // allows the object to access the method irrespective 
        // of the access specifier used with the method
        methodcall3.setAccessible(true);
 
        // invokes the method at runtime
        methodcall3.invoke(reflectionDemo);	
       
        
       
	}
}
