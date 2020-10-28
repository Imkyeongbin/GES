package abstractex;

public class Cat extends Animal{
	public Cat() {
		this.name = "kitty";
	}
	@Override
	public void sleep() {
		System.out.println("~~~");
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	 
}
