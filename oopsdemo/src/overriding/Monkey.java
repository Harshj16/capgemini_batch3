package overriding;

public class Monkey extends Animal {

	public Monkey(String name) {
		super(name);		
	}
	
	@Override
	public void eat() {
		//System.out.println(getName()+" intake food from hand");
		super.eat();
	}

}
