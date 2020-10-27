package packageex1;

public class Aclass1 {
	//필드
	Aclass1 a1 = new Aclass1(true);
	Aclass1 a2 = new Aclass1(1);
	Aclass1 a3 = new Aclass1("문자열");
	//생성자
	public Aclass1(boolean b) {}
	Aclass1(int b){}
	public Aclass1(String s) {}
}
//public: 모든 생성자 호출
//default: 동일 패키지내에서 private 제외하고 생성자 호출
//private : 동일 클래스내에서만 생성자 호출