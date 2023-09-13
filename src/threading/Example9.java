package threading;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example9 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("run() methos logic 1");
			}
		};
	t1.start();
	Runnable r = new Runnable() {

		@Override
		public void run() {
			System.out.println("run() method logic 2 ");
		}
	};
	Thread t2 = new Thread(r);
	t2.start();
	Callable c = new Callable() {
		public Object call() throws Exception{
			System.out.println("call() method logic 3");
			return null;
		}
	};
	ExecutorService exs = Executors.newFixedThreadPool(10);
	exs.submit(c);
	}
}
