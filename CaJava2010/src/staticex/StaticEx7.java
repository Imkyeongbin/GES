package staticex;

public class StaticEx7 {
	static int i = 10;
	static {
		System.out.println("Static i="+ i++);
	}
	public static void main(String[] args) {
//		StaticEx7 st = new StaticEx7();
//		System.out.println("Main "+st.i);
		System.out.println("Main "+StaticEx7.i);
	}
}
