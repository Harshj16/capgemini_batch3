package demo04.handson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import demo04.common.Gender;
import demo04.common.Person;

public class Solution01 {
	
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
			
			//TODO : Get the name of all females in upper case who are in age more than 6 - Imperative way of working
			List<String> names = new ArrayList<>();
			for (Person person : people) {
				if(person.getAge()>18 && person.getGender().equals(Gender.FEMALE)) {
					// create the list of names
					names.add(person.getName().toUpperCase());
				}
			}
			System.out.println(names);
			
			/*
			 * The above code mixes what with how - create names collection separately, iterate people, check condition, add each element in names and finally display
			 * imerative way of working - mutable and low level of details. 
			 * you are focusing on each and every detail. 
			 */
			
//			//TODO : Get the name of all females in upper case who are in age more than 6 - Declarative Way using anonymous class
//			List<String> streamNames = 
//					people.stream()
//					.filter(new Predicate<Person>() {
//
//						@Override
//						public boolean test(Person person) {
//							
//							return (person.getAge()>18 && person.getGender().equals(Gender.FEMALE));
//						}
//					})
//					.map(new Function<Person, String>() {
//
//						@Override
//						public String apply(Person person) {
//							
//							return person.getName();
//						}
//					})
//					.map(new Function<String, String>() {
//
//						@Override
//						public String apply(String name) {
//							
//							return name.toUpperCase();
//						}
//					})
//					.collect(Collectors.toList());
//			
//			System.out.println(streamNames);
			
			//TODO : Get the name of all females in upper case who are in age more than 6 - Declarative Way using stream api	
			
			System.out.println(people.stream()
					.filter(person->person.getAge()>18 && person.getGender().equals(Gender.FEMALE))
					.map(person-> person.getName())
					.map((String name) ->name.toUpperCase())
					.collect(Collectors.toList()));
			
			//TODO : Get the name of all females in upper case who are in age more than 6 - Declarative Way using stream api	
			
			System.out.println(people.stream()
					.filter(person->person.getAge()>18 && person.getGender().equals(Gender.FEMALE))
					.map(Person::getName)
					.map(String::toUpperCase)
					.collect(Collectors.toList()));			
			
	}

}
