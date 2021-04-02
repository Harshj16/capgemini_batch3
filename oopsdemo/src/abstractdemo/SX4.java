package abstractdemo;

public class SX4 extends Car{
	
	public SX4() {
		super();
	}
	public SX4(String regNo) {
		super(regNo);
	}

	@Override
	public void drive() {
		System.out.println("Drive SX4 with normal steering :regNo : "+getRegNo());		
	}

	@Override
	public void stop() {
		System.out.println("Stop SX4 with normal break :regNo : "+getRegNo());
		
	}

}
