package lab02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice02 {

	public static void main(String[] args) {
		List<Person> nameList = new ArrayList<>();
		nameList.add(new Person(101, "pankaj", 38));
		nameList.add(new Person(105, "vijay", 25));
		nameList.add(new Person(102, "anand", 34));
		nameList.add(new Person(106, "bipin", 24));
		nameList.add(new Person(103, "rupesh", 23));
		nameList.add(new Person(104, "shivam", 26));

		System.out.println("Before Sorting");
		for (Person person : nameList) {
			System.out.println(person);
		}

//		Collections.sort(nameList, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person p1, Person p2) {
//
//				return p1.getName().compareTo(p2.getName());
//			}
//		});
		
		//TODO : Sort using lambda: Output must be same

		System.out.println("After Sorting");
		for (Person person : nameList) {
			System.out.println(person);
		}

	}

}
