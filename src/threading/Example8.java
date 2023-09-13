package threading;

public class Example8 implements Runnable {
public synchronized void printNum() {
	for (int i = 1; i <= 10; i++) {
		System.out.println(Thread.currentThread().getName() + "=>" +i);
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public void run() {
	printNum();
}
public static void main(String[] args) {
	Example8 e = new Example8();
	Thread t1 = new Thread(e);
	t1.setName("Thread-1");
	t1.start();
	
	Thread t2 = new Thread(e);
	t2.setName("Thread-2");
	t2.start();
}
}
