package weather;

public class StratusCloud extends Cloud {

	/**
	 * ctor for creating stratus clouds. it calls on the ctor of the its super class
	 * Cloud
	 * 
	 * @param top
	 *            how far up the cloud extends
	 * @param bottom
	 *            how far down the cloud extends
	 */
	public StratusCloud(float top, float bottom) {
		super(top, bottom);
	}

}
