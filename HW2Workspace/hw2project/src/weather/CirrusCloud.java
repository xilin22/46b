package weather;

public class CirrusCloud extends Cloud {

	/**
	 * ctor for creating cirrus clouds. it calls on the ctor of the its super class
	 * Cloud
	 * 
	 * @param top
	 *            how far up the cloud extends
	 * @param bottom
	 *            how far down the cloud extends
	 */
	public CirrusCloud(float top, float bottom) {
		super(top, bottom);
	}

	/**
	 * this overides the original rain method in the Cloud class so say that this
	 * cloud object cannot produce rain
	 * 
	 * @return states that the cloud cannot make rain
	 */
	public String rain() {
		return "I cannot make rain";
	}
}
