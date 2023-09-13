package threading;

//Dead lock example

public class Example10 {
	public static void main(String[] args) {
		String s1 = "Hi";
		String s2 = "Hello";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (s1) {
				System.out.println("thread1 locked resource-1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(s2) {
					System.out.println("thread 2 waiting for resource 1");
				}
			}
		}
		
	};
	Thread t2 = new Thread() {
		public void run() {
			synchronized(s2) {
				System.out.println("thread2 locked resource 2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized(s1) {
					System.out.println("thread 2 waiting for resource 1");
				}
			}
		}
	};
	t1.start();
	t2.start();

}
}
