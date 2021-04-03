package demo01;

public class WithoutLambdaDemo {

	public static void main(String[] args) {
		Greeting morningGreeting = new GoodMorningGreeting();
		Greeting eveningGreeting = new GoodEnveningGreeting();
		morningGreeting.greet();
		eveningGreeting.greet();
	}
}
