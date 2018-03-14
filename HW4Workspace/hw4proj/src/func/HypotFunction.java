package func;

public class HypotFunction implements DoubleFunctionOfTwoInts{
	@Override
	public double fOfXY(int x, int y)
	{
		return Math.sqrt((x*x) + (y*y));
	}
	
	@Override
	public String getName()
	{
		return "Square root";
	}
}
