package stopwatch;

import java.math.BigDecimal;

/**
 * Add BigDecimal objects from an array.
 * 
 * @author panther
 *
 */

public class SumBigDecimal implements Runnable {
	private int counter;
	static BigDecimal sum = new BigDecimal(0.0);
	static final int ARRAY_SIZE = 500000;

	/**
	 * SumBigDecimal with counter.
	 * 
	 * @param counter
	 *            is time to add number.
	 */
	public SumBigDecimal(int counter) {
		this.counter = counter;
	}

	/**
	 * Add number form 1 to ARRAY_SIZE with BigDecimal class.
	 */
	@Override
	public void run() {
		BigDecimal[] values = new BigDecimal[ARRAY_SIZE];
		for (int i = 0; i < ARRAY_SIZE; i++)
			values[i] = new BigDecimal(i + 1);

		for (int count = 0, i = 0; count < counter; count++, i++) {
			if (i >= values.length)
				i = 0;
			sum = sum.add(values[i]);
		}

	}

	/**
	 * Return the task description.
	 * 
	 * @return the description of the task.
	 */
	public String toString() {
		return String.format("Sum array of BigDecimal with count=%,d\n", counter) + "sum = " + sum;

	}

}
