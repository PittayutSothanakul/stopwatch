package stopwatch;

/**
 * Main to runs a task with TaskTimer to the console.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class Main {
	/**
	 * Create method and runs a task.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TaskTimer taskTimer = new TaskTimer();

//		Runnable task1 = new AppendToString(50000);
//		Runnable task2 = new AppendToString(100000);
//		Runnable task3 = new AppendToStringBuilder(100000);
//		Runnable task4 = new SumDoublePrimitive(1000000000);
//		Runnable task5 = new SumDouble(1000000000);
//		Runnable task6 = new SumBigDecimal(1000000000);
//		taskTimer.measureAndPrint(task1);
//		taskTimer.measureAndPrint(task2);
//		taskTimer.measureAndPrint(task3);
//		taskTimer.measureAndPrint(task4);
//		taskTimer.measureAndPrint(task5);
//		taskTimer.measureAndPrint(task6);

		 taskTimer.measureAndPrint(new AppendToString(50000));
		 taskTimer.measureAndPrint(new AppendToString(100000));
		 taskTimer.measureAndPrint(new AppendToStringBuilder(100000));
		 taskTimer.measureAndPrint(new SumDoublePrimitive(1000000000));
		 taskTimer.measureAndPrint(new SumDouble(1000000000));
		 taskTimer.measureAndPrint(new SumBigDecimal(1000000000));

	}
}
