package inheritance;

public class Dog extends Animal implements Runnable,Cloneable {
	
	public Dog() {
		super();
	}
	
	public Dog(String name) {
		super(name);
	}
	public void bark() {
		System.out.println(getName()+" is barking");
	}

}
