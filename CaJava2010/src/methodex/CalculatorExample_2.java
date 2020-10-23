package methodex;

public class CalculatorExample_2 {

	public static void main(String[] args) {
		Calculator_2 calculator_2 = new Calculator_2();
		calculator_2.powerOnOff();
		int result1 = calculator_2.result1();
		System.out.println("result1: " + result1);
		double result2 = calculator_2.result2();
		System.out.println("result2: " + result2);
		calculator_2.powerOnOff();
	}

}
