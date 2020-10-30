package polymorphism;

public class PromotionEx01 {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		System.out.println("B객체를 A타입으로 변환: "+b.a);
		System.out.println("D객체를 B타입으로 변환: "+d.b);
		System.out.println("E객체를 C타입으로 변환: "+e.c);
	}

}
