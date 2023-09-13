package threading;

public class Example5 implements Runnable {
	public void run() {
		System.out.println("run() method started...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("run() method ended..");
	}
	public static void main(String[] args) {
		Example5 e5 = new Example5();
		Thread t = new Thread(e5);
		t.start();
	}

}
