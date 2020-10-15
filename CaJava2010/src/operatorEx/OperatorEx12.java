package operatorEx;

public class OperatorEx12 {

	public static void main(String[] args) {
		try {
			int z = 5 / 0;
//			double z = 5 / 0.0;
//			double z = 5 % 0.0;
//			z = (int) (5 / 0.0);
			System.out.println(z);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
	}

}
