package threading;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example7 implements Callable {
	public Object call()throws Exception {
		System.out.println("call() method executed..");
		return "Success";
	}
public static void main(String[] args) throws InterruptedException, ExecutionException {
	Example7 e7 = new Example7();
	ExecutorService exs = Executors.newFixedThreadPool(10);
	for (int i = 1; i < 11; i++) {
		Future submit = exs.submit(e7);
		System.out.println(submit.get().toString());
	}
		exs.shutdown();
	}
}

