package abstractdemo;

public class Maruti800 extends Car {
	public Maruti800() {
		super();
	}
	
	public Maruti800(String regNo) {
		super(regNo);
	}

	@Override
	public void drive() {
		System.out.println("Drive Mariti800 with normal steering :regNo : "+getRegNo());

	}

	@Override
	public void stop() {
		System.out.println("Stop Mariti800 with normal break:regNo : "+getRegNo());

	}

}
