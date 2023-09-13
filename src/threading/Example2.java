package threading;

//creating user defined thread 
//using extending thread

public class Example2 extends Thread {
	public void run() {
		System.out.println("run() method called...");
	}
public static void main(String[] args) {
	Example2 e = new Example2();
	Thread t = new Thread(e);
	t.start();
}
}
