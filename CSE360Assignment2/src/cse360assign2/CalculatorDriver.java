package cse360assign2;

public class CalculatorDriver
{

	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		
		calculator.add(2);
		calculator.add(4);
		calculator.subtract(1);
		calculator.multiply(2);
		calculator.divide(3);
		
		System.out.println(calculator.getTotal());
		System.out.println(calculator.getHistory());
	}

}
