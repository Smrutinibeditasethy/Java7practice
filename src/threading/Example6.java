package threading;

public class Example6 implements Runnable{
	public void run() {
		System.out.println("run() method started...." +Thread.currentThread().getName());
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
System.out.println("run() method ended... " +Thread.currentThread().getName());

	}
	public static void main(String[] args) {
		Example6 e6 = new Example6();
		
		Thread t1 = new Thread(e6);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("Thread-1");
		
		Thread t2 = new Thread(e6);
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.setName("thread-2");
		
		Thread t3 = new Thread(e6);
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.setName("Thread-3");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
