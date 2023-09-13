package threading;

//using runnable interface

public class Example3 implements Runnable{
	public void run() {
		System.out.println("run() started...");
	}
	public static void main(String[] args) {
		Example3 e = new Example3();
		Thread t = new Thread(e);
		t.start();
	}

}
