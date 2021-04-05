package demo04.handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import demo04.common.Gender;
import demo04.common.Person;

public class Solution5 {

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
		// TODO : Show the oldest person
		Optional<Person> oldestPerson = people.stream().max(new Comparator<Person>() {

			@Override
			public int compare(Person person1, Person person2) {
				return person1.getAge() > person2.getAge() ? 1 : -1;
			}
		});
		if (oldestPerson.isPresent()) {
			System.out.println(oldestPerson);
		}

		// TODO : Show the Youngest person
		Optional<Person> youngestPerson = people.stream()
				.min((person1, person2) -> person1.getAge() > person2.getAge() ? 1 : -1);
		if (youngestPerson.isPresent()) {
			System.out.println(youngestPerson);
		}

	}

}
