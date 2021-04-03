package withoutenum;

public class WithoutEnumDemo {

	public static void main(String[] args) {
		Day day =  new Day();
		day.setDay(WeekDays.FRIDAY);
		System.out.println("Day is : "+day.getDay());	

	}

}
