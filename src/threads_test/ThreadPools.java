package threads_test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPools {

	private static class HiTask implements Callable<String> {
		public String call() {
			return "Hello world";
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		CompletionService<String> pool = new ExecutorCompletionService<String>(threadPool);
		for (int i = 0; i < 10; i++) {
			pool.submit(new HiTask());
		}

		for (int i = 0; i < 10; i++) {
			String result = pool.take().get();
			// Compute the result
		}
		threadPool.shutdown();
		

		List<Future<String>> futures = new ArrayList<Future<String>>(10);
		for (int i = 0; i < 10; i++) {
			futures.add(pool.submit(new HiTask()));
		}
		for (Future<String> future : futures) {
			// Waits for the computation to complete
			// and then retrieves its result
			String result = future.get();
			// work with result
		}
	}
}
