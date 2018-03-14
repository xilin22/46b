package func;

public class ModFunction implements DoubleFunctionOfTwoInts{
	@Override
	public double fOfXY(int x, int y) {
		
		//to prevent the error of % 0 if y is equal to 0
		if(y == 0)
			return 1;
		
		return x % y;
	}
	
	@Override
	public String getName()
	{
		return "Modulo";
	}
}
