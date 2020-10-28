package inheritance;

public class Dog1 extends Animal{
	public Dog1() {
		
	}
	public void sleep() {
		System.out.println(this.name+" zzz");
	}
	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		dog.setName("멍멍이");
		System.out.println(dog.name);
		dog.sleep();
	}

}
