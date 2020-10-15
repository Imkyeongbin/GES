package characterEx;

public class CharEx1 {

	public static void main(String[] args) {
		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch); // 아스키 코드 출력
		
		ch = 66;
		System.out.println(ch); // 정수값에 해당하는 문자 출력
		
		int ch2 = 67;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
//		int로 선언해서 D, M, O가 출력되게 해보세요.
		int ch3 = 68;
		int ch4 = 77;
		int ch5 = 79;
		System.out.println((char)ch3);
		System.out.println((char)ch4);
		System.out.println((char)ch5);
	}

}
