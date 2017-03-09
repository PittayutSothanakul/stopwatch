package stopwatch;

/**
 * Add Double objects from an array.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class SumDouble implements Runnable {
	private int counter;
	private Double sum = new Double(0.0);
	private static final int ARRAY_SIZE = 500000;
	Double[] values = new Double[ARRAY_SIZE];

	/**
	 * SumDouble with couter.
	 * 
	 * @param counter
	 */
	public SumDouble(int counter) {
		this.counter = counter;
		for (int i = 0; i < ARRAY_SIZE; i++) {
			values[i] = new Double(i + 1);
		}
	}

	/**
	 * Add number form 1 to ARRAY_SIZE with Double class.
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
		return String.format("Sum array of Double objects with count=%,d\n", counter) + "sum = " + sum;
	}

}
