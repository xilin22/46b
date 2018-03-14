package func;

public class MyCreativeFunction implements DoubleFunctionOfTwoInts{
	
	public double fOfXY(int x,int y)
	{
		return (2 * Math.sin(x) +  3 * Math.cos(y) ) * Math.sqrt(x * y % 2) + Math.tan(x + y) + Math.tan(x - y);
	}
	
	public String getName()
	{
		return "creativeFuncEC";
	}
}
