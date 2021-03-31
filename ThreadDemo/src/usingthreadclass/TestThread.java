package usingthreadclass;

public class TestThread {

	public static void main(String[] args) {
		MyThread target = new MyThread();
		Thread thread1 = new Thread(target);
		Thread thread2 = new Thread(target);
		System.out.println(thread1.getState());
		System.out.println(thread2.getState());
		thread1.setName("Harshit");
		thread2.setName("Shivam");
		thread1.start();
		
		try {
			thread1.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		thread2.start();
		System.out.println(thread1.getState());
		System.out.println(thread2.getState());
		
		System.out.println("------------->"+thread1.getName()+":"+thread1.isAlive());
		
		//thread1.start();
	}

}
