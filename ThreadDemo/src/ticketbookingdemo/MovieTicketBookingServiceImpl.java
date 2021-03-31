package ticketbookingdemo;

public class MovieTicketBookingServiceImpl implements Runnable{
	
	private int availableTicket=1;
	private  void bookTicket(String name) {
		System.out.println("Availability check by : "+name+" :  available "+availableTicket);
		if(availableTicket>=1) {			
				System.out.println("Booking started for : "+name);
				synchronized (this) {
					//server connection check
					//get data from server
					//operation
					//update status on server
					//4 sec
					availableTicket=availableTicket-1;
				}
				System.out.println("Booking completed for : "+name);
			
		}
		else {
			System.out.println("No Ticket available for  :"+name);
		}
	}
	
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		bookTicket(name);
		
	}

}
