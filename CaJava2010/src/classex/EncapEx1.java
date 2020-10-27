package classex;
class Encap1 {		// default
	private int a = 10;
	int b = 20;	//default
	protected int c = 30;
	public int d = 40;
	private int e = 50;

	public int getA() {
		return a;
	}
	int getE() {
		return e;
	}
}
class EncapEx1 {	// default

	public static void main(String[] args) {
		Encap1 ec1 = new Encap1(); // 객체 생성
//		System.out.println("a :" + ec1.a);
		System.out.println("b :" + ec1.b);
		System.out.println("c :" + ec1.c);
		System.out.println("d :" + ec1.d);
		System.out.println("a :" + ec1.getA());
		System.out.println("e :" + ec1.getE());
	}

}
