package staticex;

public class StaticEx81 {
	static String info ;
	static String name = "임경빈";
	static int age = 35;
	static String status = "single";
	static String address = "서울시 강동구";
	static double visionL = 0.5;
	static double visionR = 0.7;
	static {
		info = "["+name+"/"+age+"/"+status+"/"+address+"(시력 : "+visionL+", "+visionR+")]";
		System.out.println("이하가 본인의 정보입니다.");
	}
	
	public static void main(String[] args) {
		System.out.println(StaticEx81.info);
	}

}
