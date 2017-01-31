package stopwatch;

/**
 * A TaskTimer that compute and print elapse time for any task.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class TaskTimer {
	/**
	 * Runs a task, compute and print elapse time to the console.
	 * 
	 * @param runnable
	 *            is the task to be run.
	 */
	public void measureAndPrint(Runnable runnable) {
		Stopwatch timer = new Stopwatch();
		timer.start();
		runnable.run();
		timer.stop();
		System.out.println(runnable.toString());
		System.out.printf("Elapsed time %.6f sec\n\n", timer.getElapsed());

	}
}
