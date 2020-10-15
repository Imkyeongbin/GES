package operatorEx;

public class Homework2_3 {

	public static void main(String[] args) {
		try {
			int value1 = 10/0;
			System.out.println(value1);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}
		try {
			float value2 = 100/0.0f;
			System.out.println(value2);
		}catch(ArithmeticException e){
			System.out.println("0.0으로 나눌 수 없습니다.");
		}
		try {
			float value3 = 100 % 0.0f;
			System.out.println(value3);
		}catch(ArithmeticException e){
			System.out.println("0.0으로 나눌 수 없어 나머지가 없습니다.");
		}
	}

}
