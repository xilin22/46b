package weather;

import java.util.ArrayList;

public class Sky {
	private ArrayList<Cloud> clouds;

	/**
	 * This ctor initializes the private ArrayList<Cloud> clouds and gives it an
	 * initial capacity of 100
	 */
	public Sky() {
		clouds = new ArrayList<>(100);
	}

	/**
	 * this adds cloud objects to the ArrayList clouds
	 * 
	 * @param c
	 *            is the object youre adding to the clouds
	 * @return to show state that the clouds are added to the ArrayList
	 */
	public boolean add(Cloud c) {
		clouds.add(c);
		return true;
	}

	/**
	 * gets the average height for all the clouds in the ArrayList
	 * 
	 * @return the average height of the clouds in the ArrayList
	 */
	public float getMeanHeight() {
		float sumOfHeights = 0;
		for (int i = 0; i < clouds.size(); i++) {
			sumOfHeights += clouds.get(i).getHeight();
		}
		return sumOfHeights / clouds.size();
	}

	public static void main(String[] args) {
		StratusCloud strat = new StratusCloud(100, 1000);
		if (!strat.rain().startsWith("It is raining"))
			System.out.println("Bad StratusCloud::rain");
		CumulusCloud cumu = new CumulusCloud(200, 2000);
		if (!cumu.rain().startsWith("It is raining"))
			System.out.println("Bad CumulusCloud::rain");
		CirrusCloud cirr = new CirrusCloud(300, 3000);
		if (!cirr.rain().startsWith("I cannot make"))
			System.out.println("Bad CirrusCloud::rain");
		Sky sky = new Sky();
		sky.add(strat);
		sky.add(cumu);
		sky.add(cirr);
		float mean = sky.getMeanHeight();
		if (mean < 1799 || mean > 1801)
			System.out.println("Bad mean height: expected 1800, saw " + mean);
		System.out.println("Everything (else) is ok");
	}
}