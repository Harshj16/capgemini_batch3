import java.io.Serializable;

public final class Employee implements Serializable,Cloneable{

	private int id;
	private String name;
	private String add;
	private Employee() {
		super();
	}
	public Employee(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	public void addEmployee() {}
	public void searchEmployee(int id) {}
	
}
