package staticex;

public class StaticEx10 {
	int age = 35;
	static String nation = "Korea";
	static String name = "임경빈";
	static String info;
	static double pi = 3.1415;
	static {
		info = name +"/"+nation;
		System.out.println("저는 대한민국 사람입니다.");
	}
	public static void main(String[] args) {
		System.out.println(StaticEx10.info);
		StaticEx10 st = new StaticEx10();
		System.out.println(st.age+"세");
		System.out.println("반지름이 10인 원의 원주 ="+2*StaticEx10.pi*10);
	}

}
