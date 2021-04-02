package overriding;

public class Animal {
	private String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void eat() {
		System.out.println(getName()+" eating from mouth");
	}

}
