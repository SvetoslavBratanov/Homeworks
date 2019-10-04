package threadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	static class SmashSmth implements Callable<String> {

		String kakvoShteMachkam;
		public SmashSmth(String kakvoShteMachkam) {
			super();
			this.kakvoShteMachkam = kakvoShteMachkam;
		}
		@Override
		public String call() throws Exception {
			System.out.println(Thread.currentThread().getName() + " smachkah " + this.kakvoShteMachkam );
			Thread.sleep(1500);
			return "Pulichih smachkano " + this.kakvoShteMachkam;
		}
		
	}
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		final String[] whatSmash = {"grozde", "praskovi", "slivi", "vragove", "kadeti", "treva", "domati", "samochuvstvie", "syrce", "emocii", "pernicahnin", "golf"};
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		CompletionService<String> service = new ExecutorCompletionService<String>(threadPool);
		
		for ( String s : whatSmash ) {
			Future<String> future =  service.submit(new SmashSmth(s));
			//System.out.println((String)future.get());
		}
		Thread.sleep(4000);
		for (int i = 0; i<whatSmash.length; i++) {
			System.out.println(service.take().get());
		}

		
		threadPool.shutdown();
		
	}
}
