package staticex;

public class StaticEx9 {
	static String nation = "Korea";
	String name = "Kevin";
	int age = 28;
	String status = "single";
	static public void printNation() {
		System.out.println(nation);
	}
	public void printOthers() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(status);
	}
	public static void main(String[] args) {
		StaticEx9 st1 = new StaticEx9();
		StaticEx9.printNation();
		st1.printOthers();
	}

}
