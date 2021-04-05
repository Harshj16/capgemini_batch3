package demo04.handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import demo04.common.Gender;
import demo04.common.Person;

public class Solution4 {

	// Suppose this data might be comming from backend app or some REST call
	public static List<Person> createPeople() {
		return Arrays.asList(new Person("pankaj", 38, Gender.MALE), new Person("Manvi", 6, Gender.FEMALE),
				new Person("Aman", 34, Gender.MALE), new Person("Bindu", 23, Gender.FEMALE),
				new Person("Kabir", 46, Gender.MALE), new Person("Arshika", 18, Gender.FEMALE),
				new Person("Monika", 45, Gender.FEMALE), new Person("Monika", 35, Gender.FEMALE),
				new Person("Vijay", 34, Gender.MALE), new Person("Priyanka", 35, Gender.FEMALE));
	}

	public static void main(String[] args) {
		List<Person> people = createPeople();
		// TODO : print the sum of all ages

//			int totalAge = 
//					people.stream()
//					.map(Person::getAge)
//					.reduce(0, new BinaryOperator<Integer>() {
//
//						@Override
//						public Integer apply(Integer carry, Integer age2) {
//							
//							return carry+age2;
//						}
//					});
//			
//			System.out.println("Total of Ages : "+totalAge);

//		int totalAge = people.stream().map(Person::getAge).reduce(0, ( carry,  age) ->carry + age);
//
//		System.out.println("Total of Ages : " + totalAge);
		
//		int totalAge = people.stream().map(Person::getAge).reduce(0, Integer::sum);
//
//		System.out.println("Total of Ages : " + totalAge);
		
		int totalAge = people.stream().mapToInt(Person::getAge).sum();

		System.out.println("Total of Ages : " + totalAge);
		
		

	}

}
