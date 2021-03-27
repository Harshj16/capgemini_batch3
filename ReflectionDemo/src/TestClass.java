import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestClass {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
			//Class c = Class.forName("Employee");
//			System.out.println(c);
//			System.out.println("Super class : "+c.getSuperclass());
//			System.out.println("HashCode of super class : "+c.hashCode());
//			Class [] classes = c.getInterfaces();
//			
//			for (Class cls : classes) {
//				System.out.println(cls+" hashcode :"+cls.hashCode());
//				
//			}
//			
//			int mod = c.getModifiers();
//			System.out.println(mod);
//			System.out.println(Modifier.toString(100));
//			
//			Field[] fields = c.getDeclaredFields();
//			for (Field field : fields) {
//				System.out.println(field + " : hashcode : "+field.hashCode());
//			}
//			
//			Method[] methods =  c.getDeclaredMethods();
//			System.out.println(methods.length);
//			for (Method method : methods) {
//				System.out.println(method +" : hashcode : "+method.hashCode());
//			}
//			
//			Constructor [] constructors = c.getDeclaredConstructors();
//			for (Constructor constructor : constructors) {
//				System.out.println(constructor+" hashcode : "+constructor.hashCode());
		
		//Employee employee = new Employee();
		Class c = Class.forName("Employee");
		Constructor[] constructors = c.getDeclaredConstructors();
		constructors[0].setAccessible(true);
		Employee employee = (Employee)constructors[0].newInstance();
		System.out.println(employee);
	
	
	
	}

}
