package exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) { // 타입 체크
			Dog dog = (Dog) animal; // ClassCastException 발생 가능
		}else {
			System.out.println("ClassCastException 발생");
		}
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
