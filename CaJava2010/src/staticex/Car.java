package staticex;

public class Car {
	static int speed;
	static void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	public static void main(String[] args) {
		Car.speed = 60;
		Car.run();
		
	}

}
