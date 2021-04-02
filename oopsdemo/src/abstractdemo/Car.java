package abstractdemo;

public abstract class Car {

	private String regNo;
	public Car() {
		// sequence management 
		
		drive();
		fuleTank();
		stop();
		
		
	}
	public Car(String regNo) {
		this.regNo=regNo;
	}
	public String getRegNo() {
		return regNo;
	}
	public abstract void drive();
	public abstract void stop();
	
	public void fuleTank() {
		System.out.println("Car is fulling..........regNo : "+getRegNo());
	}
}
