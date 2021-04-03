package lab03;

import java.util.Arrays;
import java.util.List;

public class Practice01 {

	public static void main(String[] args) {
		List<String> topics = Arrays.asList("J2SE", "J2EE", "Spring Framework", "Spring Boot", "JPA",
				"Test Driven Development");

		for (String topic : topics) {
			System.out.println(topic);
		}
		
		//TODO :  Use Lambda (Hint : Consumer) for displaying the same output as displayed by above for loop
	}
}
