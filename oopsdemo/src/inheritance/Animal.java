package inheritance;

public class Animal {
	private String name;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void eat() {
		System.out.println(getName()+" is eating");
	}
	public void run() {
		System.out.println(getName()+" is running");
	}

}
