package usingrunnable;

public class TestThread {

	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		thread1.setName("Harshit");
		thread2.setName("Shivam");
		thread1.start();
		thread2.start();

	}

}
