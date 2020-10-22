package programEX2;

class Number{
	
	void printHelloWorld() {
		System.out.println("Hello World");
	}
	int hap(int a, int b) {
		return a+b;
	}
}
class Myself{
	int age;
	String hobby;
	void printHello(){
		System.out.println("안녕하세요, 임경빈입니다.");
	}
	Myself(int age){
		this(age, "게임");
	}
	Myself(int age, String hobby){
		this.age = age;
		this.hobby = hobby;
		
	}
}

public class SelfIntroduction {

	public static void main(String[] args) {
		Myself myself = new Myself(35);
		System.out.println("나이 : "+ myself.age);
		System.out.println("취미 : "+ myself.hobby);
		Myself myself2 = new Myself(35, "음악");
		myself2.printHello();
		System.out.println("나이 : "+ myself2.age);
		System.out.println("취미 : "+ myself2.hobby);
		Number calculate = new Number();
		calculate.printHelloWorld();
		System.out.println("35살에 1년이 지나면 "+calculate.hap(35, 1)+"살이 됩니다.");
		
	}

}
