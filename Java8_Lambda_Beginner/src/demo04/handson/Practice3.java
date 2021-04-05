package demo04.handson;

import java.util.Arrays;
import java.util.List;

import demo04.common.Gender;
import demo04.common.Person;

public class Practice3 {

	public static List<Person> createPeople(){
		return Arrays.asList(
				new Person("pankaj", 38, Gender.MALE),
				new Person("Manvi", 6, Gender.FEMALE),
				new Person("Aman", 34, Gender.MALE),
				new Person("Bindu", 23, Gender.FEMALE),
				new Person("Kabir", 45, Gender.MALE),
				new Person("Monika", 45, Gender.FEMALE),
				new Person("Monika", 35, Gender.FEMALE),
				new Person("Vijay", 34, Gender.MALE),
				new Person("Priyanka", 35, Gender.FEMALE));
	}
	
	public static void main(String[] args) {
		List<Person> people = createPeople();
		//TODO: print all males : Using Stream By Imperative way
	}

}
