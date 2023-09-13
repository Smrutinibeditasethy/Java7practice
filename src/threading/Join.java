package threading;

public class Join {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() +"=>" +i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		};
		t1.setName("Thread.....1");
		 
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getName() +"=>" +i);
					try {
						Thread.sleep(100);
						Thread.yield();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		};
		t2.setName("thread .....2");
		t1.start();
		
		t2.start();
		t2.join();
	}

}
