package lab02;

public class Practice01 {
	public static void main(String[] args) throws InterruptedException {
		Runnable twoTableTarget = new Runnable() {

			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println("Table Printing Request By : " + name);
				for (int i = 1; i <= 10; i++) {
					System.out.println(name + " : " + (i * 2));
				}

			}
		};

		Thread thread1 = new Thread(twoTableTarget);
		Thread thread2 = new Thread(twoTableTarget);
		thread1.setName("Aman");
		thread2.setName("Pankaj");

		thread1.start();
		thread1.join();
		thread2.start();

	}
}
