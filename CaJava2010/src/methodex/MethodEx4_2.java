package methodex;

public class MethodEx4_2 {
	public void hap(int a, int b) {
		int result = a + b;
		System.out.println("합 :" + result);
	}

	public void hap(double a, double b) {
		double result = a + b;
		System.out.println("합 :" + result);
	}

	public void hap(double a, double b, double c) {
		double result = a + b + c;
		System.out.println("합 :" + result);
	}

	public void hap(double a, double b, double c, int d) { // (a+b+c)^d
		double result = 1;
		double sum = a + b + c;
		for (int i = 0; i < d; i++) {
			result *= sum;
		}
		System.out.println(a + "+" + b + "+" + c + "의 " + d + "제곱은 " + result);
	}

	public static void main(String[] args) {
		MethodEx4_2 me = new MethodEx4_2();
		me.hap(5, 2);
		me.hap(3, 7);
		me.hap(10.5, 4);
		me.hap(10.5, 4);
		me.hap(10, 4);
		me.hap(10.5, 4, 5);
		me.hap(10.5, 4, 5, 3);
	}

}
