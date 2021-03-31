package ticketbookingdemo;

public class TicketBookingTest {

	public static void main(String[] args) {
		MovieTicketBookingServiceImpl target = new MovieTicketBookingServiceImpl();
		Thread thread1 = new Thread(target);
		Thread thread2 = new Thread(target);
		
		thread1.setName("Bipin");
		thread2.setName("Harshit");
		
		thread1.start();
		thread2.start();
		

	}

}
