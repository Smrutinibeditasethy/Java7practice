package threading;

public class Demon implements Runnable{
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("deamon thread executed..");
		}else {
			System.out.println("normal thread...");
		}
	}
	public static void main(String[] args) {
		Demon d = new Demon();
		Thread t = new Thread(d);
		t.setDaemon(true);
		t.start();
	}

}
