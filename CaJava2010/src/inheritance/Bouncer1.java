package inheritance;

public class Bouncer1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.setName("호랑이");
		System.out.println(tiger.name);
		tiger.bark();
		Lion lion = new Lion();
		lion.setName("사자");
		System.out.println(lion.name);
		lion.bark();
	}

}
