package inheritance;

import java.lang.reflect.Constructor;

import javax.swing.JOptionPane;

public class AnimalTest {

	public static void main(String[] args) throws Exception{
		Animal animal ; // Compiler rule : method call depends on reference type

		String className = JOptionPane.showInputDialog("Enter Class Name");
		String animalName = JOptionPane.showInputDialog("Enter "+className+" Name ");
		
		Class c = Class.forName("inheritance."+className);	
		
		Class [] type = {String.class};
		Constructor  constructor= c.getConstructor(type);
		Object[] value = {animalName};
		Object newInstanceAnimalObj =  constructor.newInstance(value);
		animal = (Animal) newInstanceAnimalObj; // JVM Rule :  method call will be directed to object type. and this will be desided on run time
		animal.eat();
		animal.run();
		
		if(animal instanceof Dog) {
			((Dog)animal).bark();
		}
		if(animal instanceof Cat) {
			((Cat)animal).bite();
		}

	}

}
