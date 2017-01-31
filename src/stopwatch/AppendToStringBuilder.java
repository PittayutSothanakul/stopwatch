package stopwatch;

/**
 * Append chars to a StringBuilder
 * 
 * @author Pittayut Sothanakul
 *
 */
public class AppendToStringBuilder implements Runnable {
	private int count;
	private String result = "";

	/**
	 * The append to string builder with a count.
	 * 
	 * @param count
	 *            is the length of the final string.
	 */
	public AppendToStringBuilder(int count) {
		this.count = count;
		this.result = "";
	}

	/**
	 * Add char 'a' to string builder until final count.
	 */
	@Override
	public void run() {
		final char CHAR = 'a';
		StringBuilder builder = new StringBuilder();
		int k = 0;
		while (k++ < count) {

			builder = builder.append(CHAR);
		}
		result = builder.toString();

	}

	/**
	 * Return the task description.
	 * 
	 * @return the description of the task.
	 */
	public String toString() {
		return String.format("Append %,d chars to StringBuilder\nfinal string length = %d", count, result.length());
	}

}
