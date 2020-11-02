package polymorphism;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Animal animal = cat;
		
		if(cat == animal) {
			System.out.println("자동타입변환");
		}else {
			System.out.println(" ");
		}
	}

}
