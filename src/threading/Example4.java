package threading;

public class Example4 implements Runnable {
	public void run() {
		System.out.println("run() method started..");
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
	}
public static void main(String[] args) {
	Example4 e = new Example4();
	Thread t = new Thread(e);
	//t.start();
	t.run();
	
}
}
