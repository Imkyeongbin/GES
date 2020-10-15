package operatorEx;

public class OperatorEx4 {

	public static void main(String[] args) {
		byte b1 = 10;
		int b2 = ~b1;	//비트 연산자의 산출타입은 int
		int b3 = ~b1 + 1;
		System.out.println(b2);
		System.out.println(b3);
	}

}
