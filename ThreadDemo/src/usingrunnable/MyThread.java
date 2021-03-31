package usingrunnable;

public class MyThread extends Thread{

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		showNumberTask(threadName);
	}

	private void showNumberTask(String threadName) {
		for (int i = 1; i <=10; i++) {
			System.out.println(threadName+":"+i);
		}
	}
}
