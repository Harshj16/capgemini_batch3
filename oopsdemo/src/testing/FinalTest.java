package testing;

class MyMath{
	String number ;
	
	public MyMath() {
		number="10";
	}
	
	public int add(int num) {
		return Integer.parseInt(number)+num;
	}
}

public class FinalTest {

	public static void main(String[] args) {
		
			MyMath myMath = new MyMath();
			System.out.println(myMath.add(10));

	}
}
