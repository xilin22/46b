package weather;

public class Cloud {
	private float bottom;
	private float top;

	/**
	 * this ctor creates Cloud objects with the height for the top and bottom of a
	 * cloud
	 * 
	 * @param bottom
	 *            how far down the cloud extends
	 * @param top
	 *            how far up the cloud extends
	 */
	public Cloud(float bottom, float top) {
		this.bottom = bottom;
		this.top = top;
	}

	/**
	 * this gets the height of a Cloud object
	 * 
	 * @return height of a cloud
	 */
	public float getHeight() {
		return top - bottom;
	}

	/**
	 * states that the cloud is raining
	 * 
	 * @return returns a String that said "It is raining"
	 */
	public String rain() {
		return "It is raining";
	}
}
