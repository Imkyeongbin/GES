package staticex;

public class StaticEx8 {
	static String info ;
	static String name = "kevin";
	static int age = 28;
	static String status = "single";
	static {
		info = name+"-"+age+"-"+status;
	}
	
	public static void main(String[] args) {
		System.out.println(StaticEx8.info);
	}

}
