package methodex;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator me = new Calculator();
		me.powerOn();
		System.out.println("result1: "+me.result1());
		System.out.println("result2: "+me.result2());
		me.powerOff();
	}

}
