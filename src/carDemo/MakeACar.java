package carDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MakeACar {

	static abstract class CarPart implements Runnable {
		String name;
		long time;

		public CarPart(String name, long time) {
			super();
			this.name = name;
			this.time = time;
		}

		@Override
		public void run() {
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				return;
			}
			System.out.println(name + " veche e gotovo");
		}
	}

	static class Tire extends CarPart {

		public Tire() {
			super("Tire", 2000);
		}
	}

	static class Engine extends CarPart {

		public Engine() {
			super("Engine", 7000);
		}
	}

	static class Seats extends CarPart {

		public Seats() {
			super("Seats", 3000);
		}

	}

	static class Frame extends CarPart {

		public Frame() {
			super("Frame", 5000);
		}

	}

	public static void main(String[] args) {

		ExecutorService pool = Executors.newFixedThreadPool(3);
		long time = System.currentTimeMillis();

		pool.submit(new Engine());
		pool.submit(new Frame());
		for (int i = 1; i <= 5; i++) {
			pool.submit(new Seats());
		}
		for (int i = 1; i <= 4; i++) {
			pool.submit(new Tire());
		}

		pool.shutdown();
		try {
			pool.awaitTermination(4, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			return;
		}

		System.out.println((System.currentTimeMillis() - time) / 1000);
	}

}
