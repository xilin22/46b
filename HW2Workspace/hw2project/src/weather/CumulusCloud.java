package weather;

public class CumulusCloud extends Cloud {

	/**
	 * ctor for creating cumulus clouds. it calls on the ctor of the its super class
	 * Cloud
	 * 
	 * @param top
	 *            how far up the cloud extends
	 * @param bottom
	 *            how far down the cloud extends
	 */
	public CumulusCloud(float top, float bottom) {
		super(top, bottom);
	}
}
