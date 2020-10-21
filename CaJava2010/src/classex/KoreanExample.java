package classex;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "011225-1234567", "서울시 마포구", 30, "도적");
		System.out.println("k1.name : " + k1.name);
		System.out.println("k1.ssn : " + k1.ssn);
		System.out.println("k1.add : " + k1.add);
		System.out.println("k1.age : " + k1.age);
		System.out.println("k1.job : " + k1.job);
		
		Korean k2 = new Korean("홍길순", "930525-0654321", "서울시 강남구", 28, "프로그래머");
		System.out.println("k2.name : " + k2.name);
		System.out.println("k2.ssn : " + k2.ssn);
		System.out.println("k2.add : " + k2.add);
		System.out.println("k2.age : " + k2.age);
		System.out.println("k2.job : " + k2.job);
	}

}
