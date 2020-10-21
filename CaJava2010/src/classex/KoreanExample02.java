package classex;

public class KoreanExample02 {

	public static void main(String[] args) {
		Korean02 k1 = new Korean02("홍길동", "011225-1234567");
		System.out.println("k1.n : " + k1.name);
		System.out.println("k1.s : " + k1.ssn);
		
		Korean02 k2 = new Korean02("홍길순", "930525-0654321");
		System.out.println("k2.n : " + k2.name);
		System.out.println("k2.s : " + k2.ssn);
		
		Korean02 k3 = new Korean02("홍길영", "861115-2654321");
		System.out.println("k3.n : " + k3.name);
		System.out.println("k3.s : " + k3.ssn);
	}

}
