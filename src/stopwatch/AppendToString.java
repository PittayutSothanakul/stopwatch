package stopwatch;

/**
 * Append char to string.
 * 
 * @author Pittayut Sothanakul
 *
 */
public class AppendToString implements Runnable {
	private int count;
	private String result = "";

	/**
	 * The append to string with a count.
	 * 
	 * @param count
	 *            is the length of the final string.
	 */
	public AppendToString(int count) {
		this.count = count;
		this.result = "";
	}

	/**
	 * Add char 'a' to string until final count.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		int k = 0;
		while (k++ < count) {
			result = result + CHAR;
		}

	}

	/**
	 * Return the task description.
	 * 
	 * @return the description of the task.
	 */
	public String toString() {
		return String.format("Append %,d chars to String\nfinal string length = %d", count, result.length());
	}

}