package stopwatch;

/**
 * Add double primitives from an array.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class SumDoublePrimitive implements Runnable {

	private int counter;
	private double sum;
	static final int ARRAY_SIZE = 500000;
	double[] values = new double[ARRAY_SIZE];

	/**
	 * SumDoublePrimitive with counter.
	 * 
	 * @param counter
	 *            is times to add number.
	 */
	public SumDoublePrimitive(int counter) {
		this.counter = counter;
		for (int k = 0; k < ARRAY_SIZE; k++) {
			values[k] = k + 1;

			sum = 0.0;
		}
	}

	/**
	 * Add number form 1 to ARRAY_SIZE with primitive double.
	 */
	@Override
	public void run() {

		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum + values[i];

		}

	}

	/**
	 * Return the task description.
	 * 
	 * @return the description of the task.
	 */
	public String toString() {
		return String.format("Sum array of double primitives with count=%,d\n", counter) + "sum = " + sum;
	}
}
