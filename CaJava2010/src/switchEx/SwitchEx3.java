package switchEx;

public class SwitchEx3 {
	public static void main(String[] args) {
		String a = "일";
		switch(a) {
		case "일" : System.out.println("하나"); break;
		case "이" : System.out.println("둘"); break;
		case "삼" : System.out.println("셋"); break;
		default : System.out.println("숫자"); 
		}
	}
}
