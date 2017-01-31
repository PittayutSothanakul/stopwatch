package stopwatch;

import java.util.Scanner;

/**
 * A Stopwatch that measures elapsed time between a starting time and stopping
 * time, or until the present time.
 * 
 * @author Pittayut Sothanakul
 * 
 * @version 1.0
 * 
 * 
 */

public class Stopwatch {
	/** values of elapsed. */
	private double elapsed;
	/**
	 * a boolean tell stopwatch is start or stop if stopwatch is stop = false
	 * and if stopwatch is start = true.
	 */
	private boolean running = false;
	/** constant for converting nanoseconds to seconds. */
	private static final double NANOSECONDS = 1.0E-9;
	/** time that the stopwatch was started, in nanoseconds. */
	private long start;
	/** time that the stopwatch was stopped, in nanoseconds. */
	private long stop;

	/**
	 * Return the elapsed in second with decimal.
	 * 
	 * @return the values of elapsed.
	 */
	public double getElapsed() {
		elapsed = NANOSECONDS * (stop - start);
		return elapsed;
	}

	/**
	 * check boolean in start method and stop method.
	 * 
	 * @return true or false in start method and stop method.
	 */
	public boolean isRunning() {

		return running;
	}

	/**
	 * method start count time if stopwatch is started.
	 */
	public void start() {

		start = System.nanoTime();
		running = true;

	}

	/**
	 * method stop count time if stopwatch is stopped.
	 */
	public void stop() {

		stop = System.nanoTime();
		running = false;

	}

	/**
	 * create object and count time in stopwatch.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stopwatch timer = new Stopwatch();
		System.out.println("Starting task");
		System.out.println("Enter to start");
		sc.nextLine();
		timer.start();
		System.out.println("Enter to Stop");
		sc.nextLine();
		timer.stop(); // stop timing the work
		System.out.printf("elapsed = %.6f sec\n", timer.getElapsed());
		if (timer.isRunning())

			System.out.println("timer is still running!");
		else
			System.out.println("timer is stopped");
	}
}
