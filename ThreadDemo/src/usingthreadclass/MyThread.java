package usingthreadclass;

public class MyThread implements Runnable{
	
	public MyThread() {
		System.out.println( Thread.currentThread().getName()+":"+Thread.currentThread().getState());
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		System.out.println( threadName+":"+Thread.currentThread().isAlive());
		showNumberTask(threadName);
	}

	private void showNumberTask(String threadName) {
		
		for (int i = 1; i <=10; i++) {
			
			System.out.println(threadName+":"+i);
		}
	}
}
