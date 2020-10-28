package abstractex;

public class Dog extends Animal{
	public Dog() {
		this.name = "퍼피";
	}
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	@Override
	public void sleep() {
		System.out.println("zzz");
	}
}
