package func;

public class ComplexSquaredNormFunction implements DoubleFunctionOfTwoInts{
	@Override
	public double fOfXY(int x, int y)
	{
		return x * x + y * y;
	}
	
	@Override
	public String getName() {
		return "Complex Squared Norm";
	}
}
