package demo04.handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import demo04.common.Gender;
import demo04.common.Person;

public class Solution3 {
	
	//Suppose this data might be comming from backend app or some REST call
	public static List<Person> createPeople(){
		return Arrays.asList(
				new Person("pankaj", 38, Gender.MALE),
				new Person("Manvi", 6, Gender.FEMALE),
				new Person("Aman", 34, Gender.MALE),
				new Person("Bindu", 23, Gender.FEMALE),
				new Person("Kabir", 46, Gender.MALE),
				new Person("Arshika", 18, Gender.FEMALE),
				new Person("Monika", 45, Gender.FEMALE),
				new Person("Monika", 35, Gender.FEMALE),
				new Person("Vijay", 34, Gender.MALE),
				new Person("Priyanka", 35, Gender.FEMALE));
	}

	public static void main(String[] args) {
			List<Person> people = createPeople();
			//TODO : print all males, but name in upper case
			
			System.out.println("-------After Changes--------");
			people.stream()
			.filter(person->person.getGender().equals(Gender.MALE))
			.map(person->new Person(person.getName().toUpperCase(), person.getAge(), person.getGender()))
			.forEach(System.out::println);
			
			System.out.println("-------Before Changes--------");
			for (Person per : people) {
				System.out.println(per);
			}
	}

}
